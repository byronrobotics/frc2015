package org.usfirst.frc.team4859.robot.subsystems;

import org.usfirst.frc.team4859.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *Court
 */
public class Chassis extends Subsystem {
	SpeedController leftMotor, rightMotor;
	
	public RobotDrive drive;
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public Chassis(){
    	leftMotor = new CANTalon(12);
    	rightMotor = new CANTalon(14);
    	
    }
    public void driveWithJoystick(Joystick left, Joystick right){
    	double leftSpeed = left.getY();
    	double rightSpeed = right.getY();
    	leftMotor.set(leftSpeed/2);
    	rightMotor.set(rightSpeed/2);
    	
    }
}

