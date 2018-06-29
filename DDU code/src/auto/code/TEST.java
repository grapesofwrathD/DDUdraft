package auto.code;

import org.usfirst.frc.team6510.robot.commands.DeliverCube;
import org.usfirst.frc.team6510.robot.commands.IntakeCube;
import org.usfirst.frc.team6510.robot.commands.ResetEncoders;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TEST extends CommandGroup {
	
	public TEST() {
		
		
	addSequential(new AutoDriveStraight(2));	//drive 2m forward or 2 rotations idk anymore
	addSequential(new ResetEncoders());		//this doesnt exist yet and im not bothered to make it and fix errors and stuff
	addSequential(new IntakeCube());			//eat da cube yall nom om nom
	addSequential(new AutoDriveBackwards(1.5)); //move back 1.5 thing-things
	addSequential(new ResetEncoders());		//same as before 
	addSequential(new AutoTurn(90)); 			// hopefully itll turn 90 degrees but i dont actually know whats gonna happen soo
	addSequential(new DeliverCube());			//this one will chuck it across the room 
	addSequential(new AutoDriveBackwards(2)); 	// take it back now y'all
	addSequential(new ResetEncoders());       // am i even bothered to type it agan
	addSequential(new AutoDriveStraight(0.5));	//drive towards 12o'clock
	addSequential(new ResetEncoders());		// how dont you get it yet
	

	}
	

}
