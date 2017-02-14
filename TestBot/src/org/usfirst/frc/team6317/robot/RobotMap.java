package org.usfirst.frc.team6317.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
	public static SpeedController leftDrive1 = new Victor(0);
	public static SpeedController leftDrive2 = new Victor(1);
	public static SpeedController rightDrive1 = new Victor(2);
	public static SpeedController rightDrive2 = new Victor(3);
	public static SpeedController intakeMotorBottom = new Victor(4);
	public static SpeedController intakeMotorTop = new Victor(5);
	public static SpeedController kickerMotor = new Victor(6);
	public static SpeedController shooterMotor = new Victor(7);
	public static SpeedController winchMotor = new Victor(8);
}
