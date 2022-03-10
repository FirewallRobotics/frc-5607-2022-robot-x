package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.*;

public class AutoGoToCargoCommand extends CommandBase {

  private static final int MaxRadius = 0;
  private DriveTrain m_drivetrain;
  private Vision m_vision;
  private int x_Red;
  private int x_Blue;

  public AutoGoToCargoCommand(DriveTrain dt_subsystem, Vision v_subsystem) {
    m_drivetrain = dt_subsystem;
    m_vision = v_subsystem;
    addRequirements(dt_subsystem);
    addRequirements(v_subsystem);
  }

  // @Override
  // protected void initialize() {
  // }

  @Override
  public void execute() {
    boolean IsRedAlliance = m_vision.red_alliance.getBoolean(false);
    double x_Blue = Math.round(m_vision.x_Blue.getDouble(0));
    double blue_radius = Math.round(m_vision.blue_radius.getDouble(0));
    double x_Red = Math.round(m_vision.x_Red.getDouble(0));
    double red_radius = Math.round(m_vision.red_radius.getDouble(0));
    if (IsRedAlliance == false) {
      int center = 160;
      // double x_Red = Math.round(m_vision.x_Red.getDouble(-1));
      // double red_radius = Math.round(m_vision.red_radius.getDouble(-1));

      if (x_Blue == 0) {
        // ScaledX = 0;
        // red_radius = 0;
        blue_radius = 0;
      } else {
        // ScaledX = PGainX * ((((Maxx - Minx) * ((X - MinX) / (MaxX - MinX))) + Minx) -
        // NeutralOffSetX);
        m_vision.ScaledRadius =
            m_vision.PGainR
                    * ((((m_vision.MaxOutR - m_vision.MinOutR)
                            * (blue_radius - m_vision.MinRadius)
                            / (MaxRadius - m_vision.MinRadius)))
                        + m_vision.MinOutR)
                - m_vision.NeutralOffSetR;
      }
      if (x_Blue == center) {
        m_drivetrain.Drive(0.25, 0, 0);
      } else if (x_Blue < center) {
        m_drivetrain.Drive(0, -0.25, 0);
      } else if (x_Blue > center) {
        m_drivetrain.Drive(0, 0.25, 0);
      }
    } else {
      int center = 160;
      // double x_Red = Math.round(m_vision.x_Red.getDouble(-1));
      // double red_radius = Math.round(m_vision.red_radius.getDouble(-1));

      if (x_Red == 0) {
        // ScaledX = 0;
        // red_radius = 0;
        red_radius = 0;
      } else {
        // ScaledX = PGainX * ((((Maxx - Minx) * ((X - MinX) / (MaxX - MinX))) + Minx) -
        // NeutralOffSetX);
        m_vision.ScaledRadius =
            m_vision.PGainR
                    * ((((m_vision.MaxOutR - m_vision.MinOutR)
                            * (red_radius - m_vision.MinRadius)
                            / (MaxRadius - m_vision.MinRadius)))
                        + m_vision.MinOutR)
                - m_vision.NeutralOffSetR;
      }
      if (x_Red == center) {
        m_drivetrain.Drive(0.25, 0, 0);
      } else if (x_Red < center) {
        m_drivetrain.Drive(0, -0.25, 0);
      } else if (x_Red > center) {
        m_drivetrain.Drive(0, 0.25, 0);
      }
    }
  }

  @Override
  public boolean isFinished() {
    return (m_vision.ScaledRadius >= m_vision.MaxRadius);
  }
  // @Override
  // protected void end() {

  // }

  // break movements into moving right and left/up and down

  // find a way to slow down motors as the robot gets closer to the ball

}
