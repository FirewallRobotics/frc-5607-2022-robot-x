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

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import frc.robot.commands.*;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Vision extends SubsystemBase {

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  //These are all placeholder values "borrowed" from Willow with slight modification
  //Drive Train:
  
  public static NetworkTableInstance inst = NetworkTableInstance.getDefault();
  public static NetworkTable table = inst.getTable("cargoball");
  public static NetworkTableEntry x_Red = table.getEntry("X_Red");
  public static NetworkTableEntry y_Red = table.getEntry("Y_Red");
  public static NetworkTableEntry red_radius = table.getEntry("R_Red");
  public static NetworkTableEntry x_Blue = table.getEntry("X_Blue");
  public static NetworkTableEntry y_Blue = table.getEntry("Y_Blue");
  public static NetworkTableEntry blue_radius = table.getEntry("R_Blue");
 
  public static NetworkTable hub = inst.getTable("hub");
  public static NetworkTableEntry hubXmin = hub.getEntry("x_min");
  public static NetworkTableEntry hubYmin = hub.getEntry("y_min");
  public static NetworkTableEntry hubXmax = hub.getEntry("x_max");
  public static NetworkTableEntry hubYmax = hub.getEntry("y_max");

  public static double hubMaxRadius = 98;
  public static double hubMinRadius = 5;
  public static double hubMaxOutR = 1;
  public static double hubMinOutR = -1;

  public static double hubNeutralOffSetR = 0.23;
  public static double hubPGainR = 0.250;
  public static double hubMaxX = 150;
  public static double hubMinX = 5;
  public static double hubMaxx = 1;
  public static double hubMinx = -1;
  public static double hubNeutralOffSetX = 0;
  public static double hubPGainX = 0.25;
  public static double hubScaledX = 0;
  public static double hubScaledRadius = 0;
  public static double MaxRadius = 38;
  public static double MinRadius = 7;
  public static double MaxOutR = 1;
  public static double NeutralOffSetR = 0.25;
  public static double PGainR = 0.250;
  public static double MaxX = 150;
  public static double MinX = 5;
  public static double Maxx = 1;
  public static double Minx = -1;

  //Comments from last year |
  //                        V
  // NeutralOffSetX - center of ball is at 937 / 1280 = 0.76 on the x axis when
  // robot is right on the ball.  640 / 1280 = 0.50 is straight in the middle.
  // 0.76 - 0.50 = 0.26.
  public static double NeutralOffSetX = 0.26;
  public static double PGainX = 0.25;
  public static double ScaledX = 0;
  public static double ScaledRadius = 0;

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  /**
   *
   */
  public Vision() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run when in simulation

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

  }
}
