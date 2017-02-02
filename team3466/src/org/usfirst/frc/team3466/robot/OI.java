package org.usfirst.frc.team3466.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3466.robot.commands.ClimbRope;
import org.usfirst.frc.team3466.robot.commands.FuelAgitate;
import org.usfirst.frc.team3466.robot.commands.FuelDump;
import org.usfirst.frc.team3466.robot.commands.FuelShoot;
import org.usfirst.frc.team3466.robot.commands.FuelUp;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    public  Joystick stick = new Joystick(RobotMap.joystick);
    public  Button pitcherBtn = new JoystickButton(stick, RobotMap.pitcherBtn);
    public  Button agitatorBtn = new JoystickButton(stick, RobotMap.agitatorBtn);
    public  Button macaroniStickBtn = new JoystickButton(stick, RobotMap.macaroniStickBtn);
    public  Button captainHookBtn = new JoystickButton(stick, RobotMap.captainHookBtn);
    public  Button fuelDumperBtn = new JoystickButton(stick, RobotMap.dumpBtn);
    

	public OI(){
		
		pitcherBtn.whenPressed(new FuelShoot());
		agitatorBtn.whenPressed(new FuelAgitate());
		macaroniStickBtn.whenPressed(new FuelUp());		
		captainHookBtn.whenPressed(new ClimbRope());
		fuelDumperBtn.whenPressed(new FuelDump());
	}
    
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

