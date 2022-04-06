// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public class Constants {

  public static final class DriveConstants {

    public static final int kFrontRightDriveTrain = 8;
    public static final int kBackRightDriveTrain = 7;
    public static final int kFrontLeftDriveTrain = 6;
    public static final int kBackLeftDriveTrain = 3;
    public static final double DriveTrainSpeedMultiplier = 1;
    public static final double DriveTrainTurnSpeedMultiplier = .7;
  }

  public static final class ClimbingConstants {

    public static final int kRightClimbing = 4;
    public static final int kLeftClimbing = 5;
    public static final int ClimberLowIn = 0;
    public static final int ClimberLowOut = 1;
    public static final int ClimberMidIn = 2;
    public static final int ClimberMidOut = 3;
    public static final int ClimberHighIn = 4;
    public static final int ClimberHighOut = 5;
    public static final double RaiseClimberSpeed = .9;
    public static final double RetractClimberSpeed = .9;
  }

  public static final class ShooterConstants {

    public static final int ShooterController1 = 10;
    public static final int ShooterController2 = 9;
    public static final int LedRelay = 1;
    public static final int autoShootTimeout = 2;
    public static final double ShooterStartSpeed = .85;
    public static final double LowShooterStartSpeed = 0.4;
    public static final double MidShooterStartSpeed = 0.7;
    public static final double AutoShooterStartSpeed = 0.68;
    public static final double ShooterStopSpeed = 0;
    public static final long CenterOfShootingFrame = 320;
    public static final long ShootingDistance = 8;
  }

  public static final class IntakeConstants {

    public static final int MoveBot = 11;
    public static final int SolenoidForwardChannel1 = 0;
    public static final int SolenoidReverseChannel1 = 1;
    public static final int SolenoidForwardChannel2 = 2;
    public static final int SolenoidReverseChannel2 = 3;
  }

  public static final class FlushConstants {

    public static final int flushTime = 1;
    public static final int autoShootTime = 3;
  }

  public static final class IndexerConstants {

    // public static final int firstIntake = 1;
    public static final int secondIntake = 2;
    public static final double conveyerSpeed = 0.2;
    public static final double upperSpeed = 0.3;
  }

  public static final class AutoDriveConstants {
    public static final double autoSpeed = 0.50;
  }
}
