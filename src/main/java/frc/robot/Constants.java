package frc.robot;

import frc.robot.custom.Gains;


/**
 * Container for robot-wide constants
 *
 * Wherever needed, import the constants with
 * import static frc.robot.Constants.*
 */
public final class Constants {

    //OI
    public static int kXboxPort = 0;
    public static int kMonkeyPort = 1;

    //Limit Switch Ports
    public static int kIntakeSwitchPort = 1;
    public static int kTowerTopSwitchPort  = 2;
    public static int kTowerBottomSwitchPort = 3;
    public static int kIntakePhotoPort = 2; //analog
    public static int kColorWheelSwitchPort = 0;

    //Motor Controller CAN IDs
    public static int kColorWheelTalonID = 7;
    public static int kShooterTalonID = 8;
    public static int kShooterFollowerID = 4;
    public static int kIntakeTalonPort = 2;
    public static int kTowerTalonID  = 3;
    
    public static final int rightTalonPort = 1;
    public static final int leftTalonPort  = 9;
    public static final int rightTalonFollowerPort = 6;
    public static final int leftVictorPort  = 2;

    //window to check for the completion of ctre methods
    public static int kTimeoutMs = 50;

    //Motor Characteristics
    public static int maxDriveRPM = 505;
    public static double maxShootRPM = 5710 * 0.86; //0.77 -> 0.85 -> 0.86
    public static int shooterTolerance = 250; 

    //Shooter Speeds (%max rpm)
    public static double zone1ShooterPercent = 1.0; //0.95
    public static double zone2ShooterPercent = 0.855; //0.83 -> 0.85 -> 0.86 -> 0.855 
    public static double zone3ShooterPercent = 0.89; //0.86 -> 0.87 -> 0.88 -> 0.89
    public static double zone4ShooterPercent = 0.98; //1.0

    //ramp nums
    public static double kThrottleSlewRate = 1.5;
    public static double kTurnSlewRate = 1.0;
    public static double kShooterSlewRate = 1.5;

    public static double kFlywheelRatio = 1 / 8;

    
    //PID Gains (to be tuned)
    //gearing on new robot is 8.46:1
    public static final Gains rightDriveGains = new Gains(0.294, 0.1, 0, 0);
    public static final Gains leftDriveGains = new Gains(0.297, 0.15, 0, 0);

    public static Gains shooterGains = new Gains(0.0201, 0.01, 0.0000017, 0.00000013);
}

