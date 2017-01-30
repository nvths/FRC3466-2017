package org.usfirst.frc.team3466.robot.subsystems;

import org.usfirst.frc.team3466.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CaptainHook extends Subsystem {
    private SpeedController hookMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public CaptainHook(){
    	super();
    	hookMotor = new Spark(RobotMap.captainHookPort);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void hookIt(){
    	hookMotor.set(1);
    }
    public void stopHookingIt(){
    	hookMotor.set(0);
    }
}

