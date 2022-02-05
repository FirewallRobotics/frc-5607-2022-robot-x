package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.*;

/** An example command that uses an example subsystem. */
public class DrivingCommand extends CommandBase {

  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
  private final DriveTrain m_drive;

  /**
   * Creates a new DrivingCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DrivingCommand(DriveTrain subsystem) {
    m_drive = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  @Override
  public void execute() {
    DriveTrain.Drive(1, 1, 1);
  }
}
