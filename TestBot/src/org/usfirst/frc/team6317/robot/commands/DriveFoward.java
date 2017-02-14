package org.usfirst.frc.team6317.robot.commands;

import org.usfirst.frc.team6317.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class DriveFoward extends Command {
	public int dt;
	
	public DriveFoward(int driveTime){
		this.requires(Robot.DriveTrain);
		dt = driveTime;
	}
	
	protected void initialize(){
	}
	
	protected void execute(){
		Robot.DriveTrain.forward();
		setTimeout(dt);
	}
	
	@Override
	protected boolean isFinished(){
		return false;
	}
	
	protected void end(){
		Robot.DriveTrain.stop();
	}
	
	protected void interupted(){
		
	}
}
