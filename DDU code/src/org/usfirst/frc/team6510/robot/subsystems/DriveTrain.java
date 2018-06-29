package org.usfirst.frc.team6510.robot.subsystems;

import org.usfirst.frc.team6510.robot.RobotMap;
import org.usfirst.frc.team6510.robot.commands.DriveWithJoysticks;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends Subsystem {
	
	public WPI_TalonSRX Left_F = new WPI_TalonSRX(0);
	public WPI_TalonSRX Left_R = new WPI_TalonSRX(1);
	public WPI_TalonSRX Right_F = new WPI_TalonSRX(2);
	public WPI_TalonSRX Right_R = new WPI_TalonSRX(3);
	private ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	
	public SpeedControllerGroup m_left = new SpeedControllerGroup(Left_F, Left_R);
	public SpeedControllerGroup m_right = new SpeedControllerGroup(Right_F, Right_R);
	
	
	public DifferentialDrive  drive = new DifferentialDrive(m_left, m_right);
	
	public DriveTrain() {
		Left_F.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		
		m_left.setInverted(true);
		m_right.setInverted(false);
		}
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoysticks());
		
		} 
	public void drive(double speed, double rotation) {
		drive.arcadeDrive(speed, rotation);
		}
	
	public void drive(XboxController stick) {
		drive(stick.getRawAxis(1), -stick.getRawAxis(4) * 0.8);
		}
	public void stop() {
		drive.arcadeDrive(0, 0);
		}
	public double getRightDistance() {
		double rightdist = Right_F.getSelectedSensorPosition(0)*RobotMap.distPulse;
		return rightdist;
		}
		public double getLeftDistance() {
		double leftdist = Left_F.getSelectedSensorPosition(0) *RobotMap.distPulse;
		return leftdist;
		}
		public double getAngle() {
		double angle = gyro.getAngle();
		return angle;
		}
		public void resetDriveTrain() {
		Right_F.setSelectedSensorPosition(0, 0, 0);
		Left_F.setSelectedSensorPosition(0, 0, 0);
		gyro.reset();
		}
		
		public void resetEncoders() {
			Right_F.setSelectedSensorPosition(0,0,10);
			Left_F.setSelectedSensorPosition(0,0,0);
		}
		
		public boolean hasResetOccurred() {
			boolean status = false;
			if (Right_F.getSelectedSensorPosition(0) == 0 && Left_F.getSelectedSensorPosition(0) == 0) {
				status = true;
			}
			return false;
			
		}

		public void log() {
			SmartDashboard.putNumber("Right distance", getRightDistance());
			SmartDashboard.putNumber("Left distance", getLeftDistance());
			SmartDashboard.putNumber("angle", getAngle());
		}
	//------------------------------------------------------------------------------\\
		
}
