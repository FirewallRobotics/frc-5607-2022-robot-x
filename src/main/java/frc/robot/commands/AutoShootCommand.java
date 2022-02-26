package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotContainer;

public class AutoShootCommand extends SequentialCommandGroup {

  public AutoShootCommand() {
      sequence(new ShootingCargoCommand(RobotContainer.getInstance().m_shooter));
      parallel(new FlushIndexerCommand(RobotContainer.getInstance().m_intake));
      //addSequential(new NewDriveForwardCommand());
  }

 
}
