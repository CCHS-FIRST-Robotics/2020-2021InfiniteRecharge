/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.shooter.RunFlywheels;
import frc.robot.commands.intake.BringUp;
import frc.robot.commands.intake.FeedBall;
import frc.robot.subsystems.*;


public class ShootBall extends SequentialCommandGroup {
  
  public ShootBall(Shooter shooter, Intake intake, double power) {
    super(
      new BringUp(intake),
      new RunFlywheels(shooter, power),
      new WaitCommand(0.6), //avoid tolerance skip on way up
      new FeedBall(intake)
    );
  }
}
