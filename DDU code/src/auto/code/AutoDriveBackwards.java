package auto.code;

import org.usfirst.frc.team6510.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDriveBackwards extends Command {
	private double dist;
	private boolean status;
	
	public AutoDriveBackwards(double distance) {
		requires(Robot.drivetrain);
		dist = distance;
	}
	//called before the command runs the first time
	protected void initilize() {
		Robot.drivetrain.resetDriveTrain();
		status = false;
	}
	//called repeatedly when the command runs
	protected void execute() {
		double error = Robot.drivetrain.getAngle();
		double parameter = -0.03;
			
		if (dist > Math.abs(Robot.drivetrain.getLeftDistance()) && 	dist > Math.abs(Robot.drivetrain.getRightDistance())){
		Robot.drivetrain.drive.tankDrive(0.3 + (error*parameter), 0.3-(error*parameter));
		}
		else {
			Robot.drivetrain.stop();
			status = true;
		}
	}
		
//make this return true when execute is no longer needed to run
	@Override
	protected boolean isFinished() {
		return status;
	}
	// for after isFinished returns true
	protected void end() {
		Robot.drivetrain.stop();
	}
	//called when another command needs one or more of the same subsystems this one needs is scheduled to run
	protected void interrupted () {
		
	}

}
