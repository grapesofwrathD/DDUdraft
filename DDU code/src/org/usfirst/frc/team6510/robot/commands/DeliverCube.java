package org.usfirst.frc.team6510.robot.commands;

import org.usfirst.frc.team6510.robot.Robot;
import org.usfirst.frc.team6510.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class DeliverCube extends Command {
	
	public DeliverCube() {
		requires(Robot.intake);
	}
	
	public void initialize() {
		
	}
	///////////////////////////
	
	public void execute() {
		Robot.intake.intake(RobotMap.deliever_speed);
	}
	///////////////////////////
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	//////////////////////////
	public void end() {
	}
	//////////////////////////
	public void interrupted() {
	}
}
