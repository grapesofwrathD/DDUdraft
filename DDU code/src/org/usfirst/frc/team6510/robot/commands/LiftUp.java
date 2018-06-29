package org.usfirst.frc.team6510.robot.commands;

import org.usfirst.frc.team6510.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftUp extends Command {
	
	public LiftUp() {
		requires(Robot.lift);
	}
	//////////////////////////////
	protected void initilize() {
		
	}
	//////////////////////////////
	protected void execute() {
		Robot.lift.liftUp(1);
	}
	/////////////////////////////
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	/////////////////////////////
	protected void end() {
	}
	/////////////////////////////
	protected void interrupted() {
	}

}
