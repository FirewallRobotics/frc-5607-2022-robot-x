// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: RobotContainer.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.FlushConstants;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import frc.robot.commands.*;
import frc.robot.subsystems.*;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
  // The robot's subsystems
  public final Vision m_vision = new Vision();
  public final Climbing m_climbing = new Climbing();
  public final Shooter m_shooter = new Shooter();
  public final Intake m_intake = new Intake();
  public final DriveTrain m_driveTrain = new DriveTrain();
  // public final Lights m_lights = new Lights();
  public final Indexer m_indexer = new Indexer();

  // Joysticks
  private final XboxController xboxController1 = new XboxController(1);
  public final Joystick Joystick1 = new Joystick(0);
  public final JoystickButton joystickButton1 = new JoystickButton(Joystick1, 1);
  public final JoystickButton joystickButton2 = new JoystickButton(Joystick1, 2);
  public final JoystickButton joystickButton3 = new JoystickButton(Joystick1, 3);
  public final JoystickButton joystickButton4 = new JoystickButton(Joystick1, 4);
  public final JoystickButton joystickButton5 = new JoystickButton(Joystick1, 5);
  public final JoystickButton joystickButton6 = new JoystickButton(Joystick1, 6);
  JoystickButton firstA = new JoystickButton(xboxController1, XboxController.Button.kA.value);
  JoystickButton firstB = new JoystickButton(xboxController1, XboxController.Button.kB.value);
  JoystickButton firstX = new JoystickButton(xboxController1, XboxController.Button.kX.value);
  JoystickButton firstY = new JoystickButton(xboxController1, XboxController.Button.kY.value);
  JoystickButton firstLB =
      new JoystickButton(xboxController1, XboxController.Button.kLeftBumper.value);
  JoystickButton firstRB =
      new JoystickButton(xboxController1, XboxController.Button.kRightBumper.value);

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  private RobotContainer() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Smartdashboard Subsystems

    // SmartDashboard Buttons
    // SmartDashboard.putData("Autonomous Command", new AutonomousCommand(m_driveTrain));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND
    m_driveTrain.setDefaultCommand(
        // Mecanum Drive with our joystick has funky mapping needs
        //  Joystick X axis -> Y
        //  Joystick (-)Y axis -> X,
        //  Joystick throttle -> Z
        //    Using the joystick ends up making sense with this. :-(
        new RunCommand(
            () -> m_driveTrain.Drive(-Joystick1.getY(), Joystick1.getX(), Joystick1.getThrottle()),
            m_driveTrain));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND

    // Configure autonomous sendable chooser
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.setDefaultOption(
        "Autonomous Shoot then Drive Back",
        /*new SequentialCommandGroup(
        new AutonomousShooterCommand(m_shooter)
            .alongWith(new FlushIndexerCommand(m_indexer))
            .withTimeout(1),
        new AutoDriveCommand(m_driveTrain).withTimeout(1)));*/
        new SequentialCommandGroup(
            new ParallelCommandGroup(
                new SequentialCommandGroup(
                    new WaitCommand(1), new FlushIndexerCommand(m_indexer).withTimeout(1)),
                new LowShootingCargoCommand(m_shooter).withTimeout(2)),
            new AutoDriveCommand(m_driveTrain).withTimeout(.75)));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.addOption(
        "Autonomous Drive Back only", new AutoDriveCommand(m_driveTrain).withTimeout(10));
    m_chooser.addOption(
        "Autonomous Drive Shoot only",
        new ShootingCargoCommand(m_shooter)
            .alongWith(new FlushIndexerCommand(m_indexer))
            .withTimeout(FlushConstants.flushTime));
    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    // new JoystickButton(Joystick1, Button.kA.value);

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
    // Create some buttons
    joystickButton1.whenPressed(
        new ParallelCommandGroup(
            new SequentialCommandGroup(
                new WaitCommand(1), new FlushIndexerCommand(m_indexer).withTimeout(1)),
            new ShootingCargoCommand(m_shooter).withTimeout(2)));
    // joystickButton1.whenReleased(new ShootingStopCommand(m_shooter));
    // joystickButton1.whenReleased(new StopIndexerCommand(m_indexer));
    // joystickButton1.whileHeld(new ShootingCargoCommand(m_shooter));
    // joystickButton1.whenReleased(new ShootingStopCommand(m_shooter));
    joystickButton2.whileHeld(
        new SequentialCommandGroup(
            new ExtendIntakeCommand(m_intake),
            new WaitCommand(.2),
            new IntakeCargoCommand(m_intake)));
    joystickButton2.whenReleased(new IntakeStopCommand(m_intake));
    // joystickButton3.whileHeld(new ClimberSemiExtendCommand(m_climbing));
    // joystickButton3.whenReleased(new ClimberStopCommand(m_climbing));
    joystickButton3.whenPressed(
        new ParallelCommandGroup(
            new SequentialCommandGroup(
                new WaitCommand(1), new FlushIndexerCommand(m_indexer).withTimeout(1)),
            new MidShootingCargoCommand(m_shooter).withTimeout(2)));
    joystickButton4.whileHeld(new ClimberFullExtendCommand(m_climbing));
    joystickButton4.whenReleased(new ClimberStopCommand(m_climbing));
    // joystickButton5.toggleWhenPressed(new AutoGoToCargoCommand(m_driveTrain, m_vision));
    joystickButton5.whenPressed(
        new ParallelCommandGroup(
            new SequentialCommandGroup(
                new WaitCommand(1), new FlushIndexerCommand(m_indexer).withTimeout(1)),
            new LowShootingCargoCommand(m_shooter).withTimeout(2)));
    joystickButton6.whileHeld(new ClimberRetractCommand(m_climbing));
    joystickButton6.whenReleased(new ClimberStopCommand(m_climbing));
    firstA.whenPressed(new ExtendIntakeCommand(m_intake));
    firstB.whenPressed(new RetractIntakeCommand(m_intake));
    // firstY.whileHeld(new LowShootingCargoCommand(m_shooter));
    // firstY.whenReleased(new ShootingStopCommand(m_shooter));
    firstY.whenPressed(new AutoShootCommand(m_driveTrain, m_vision));
    firstY.whenReleased(new CancelDriveTrainCommand(m_driveTrain, m_vision));
    firstLB.whileHeld(new FlushIndexerCommand(m_indexer));
    firstLB.whenReleased(new StopIndexerCommand(m_indexer));
    firstX.whenPressed(
        new SequentialCommandGroup(
            new AutoShootCommand(m_driveTrain, m_vision),
            new ShootingCargoCommand(m_shooter)
                .alongWith(new FlushIndexerCommand(m_indexer))
                .withTimeout(FlushConstants.flushTime)));
    firstRB.whenPressed(new AutoGoToCargoCommand(m_driveTrain, m_vision));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
  }

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
  public XboxController getXboxController1() {
    return xboxController1;
  }

  public Joystick getJoystick() {
    return Joystick1;
  }

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
}
