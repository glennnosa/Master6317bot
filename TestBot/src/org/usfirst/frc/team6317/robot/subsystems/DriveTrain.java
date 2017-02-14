package org.usfirst.frc.team6317.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6317.robot.*;
import org.usfirst.frc.team6317.robot.commands.DefaultCommand;

public class DriveTrain extends Subsystem {
	
	public void initDefaultCommand(){
		this.setDefaultCommand(new DefaultCommand());
	}
	
	public void stop(){	//makes the robot stop
		RobotMap.leftDrive1.set(0);
		RobotMap.rightDrive1.set(0);
		RobotMap.leftDrive2.set(0);
		RobotMap.rightDrive2.set(0);
	}
	
	public void forward(){ // makes the robot drive forward
		RobotMap.leftDrive1.set(-1);
		RobotMap.rightDrive1.set(1);
		RobotMap.leftDrive2.set(-1);
		RobotMap.rightDrive2.set(1);
	}
	
	public void backward(){ //makes the robot drive backwards
		RobotMap.leftDrive1.set(1);
		RobotMap.rightDrive1.set(-1);
		RobotMap.leftDrive2.set(1);
		RobotMap.rightDrive2.set(-1);
	}
	
	public void left(){ //makes the left side drive forward
		RobotMap.leftDrive1.set(-1);
		RobotMap.rightDrive1.set(0);
		RobotMap.leftDrive2.set(-1);
		RobotMap.rightDrive2.set(0);
	}
	
	public void right(){ //makes the right side drive forward
		RobotMap.leftDrive1.set(0);
		RobotMap.rightDrive1.set(1);
		RobotMap.leftDrive2.set(0);
		RobotMap.rightDrive2.set(1);
	}
	
	public void clockwise(){ //makes the robot spin clockwise
		RobotMap.leftDrive1.set(-1);
		RobotMap.rightDrive1.set(-1);
		RobotMap.leftDrive2.set(-1);
		RobotMap.rightDrive2.set(-1);
	}
	
	public void counterClockwise(){ //makes the robot spin counter clockwise
		RobotMap.leftDrive1.set(1);
		RobotMap.rightDrive1.set(1);
		RobotMap.leftDrive2.set(1);
		RobotMap.rightDrive2.set(1);
	}
}
