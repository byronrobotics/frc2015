
package org.usfirst.frc.team4859.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CANTalon motor;
	CANTalon motor2;

	
	public ExampleSubsystem(){
		motor = new CANTalon(11);
		motor2 = new CANTalon(12);

		
	}
	
	public void on(){
		motor.set(SmartDashboard.getNumber("MotorSpeed",1.0));
		motor2.set(SmartDashboard.getNumber("MotorSpeed",1.0));
	}
	public void off(){
		motor.set(0.0);
		motor2.set(0.0);
		
	}
	public void reverse(){
		motor.set(-1.0);
		motor2.set(-1.0);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
}

