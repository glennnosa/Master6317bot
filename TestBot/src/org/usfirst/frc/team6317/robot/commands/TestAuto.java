package org.usfirst.frc.team6317.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TestAuto extends CommandGroup {
	
	public TestAuto(){
		addSequential(new DriveFoward(4));
	}

}
