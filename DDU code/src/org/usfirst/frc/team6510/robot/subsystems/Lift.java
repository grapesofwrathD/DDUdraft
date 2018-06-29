package org.usfirst.frc.team6510.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift extends Subsystem {
	public WPI_VictorSPX Left = new WPI_VictorSPX(0);

	
	
	public SpeedControllerGroup Lift = new SpeedControllerGroup(Left);
	
	public Lift() {
		Left.setInverted(true);
	}

	public void liftUp(double speed ) {
		Left.set(speed);
	
	}
	
	public void liftDown(double speed)	{
		Left.set(-speed);
		
	}
			
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
	//for the buttons and stuff   public void lift(XboxController) {
		
	//}
	
}
