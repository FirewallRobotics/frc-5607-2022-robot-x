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

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import edu.wpi.first.wpilibj.DigitalInput;
//import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.PIDOutput;
//import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;
import frc.robot.Constants.IntakeConstants;
//import frc.robot.Robot;
//import frc.robot.commands.*;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Intake extends SubsystemBase {

  //private static Spark intakeMotor = new Spark(IntakeConstants.INTAKER_ADDRESS);
  private static WPI_VictorSPX intakeVictor = new WPI_VictorSPX(
    IntakeConstants.MoveBot
  );
  private static DoubleSolenoid firstSolenoid = Robot.firstSolenoid;
  private static DoubleSolenoid secondSolenoid = Robot.secondSolenoid;
  //public static DigitalInput intakeSwitch = new DigitalInput(
  //  IntakeConstants.INTAKER_SWITCH
  //);
  
  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  public Intake() {
    intakeVictor.set(0);
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
  }

  public void initDefaultCommand() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void periodic() {
    //SmartDashboard.putBoolean("IntakeSwitch.get", intakeSwitch.get());
    // Put code here to be run every loop

  }

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static void testMotors(double motorSpeed) {
    //spark.set(motorSpeed);
  }

  //public void intakePowerCell() {
  /*if (!intakeSwitch.get()){
            //intakeMotor.set(IntakeConstants.INTAKER_MOTOR_SPEED);
        }
        else{
            //intakeMotor.set(0);
        }*/
  //intakeMotor.set(motorSpeed);
  //}

  public void intakePowerCell() {
    //if (!intakeSwitch.get()){
    intakeVictor.set(0.5);
    //}
    //else{
    //    intakeMotor.set(0);
  }
  public void intakeStop() {
    intakeVictor.set(0);
  
  }
  public static void extendSolenoid() {
    firstSolenoid.set(DoubleSolenoid.Value.kReverse);
    secondSolenoid.set(DoubleSolenoid.Value.kReverse);
}
  public static void retractSolenoid() {
    firstSolenoid.set(DoubleSolenoid.Value.kForward);
    secondSolenoid.set(DoubleSolenoid.Value.kForward);
}
  {
    //if (intakeSwitch.get() == false);
    //intakeVictor.set(0);
  }

  //public static boolean getButtonState() {
  //  return (!intakeSwitch.get());
  //    return true;
  //}

  public static void stop() {
    intakeVictor.set(0);
  }

public static void flush() {
}

  //public boolean finished() {
  //  return getButtonState();
  //}
}
