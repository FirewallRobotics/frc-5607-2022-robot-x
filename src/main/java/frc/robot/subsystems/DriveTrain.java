// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/** */
public class DriveTrain extends SubsystemBase {

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
  public CANSparkMax sparkMaxLF;
  public CANSparkMax sparkMaxLB;
  public CANSparkMax sparkMaxRF;
  public CANSparkMax sparkMaxRB;
  public SlewRateLimiter xfilter = new SlewRateLimiter(0.5);
  public SlewRateLimiter yfilter = new SlewRateLimiter(0.5);
  private static MecanumDrive mecanumDrive;
  private static Gyro m_gyro = new ADXRS450_Gyro();
  // private final MecanumDriveOdometry m_Odometry;

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  /** */
  public DriveTrain() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    CANSparkMax sparkMaxLF =
        new CANSparkMax(DriveConstants.kFrontLeftDriveTrain, MotorType.kBrushless);

    CANSparkMax sparkMaxLB =
        new CANSparkMax(DriveConstants.kBackLeftDriveTrain, MotorType.kBrushless);

    CANSparkMax sparkMaxRF =
        new CANSparkMax(DriveConstants.kFrontRightDriveTrain, MotorType.kBrushless);

    CANSparkMax sparkMaxRB =
        new CANSparkMax(DriveConstants.kBackRightDriveTrain, MotorType.kBrushless);

    mecanumDrive = new MecanumDrive(sparkMaxLF, sparkMaxLB, sparkMaxRF, sparkMaxRB);
    sparkMaxLF.restoreFactoryDefaults();
    sparkMaxLB.restoreFactoryDefaults();
    sparkMaxRF.restoreFactoryDefaults();
    sparkMaxRB.restoreFactoryDefaults();
    // sparkMaxLB.setInverted(true);
    sparkMaxRB.setInverted(true);
    sparkMaxRF.setInverted(true);
    // sparkMaxRF.setInverted(true);
    addChild("Mecanum Drive", mecanumDrive);
    mecanumDrive.setSafetyEnabled(true);
    mecanumDrive.setExpiration(0.1);
    // mecanumDrive.setDeadband(0.15);
    // mecanumDrive.setMaxOutput(DriveConstants.DriveTrainSpeedMultiplier);
    mecanumDrive.setMaxOutput(1.0);

    // resetEncoders();
    // m_odometry = new MecanumDriveOdometry(m_gyro.getRotation2d());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    // m_odometry.update(
    //   m_gyro.getRotation2d(), m_leftEncoder.getDistance(), m_rightEncoder.getDistance());
    //   SmartDashboard.putNumber("goalScaledX", goalScaledX);
    //   SmartDashboard.putNumber("goalScaledRadius",goalScaledRadius);
    //   SmartDashboard.putNumber("ScaledX", ScaledX);
    //   SmartDashboard.putNumber("ScaledRadius",ScaledRadius);
    //   SmartDashboard.putNumber("LeftMaster",leftMaster.getStatorCurrent());
    //   SmartDashboard.putNumber("RightMaster",rightMaster.getStatorCurrent());
  }

  public void zeroHeading() {
    m_gyro.reset();
  }

  public double getHeading() {
    return m_gyro.getAngle();
  }

  public double getTurnRate() {
    return -m_gyro.getRate();
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run when in simulation

  }

  // Put methods for controlling this subsystem
  // here. Call these from Cnommands.
  public void Drive(double ySpeed, double xSpeed, double zRotation) {
    double y = 0; // variable for forward/backward movement
    double x = 0; // variable for side to side movement
    double turn = 0; // variable for turning movement
    double deadzone = 0.15;

    if (ySpeed > deadzone || ySpeed < -deadzone) {
      y = ySpeed;
    }

    if (xSpeed > deadzone || xSpeed < -deadzone) {
      x = xSpeed;
    }

    if (zRotation > deadzone || zRotation < -deadzone) {
      turn = zRotation;
    }
    mecanumDrive.driveCartesian(
        DriveConstants.DriveTrainSpeedMultiplier * y,
        DriveConstants.DriveTrainSpeedMultiplier * x,
        DriveConstants.DriveTrainTurnSpeedMultiplier * turn);
    //  getHeading();
  }

  // public static void driveToPowerCell() {
  //   double X = Math.round(x.getDouble(-1));
  //   double Radius = Math.round(radius.getDouble(-1));
  //   if (X == -1) {
  //       ScaledX = 0;
  //       ScaledRadius = 0;
  //   } else {
  //       ScaledX = PGainX * ((((Maxx - Minx) * ((X - MinX) / (MaxX - MinX))) + Minx) -
  // NeutralOffSetX);
  //       ScaledRadius =  PGainR * ((((MaxOutR - MinOutR)*((Radius - MinRadius)/(MaxRadius -
  // MinRadius))) + MinOutR) -  NeutralOffSetR);
  //   }

  //   Double LeftSpeed = (ScaledRadius +  ScaledX);
  //   Double RightSpeed = -(ScaledRadius -  ScaledX);
  //   //System.out.println("ScaledX: "+ ScaledX + " ScaledRadius: " + ScaledRadius);
  //   //System.out.println("LeftSpeed: "+ LeftSpeed + " RightSpeed: " + RightSpeed);
  //   leftMaster.set(ControlMode.PercentOutput,  RightSpeed);
  //   rightMaster.set(ControlMode.PercentOutput, LeftSpeed);

}
