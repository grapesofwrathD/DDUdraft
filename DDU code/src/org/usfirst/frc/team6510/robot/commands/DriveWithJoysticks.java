package org.usfirst.frc.team6510.robot.commands;

import org.usfirst.frc.team6510.robot.OI;
import org.usfirst.frc.team6510.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoysticks extends Command {
	public DriveWithJoysticks() {
		requires(Robot.drivetrain);		
	}
@Override
protected void execute() {
	Robot.drivetrain.drive(OI.j_driver);
	
}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
protected void end() {
	// TODO Auto-generated method stub
	
}

}
