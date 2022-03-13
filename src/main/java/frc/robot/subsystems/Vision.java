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
import edu.wpi.first.wpilibj2.command.SubsystemBase;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/** */
public class Vision extends SubsystemBase {

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // These are all placeholder values "borrowed" from Willow with slight modification
  // Drive Train:

  public NetworkTableInstance inst = NetworkTableInstance.getDefault();
  public NetworkTable table = inst.getTable("cargoball");
  public NetworkTableEntry red_alliance = inst.getTable("FMSInfo").getEntry("IsRedAlliance");
  public NetworkTableEntry x_Red = table.getEntry("x_Red");
  public NetworkTableEntry y_Red = table.getEntry("y_Red");
  public NetworkTableEntry red_radius = table.getEntry("r_Red");
  public NetworkTableEntry x_Blue = table.getEntry("x_Blue");
  public NetworkTableEntry y_Blue = table.getEntry("y_Blue");
  public NetworkTableEntry blue_radius = table.getEntry("r_Blue");

  public NetworkTable hub = inst.getTable("hub");
  public NetworkTableEntry hubXmin = hub.getEntry("x_min");
  public NetworkTableEntry hubYmin = hub.getEntry("y_min");
  public NetworkTableEntry hubXmax = hub.getEntry("x_max");
  public NetworkTableEntry hubYmax = hub.getEntry("y_max");

  public double hubMaxRadius = 98;
  public double hubMinRadius = 5;
  public double hubMaxOutR = 1;
  public double hubMinOutR = -1;

  public double hubNeutralOffSetR = 0.23;
  public double hubPGainR = 0.250;
  public double hubMaxX = 150;
  public double hubMinX = 5;
  public double hubMaxx = 1;
  public double hubMinx = -1;
  public double hubNeutralOffSetX = 0;
  public double hubPGainX = 0.25;
  public double hubScaledX = 0;
  public double hubScaledRadius = 0;
  public double MaxRadius = 38;
  public double MinRadius = 7;
  public double MaxOutR = 1;
  public double NeutralOffSetR = 0.25;
  public double PGainR = 0.250;
  public double MaxX = 150;
  public double MinX = 5;
  public double Maxx = 1;
  public double Minx = -1;
  public double MinOutR = -1;

  // Comments from last year |
  //                        V
  // NeutralOffSetX - center of ball is at 937 / 1280 = 0.76 on the x axis when
  // robot is right on the ball.  640 / 1280 = 0.50 is straight in the middle.
  // 0.76 - 0.50 = 0.26.
  public double NeutralOffSetX = 0.26;
  public double PGainX = 0.25;
  public double ScaledX = 0;
  public double ScaledRadius = 0;

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  /** */
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
