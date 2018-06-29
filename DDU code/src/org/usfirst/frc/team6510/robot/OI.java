/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6510.robot;

import org.usfirst.frc.team6510.robot.commands.IntakeCube;
import org.usfirst.frc.team6510.robot.commands.StopIntake;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static final XboxController j_driver = new XboxController(0);
	public static final XboxController j_operator = new XboxController(1);
	
	public OI() { 
		////////////////////////////////////////////////////////
		Button driver_a = new JoystickButton(j_driver, 1);    //
		Button driver_b = new JoystickButton(j_driver, 2);    // 
		Button driver_x = new JoystickButton(j_driver, 3);    //
		Button driver_y = new JoystickButton(j_driver, 4);    //	<-- Driver
		Button driver_r1 = new JoystickButton(j_driver, 5);   //
		Button driver_l1 = new JoystickButton(j_driver,6);    //
		//DRIVER BUTTONS									  //
		////////////////////////////////////////////////////////
		
		
		////////////////////////////////////////////////////////
		Button operator_a = new JoystickButton(j_operator,1); //
		Button operator_b = new JoystickButton(j_operator,2); //
		Button operator_x = new JoystickButton(j_operator,3); //
		Button operator_y = new JoystickButton(j_operator,4); //	<-- Operator
		Button operator_r1 = new JoystickButton(j_operator,5);//
		Button operator_l1 = new JoystickButton(j_operator,6);//
		//OPERATOR BUTTONS									  //
		////////////////////////////////////////////////////////
		operator_a.whenPressed(new IntakeCube());
		operator_a.whenReleased(new StopIntake());
	}
	public XboxController getJoystick() {
		return j_driver;
	}
}
