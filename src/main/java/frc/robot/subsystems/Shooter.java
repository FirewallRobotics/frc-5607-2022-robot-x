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

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//mport frc.robot.AS5600EncoderPwm;
import frc.robot.Constants.ShooterConstants;
import frc.robot.commands.*;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Shooter extends SubsystemBase {

  //private static WPI_TalonSRX Turret = new WPI_TalonSRX(ShooterConstants.TURRET_ADDRESS);
  private static CANSparkMax Shooter = new CANSparkMax(
    ShooterConstants.Shooter1,
    MotorType.kBrushless
  );
/*  private static DigitalOutput ledRing = new DigitalOutput(
    ShooterConstants.LedRelay
  );*/

  //private static WPI_TalonSRX Shooter2 = new WPI_TalonSRX(ShooterConstants.SECOND_SHOOTER_ADDRESS);
  //private final AS5600EncoderPwm encoder = new AS5600EncoderPwm(Turret.getSensorCollection());
  //private static DigitalOutput ledRing = new DigitalOutput(ShooterConstants.LED_RELAY_ADDRESS);
  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  /**
   *
   */
  public Shooter() {
    //Turret.configFactoryDefault();
    Shooter.restoreFactoryDefaults();
    //Shooter2.configFactoryDefault();

    //Turret.configSelectedFeedbackSensor(FeedbackDevice.PulseWidthEncodedPosition);
    //Shooter.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
    //Shooter.setNeutralMode(NeutralMode.Coast);
    // Shooter.setNeutralMode(NeutralMode.Coast);
    //Shooter2.follow(Shooter);
    //ledRing.set(false);
    /* Config sensor used for Primary PID [Velocity] */
    /*Shooter.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,
        ShooterConstants.kPIDLoopIdx, 
        ShooterConstants.kTimeoutMs); */

    /**
     * Phase sensor accordingly.
     * Positive Sensor Reading should match Green (blinking) Leds on Talon
     */
    //Shooter.setSensorPhase(true);

    /* Config the peak and nominal outputs */
    //Shooter.configNominalOutputForward(0, ShooterConstants.kTimeoutMs);
    //Shooter.configNominalOutputReverse(0, ShooterConstants.kTimeoutMs);
    //Shooter.configPeakOutputForward(1, ShooterConstants.kTimeoutMs);
    //Shooter.configPeakOutputReverse(-1, ShooterConstants.kTimeoutMs);

    /* Config the Velocity closed loop gains in slot0 */
    //Shooter.config_kF(ShooterConstants.kPIDLoopIdx, ShooterConstants.kF, ShooterConstants.kTimeoutMs);
    //Shooter.config_kP(ShooterConstants.kPIDLoopIdx, ShooterConstants.kP, ShooterConstants.kTimeoutMs);
    //Shooter.config_kI(ShooterConstants.kPIDLoopIdx, ShooterConstants.kI, ShooterConstants.kTimeoutMs);
    //Shooter.config_kD(ShooterConstants.kPIDLoopIdx, ShooterConstants.kD, ShooterConstants.kTimeoutMs);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //SmartDashboard.putNumber("Turret Encoder", getMeasurement());
    SmartDashboard.putNumber("Shooter Speed", getShooterSpeed());
    //SmartDashboard.putBoolean("ledRing.get", ledRing.get());
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run when in simulation

  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  double getShooterSpeed() {
    return Shooter.getEncoder().getVelocity();
  }
  //double getMeasurement() {
  //    return encoder.getPwmPosition();
  // }
}
