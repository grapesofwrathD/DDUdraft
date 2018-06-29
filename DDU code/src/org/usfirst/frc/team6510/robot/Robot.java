/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6510.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team6510.robot.subsystems.DriveTrain;
import org.usfirst.frc.team6510.robot.subsystems.Intake;
import org.usfirst.frc.team6510.robot.subsystems.Lift;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
	
	

	public static OI oi;
	public static DriveTrain drivetrain;
	public static Lift lift;
	public static Intake intake;
	
	@Override 
	public void robotInit() {
		intake = new Intake();
		lift = new Lift ();
		drivetrain = new DriveTrain();
		oi = new OI();
		
	}

	@Override
	public void autonomousInit() {
	}
	
	@Override
	public void autonomousPeriodic() {
		
	}
	
	@Override
	public void teleopInit() {
		
	}
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		log();
	}
	private void log() {
		drivetrain.log();
	}
}
