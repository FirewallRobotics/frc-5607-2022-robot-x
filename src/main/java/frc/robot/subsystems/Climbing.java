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

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimbingConstants;

// import frc.robot.commands.ClimberExtendCommand.java;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/** */
public class Climbing extends SubsystemBase {

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
  private WPI_TalonSRX talonSRXLC;
  private WPI_TalonSRX talonSRXRC;

  DigitalInput lowInput = new DigitalInput(ClimbingConstants.ClimberLowIn);
  DigitalOutput lowOutput = new DigitalOutput(ClimbingConstants.ClimberLowOut);
  // DigitalInput middleInput = new DigitalInput(ClimbingConstants.ClimberMidIn);
  // DigitalOutput middleOutput = new DigitalOutput(ClimbingConstants.ClimberMidOut);
  // DigitalInput highInput = new DigitalInput(ClimbingConstants.ClimberHighIn);
  // DigitalOutput highOutput = new DigitalOutput(ClimbingConstants.ClimberHighOut);

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  /** */
  public Climbing() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    talonSRXLC = new WPI_TalonSRX(ClimbingConstants.kLeftClimbing);
    talonSRXRC = new WPI_TalonSRX(ClimbingConstants.kRightClimbing);
    talonSRXLC.setNeutralMode(NeutralMode.Brake);
    talonSRXRC.setNeutralMode(NeutralMode.Brake);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // talonSRXRC = new WPI_TalonSRX(7);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putBoolean("low climber input", lowInput.get());
    // SmartDashboard.putBoolean("middle climber input", middleInput.get());
    // SmartDashboard.putBoolean("high climber input", highInput.get());
    SmartDashboard.putBoolean("low climber output", lowOutput.get());
    // SmartDashboard.putBoolean("middle climber output", middleOutput.get());
    // SmartDashboard.putBoolean("high climber output", highOutput.get());
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run when in simulation

  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  // Placeholder values used
  public void ClimberFullExtendCommand() {
    /*if (highInput.get() == true) { */
    talonSRXLC.set(.98);
    talonSRXRC.set(-ClimbingConstants.RaiseClimberSpeed);
    System.out.println("Extending Fully...");
    /*} else {
      talonSRXLC.set(0);
      talonSRXRC.set(0);
    } */
  }

  public void ClimberSemiExtendCommand() {
    /*if (middleInput.get() == true) { */
    talonSRXLC.set(ClimbingConstants.RaiseClimberSpeed);
    talonSRXRC.set(-ClimbingConstants.RaiseClimberSpeed);
    System.out.println("Extending Somewhat...");
    /*} else {
      talonSRXLC.set(0);
      talonSRXRC.set(0);
    } */
  }

  public void ClimberRetractCommand() {
    // if (lowInput.get() == false) {
    talonSRXLC.set(-ClimbingConstants.RetractClimberSpeed);
    talonSRXRC.set(ClimbingConstants.RetractClimberSpeed);
    // } else {
    // talonSRXLC.set(0);
    // talonSRXRC.set(0);
    // }
  }

  public void ClimberStopCommand() {
    talonSRXLC.set(0);
    talonSRXRC.set(0);
    System.out.println("Stopping...");
  }
}
