package org.usfirst.frc.team6510.robot.commands;

import org.usfirst.frc.team6510.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ResetEncoders extends Command {

	private boolean status;
	private int count =0;
	
	public ResetEncoders() {
		requires(Robot.drivetrain);
	}
	
	protected void initialize() {
		Robot.drivetrain.resetEncoders();
		Robot.drivetrain.resetDriveTrain();
		System.out.print("RESET INITIALIZING, HUMAN RACE DEMISE NEARING");
		status = false;
	}
	
	protected void execute () {
		if(count ==10) {
			Robot.drivetrain.resetEncoders();
			count =0;
		}
		count++;
		status = Robot.drivetrain.hasResetOccurred();
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}
	
	protected void end() {
		System.out.print("RESET ENDED, HUMAN RACE SAFE");
	}
	protected void interrupted() {
	}

}
