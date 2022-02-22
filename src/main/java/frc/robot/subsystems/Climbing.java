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



import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimbingConstants;

//import frc.robot.commands.ClimberExtendCommand.java;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Climbing extends SubsystemBase {

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private static WPI_TalonSRX talonSRXLC;
private static WPI_TalonSRX talonSRXRC; 

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Climbing() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        talonSRXLC = new WPI_TalonSRX(ClimbingConstants.kLeftClimbing);
        talonSRXRC = new WPI_TalonSRX(ClimbingConstants.kRightClimbing);

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    //talonSRXRC = new WPI_TalonSRX(7);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        SmartDashboard.putBoolean("low climber input", lowInput.get());
        SmartDashboard.putBoolean("middle climber input", middleInput.get());
        SmartDashboard.putBoolean("high climber input", highInput.get());
        SmartDashboard.putBoolean("low climber output", lowOutput.get());
        SmartDashboard.putBoolean("middle climber output", middleOutput.get());
        SmartDashboard.putBoolean("high climber output", highOutput.get());
    
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    //Placeholder values used
    public static void ClimberExtendCommand() {
        talonSRXLC.set(.2);
        talonSRXRC.set(-.2);
        System.out.println("Extending...");
        
    }
    public static void ClimberRetractCommand() {
      if (lowInput.get() == false) {  
        talonSRXLC.set(-.2);
        talonSRXRC.set(.2);
      }
      else {
          talonSRXLC.set(0);
          talonSRXRC.set(0);
      }
    }
    public static void ClimberStopCommand() {
        talonSRXLC.set(0);
        talonSRXRC.set(0);
        System.out.println("Stopping...");
    }
}  

