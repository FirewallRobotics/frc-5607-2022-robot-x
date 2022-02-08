package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.TimedCommand;
import frc.robot.Constants.FlushConstants;
import frc.robot.Robot;
import frc.robot.subsystems.Intake;

public class FlushIndexerCommand extends CommandBase {

  public FlushIndexerCommand() {
    m_intake = subsystem;
    addRequirments(subsytem); // indexer is needed to intake the ball
  }

  public void initialize() {
    withTimeout(FlushConstants.FlushTime);
  }

  /*
   *execute() - intake power cell
   */
  public void execute() {
    Intake.flush();
  }
  /*
   * isFinished
   */
  //public boolean isFinished() {
  //    return isTimedOut();
  //return false;
}
//protected void end() {
//    Intake.stop();
//}
//protected void interrupted() {
//}
