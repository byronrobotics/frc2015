package org.usfirst.frc.team4859.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4859.robot.commands.In;
import org.usfirst.frc.team4859.robot.commands.MotorOff;
import org.usfirst.frc.team4859.robot.commands.MotorOn;
import org.usfirst.frc.team4859.robot.commands.MotorReverse;
import org.usfirst.frc.team4859.robot.commands.Out;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
	//TESTING A CHANGE FROM ECLIPSE!!
    Joystick stick = new Joystick(0);
    Button motorOn = new JoystickButton(stick, 1);
    Button motorOff = new JoystickButton(stick, 2);
    Button motorReverse = new JoystickButton(stick,3);
    Button in = new JoystickButton(stick,11);
    Button out = new JoystickButton(stick,12);
    
    
    //Solenoid piston1extract = new Solenoid(1);
    //Solenoid piston1retract = new Solenoid(2);
    //Button piston1extract = new JoystickButton(stick,5);
    //Button piston1retract = new JoystickButton(stick,6);
   
   
    public OI(){
    	motorOn.whenPressed(new MotorOn());
        motorOff.whenPressed(new MotorOff());
        motorReverse.whenPressed(new MotorReverse());
        in.whenPressed(new In());
        out.whenPressed(new Out());
        //piston1extract.whenPressed(new Piston1Extract());
        //piston1retract.whenPressed(new Piston1Retract());
    }
    //motorOn.whenPressed(new MotorOn());
    //motorOff.whenPressed(new MotorOff());
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

