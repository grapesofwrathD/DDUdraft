package org.usfirst.frc.team6510.robot.commands;

import org.usfirst.frc.team6510.robot.Robot;
import org.usfirst.frc.team6510.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeCube extends Command {
	
	public IntakeCube(){
		requires(Robot.intake);
		
	}

	@Override
	protected void execute() {
		Robot.intake.intake(RobotMap.intake_speed);
	}
	
	@Override
	protected void end() {
		Robot.intake.stop(RobotMap.stop_intake);
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
