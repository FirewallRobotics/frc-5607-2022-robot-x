package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.*;

/** An example command that uses an example subsystem. */
public class CancelDriveTrainCommand extends CommandBase {

  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  /**
   * Creates a new DrivingCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  private DriveTrain m_drivetrain;

  private Vision m_vision;

  public CancelDriveTrainCommand(DriveTrain dt_subsystem, Vision v_subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = dt_subsystem;
    m_vision = v_subsystem;
    addRequirements(dt_subsystem);
    addRequirements(v_subsystem);
  }

  @Override
  public void execute() {}

  public boolean isFinished() {
    return (false);
  }
}
