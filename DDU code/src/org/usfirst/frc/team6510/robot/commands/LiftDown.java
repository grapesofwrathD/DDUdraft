package org.usfirst.frc.team6510.robot.commands;

import org.usfirst.frc.team6510.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftDown extends Command {
	
	public LiftDown() {
		requires(Robot.lift);
	}
	/////////////////////////////////
	public void iniialize() {
	}
	/////////////////////////////////
	public void execute() {
		Robot.lift.liftDown(1);
	}
	/////////////////////////////////
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	/////////////////////////////////
	public void end() {
	}

}
