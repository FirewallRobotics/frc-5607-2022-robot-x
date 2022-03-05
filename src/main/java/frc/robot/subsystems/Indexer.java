// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IndexerConstants;

// import edu.wpi.first.wpilibj.PIDOutput;
// import edu.wpi.first.wpilibj.PIDSource;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/** */
public class Indexer extends SubsystemBase {
  // private static WPI_VictorSPX lowerIntake = new WPI_VictorSPX(IndexerConstants.firstIntake);
  private static WPI_VictorSPX upperIntake = new WPI_VictorSPX(IndexerConstants.secondIntake);
  // private static DigitalInput Button1 = new DigitalInput(RobotMap.INDEXER_SWITCH_1);
  // private static DigitalInput Button2 = new DigitalInput(RobotMap.INDEXER_SWITCH_2);
  // private static DigitalInput Button3 = new DigitalInput(RobotMap.INDEXER_SWITCH_3);
  public static boolean isFinished = false;
  public static int numberCellsInIndexer = 0;

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  public Indexer() {
    // lowerIntake.set(0);
    upperIntake.set(0);
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
  }

  @Override
  public void periodic() {
    // SmartDashboard.putBoolean("Button1.get", Button1.get());
    // SmartDashboard.putBoolean("Button2.get", Button2.get());
    // SmartDashboard.putBoolean("Button3.get", Button3.get());
    // Put code here to be run every loop

  }

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static void testMotors(double motorSpeed) {
    // lowerIntake.set(motorSpeed);
    upperIntake.set(motorSpeed);
  }
  // Index with no balls we are going to keep the conveyor running until we pick up a ball.
  // We will then read when the sensor is hit and stop the conveyor every time and repeat
  // until we go to shoot the balls. Intake proccess after intake will be automatic.
  public void index() {
    /*if (numberCellsInIndexer == 0 && Button1.get() == false){
        isFinished = true;
        numberCellsInIndexer = 1;
    }
    else if (numberCellsInIndexer == 1 && Button2.get() == false){
        isFinished = true;
        numberCellsInIndexer = 2;
    }
    else if (numberCellsInIndexer == 2 && Button3.get() == false){
        isFinished = true;
        numberCellsInIndexer = 3;
    }
    else {
        isFinished = false;
    } */
    if (isFinished == true) {
      // lowerIntake.set(0);
      upperIntake.set(0);
    } else {
      // lowerIntake.set(IndexerConstants.conveyerSpeed);
      upperIntake.set(IndexerConstants.upperSpeed);
    }
  }

  public static void flush() {
    // lowerIntake.set(IndexerConstants.conveyerSpeed);
    upperIntake.set(IndexerConstants.upperSpeed);
  }

  public static void flushRunLowerShooter() {}

  public static void stop() {
    // lowerIntake.set(0);
    upperIntake.set(0);
  }
}
