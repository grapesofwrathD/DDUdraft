package auto.code;
import org.usfirst.frc.team6510.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


	public class AutoTurn extends Command {
	private boolean status;
	private double ang;
 	public AutoTurn(double angle) {
	requires(Robot.drivetrain);
 	ang = angle;

 }
 	// Called just before this Command runs the first time
 	protected void initialize() {
	 Robot.drivetrain.resetDriveTrain();
 	status = false;
 }
 	// Called repeatedly when this Command is scheduled to run
 	protected void execute() {
	 if (ang > 0) {

	 if (ang > Robot.drivetrain.getAngle()) {

	if ((ang - Robot.drivetrain.getAngle()) < (ang * 0.5))
	Robot.drivetrain.drive.arcadeDrive(0, -0.6);
	else

	Robot.drivetrain.drive.arcadeDrive(0, -0.8);
	} else {

	Robot.drivetrain.stop();
	}
 } else if (ang < 0) {
	if (ang < Robot.drivetrain.getAngle()) {
	if ((ang + Math.abs(Robot.drivetrain.getAngle())) >
	(ang * 0.5))
	Robot.drivetrain.drive.arcadeDrive(0, 0.6);
	else
	Robot.drivetrain.drive.arcadeDrive(0, 0.8);
	}
	else {
	Robot.drivetrain.stop();
	status = true;
		}
	}
}
 	// Make this return true when this Command no longer needs to run execute()
 	protected boolean isFinished() {
	 return status;
 }
 	// Called once after isFinished returns true
 	protected void end() {
	 Robot.drivetrain.stop();
 }
 	// Called when another command which requires one or more of the same subsystems is scheduled to run
 	protected void interrupted() {
 }
 	
}