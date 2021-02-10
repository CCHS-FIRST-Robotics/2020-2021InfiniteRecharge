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
    public static int kMonkeyPort = 1;

    //Limit Switch Ports
    public static int kIntakeSwitchPort = 1;
    public static int kTowerTopSwitchPort  = 2;
    public static int kTowerBottomSwitchPort = 3;
    public static int kIntakePhotoPort = 2; //analog

    //Motor Controller CAN IDs
    public static int kColorWheelTalonID = 7;
    public static int kShooterTalonID = 8;
    public static int kShooterFollowerID = 4;
    public static int kIntakeTalonPort = 2;
    public static int kTowerTalonID  = 3;
    
    public static int kLeftTalonID   = 9;
    public static int kLeftFollowerID  = 2;
    public static int kRightTalonID  = 6;
    public static int kRightFollowerID = 1;

    //switch ports
    public static int kColorWheelSwitchPort = 0;

    //window to check for the completion of ctre methods
    public static int kTimeoutMs = 30;

    //Motor Characteristics
    public static int maxDriveRPM = 567;
    public static int maxShootRPM = 500; //UNTESTED //UNTESTED
    public static int shootVelocityThreshold = 39000; //ticks per 100ms

    //max throttle change in a second
    public static double kThrottleSlewRate = 1.3;
    public static double kTurnSlewRate = 0.9;
    public static double kShooterSlewRate = 1.0;

    public static double kFlywheelRatio = 1 / 8;

    
    //PID Gains (to be tuned)
    //gearing on new robot is 8.46:1
    public static Gains leftDriveGains  = new Gains(0.2643, 0, 0, 0); 
    public static Gains rightDriveGains = new Gains(0.2643, 0, 0, 0);

    public static Gains leftPosGains = new Gains(0, 0.07, 0, 0);
    public static Gains rightPosGains = new Gains(0, 0.07, 0, 0);

    public static Gains shooterGains = new Gains(0, 0, 0, 0);
}
