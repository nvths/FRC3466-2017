package org.usfirst.frc.team3466.robot.subsystems;

import org.usfirst.frc.team3466.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FuelHandler extends Subsystem {
    private SpeedController pitcherMotor;
    private SpeedController agitatorMotor;
    private SpeedController macaroniStickMotor;
    private SpeedController dumpFuelMotor;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public FuelHandler() {
		super();
		macaroniStickMotor = new Spark(RobotMap.macaroniStickPort);
		pitcherMotor = new Spark(RobotMap.pitcherPort);
		agitatorMotor = new Spark(RobotMap.agitatorPort);
	}
    public void initDefaultCommand() {}
    
    public void agitate(){
    	agitatorMotor.set(1);
    }
    public void reverseAgitator(){
    	agitatorMotor.set(-1);
    }
    public void pitch(){
    	pitcherMotor.set(1);
    }
    public void macaroniStick(){
    	macaroniStickMotor.set(1);
    }
    public void reverseMacaroniStick(){
    	macaroniStickMotor.set(-1);
    }
    public void dump(){
    	dumpFuelMotor.set(1);
    }
}