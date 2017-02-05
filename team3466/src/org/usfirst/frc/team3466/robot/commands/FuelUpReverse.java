package org.usfirst.frc.team3466.robot.commands;

import org.usfirst.frc.team3466.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FuelUpReverse extends Command {

    public FuelUpReverse() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.fuelHandler);
        setTimeout(3);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.fuelHandler.reverseMacaroniStick();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();

    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
