package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.ShooterConstants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Vision;
import frc.robot.commands.*;

public class AutoShootCommand extends SequentialCommandGroup {

  public AutoShootCommand() {
      sequence(new ShootingCargoCommand(RobotContainer.m_shooter));
      parallel(new FlushIndexerCommand(RobotContainer.m_intake));
      //addSequential(new NewDriveForwardCommand());
  }

 
}
