package org.usfirst.frc.team4859.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Yes extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Solenoid piston1;
	Solenoid piston1R;
	
	
public Yes(){
	piston1 = new Solenoid(4);
	piston1R = new Solenoid(5);
}
	public void in(){
    	piston1.set(true);
    	piston1R.set(false);
    	SmartDashboard.putData("PistonData", piston1);
    	SmartDashboard.putString("TheInRoutine", "Programming");
	}
	public void out(){
		piston1.set(false);
		piston1R.set(true);
		SmartDashboard.putData("PistonData", piston1);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

