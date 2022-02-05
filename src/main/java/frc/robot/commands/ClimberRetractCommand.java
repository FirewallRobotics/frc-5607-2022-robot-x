package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import java.lang.module.ModuleDescriptor.Requires;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class ClimberRetractCommand extends CommandBase {
    @Override
  public void initialize() {

  }

  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Climbing m_climbing;

  /**
   * Creates a new ClimberRetractCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ClimberRetractCommand(Climbing subsystem) {
    m_climbing = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }
@Override
public void execute() {
  //Write code for climbing here
  Climbing.ClimberRetractCommand();
}
@Override
public boolean isFinished() {
  return false;
}

@Override
public
 void end(boolean interrupted) {
  Climbing.ClimberStopCommand();
}
    
}
