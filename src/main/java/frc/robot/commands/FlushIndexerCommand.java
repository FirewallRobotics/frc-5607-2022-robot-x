package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;
import frc.robot.Constants.FlushConstants;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj.command.TimedCommand;

public class FlushIndexerCommand extends Command {

    public FlushIndexerCommand() {
        m_intake = subsystem;
        addRequirments(subsytem);// indexer is needed to intake the ball
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
    }

    protected void interrupted() {

    }
}