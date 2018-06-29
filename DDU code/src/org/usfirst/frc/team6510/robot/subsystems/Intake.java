package org.usfirst.frc.team6510.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
		public class Intake extends Subsystem {
 	public VictorSP left = new VictorSP(6);
 	public VictorSP right = new VictorSP(7);
 	
 	public Intake() {
 		right.setInverted(true);
 	}

 	public void intake(double speed) {
 		left.set(speed);
 		right.set(speed);
 	}
 	
 	public void deliver(double speed) {
 		left.set(-speed);
 		right.set(-speed);
 	}
 	
 	public void fix_left(double speed) {
 		left.set(speed);
 		right.set(-speed);
 	}
 	
 	public void fix_right(double speed) {
 		left.set(-speed);
 		right.set(speed);
 	}
 	public void stop(double speed) {
 		left.set(speed);
 		right.set(speed);
 	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}