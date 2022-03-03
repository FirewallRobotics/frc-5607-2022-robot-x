package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.FlushConstants;
import frc.robot.subsystems.Indexer;

public class FlushIndexerCommand extends CommandBase {
  private final Indexer m_indexer;
    public FlushIndexerCommand(Indexer subsystem) {

    m_indexer = subsystem;
    addRequirements(subsystem); // indexer is needed to intake the ball
  }

  public void initialize() {
    //withTimeout(FlushConstants.FlushTime);
  }

  /*
   *execute() - intake power cell
   */
  public void execute() {
    Indexer.flush();
  }
  /*
   * isFinished
   */
  //public boolean isFinished() {
  //    return isTimedOut();
  //return false;

    protected void end() {
      Indexer.stop();
  }
    protected void interrupted() {
  }
}
