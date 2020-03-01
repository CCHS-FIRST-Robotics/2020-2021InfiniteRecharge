package frc.robot;

import frc.robot.Gains;


/**
 * Container for robot-wide constants
 *
 * Wherever needed, import the constants with
 * import static frc.robot.Constants.*
 */
public final class Constants {

    //OI
    public static int kXboxPort = 0;

    //Limit Switch Ports
    public static int kIntakeSwitchPort = 1;
    public static int kTowerTopSwitchPort  = 2;
    public static int kTowerBottomSwitchPort = 3;

    //Motor Controller CAN IDs
    public static int kLeftTalonID   = 1;
    public static int kLeftVictorID  = 2;
    public static int kRightTalonID  = 4;
    public static int kRightVictorID = 3;
    public static int kShooterTalonID = 8;
    public static int kShooterFollowerID = 4;
    public static int kIntakeTalonPort = 2;
    public static int kTowerTalonID  = 3;

    //window to check for the completion of ctre methods
    public static int kTimeoutMs = 30;

    //Motor Characteristics
    public static int maxDriveRPM = 567;
    public static int maxShooterRPM = 9450;
    public static double shootPower = 1.0;

    //max throttle change in a second
    public static double kThrottleSlewRate = 1.1;
    public static double kTurnSlewRate = 0.9;
    public static double kShooterSlewRate = 1.0;

    //PID Gains (to be tuned)
    //gearing on new robot is 8.46:1
    public static Gains leftDriveGains  = new Gains(0.3053, 0.3, 0, 0); 
    public static Gains rightDriveGains = new Gains(0.3053, 0.3, 0, 0);
    public static Gains shooterGains    = new Gains(0.0158, 0.7, 0, 0.022);
}
