package frc.robot.commands;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.FlushConstants;
import frc.robot.Robot;
import frc.robot.subsystems.Indexer;

public class FlushIndexerCommand extends CommandBase {
  private final Indexer m_indexer;
    public FlushIndexerCommand(Indexer subsystem) {

    m_indexer = subsystem;
    addRequirements(subsystem); // indexer is needed to intake the ball
  }

  public void initialize() {
    withTimeout(FlushConstants.FlushTime);
  }

  /*
   *execute() - intake power cell
   */
  public void execute() { m_indexer.flush(); }
  /*
   * isFinished
   */
  //public boolean isFinished() {
  //    return isTimedOut();
  //return false;

    protected void end() {
      Intake.stop();
  }
    protected void interrupted() {
  }
}
