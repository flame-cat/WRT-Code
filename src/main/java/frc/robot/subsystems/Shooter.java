// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot.subsystems;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import javax.annotation.OverridingMethodsMustInvokeSuper;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

public class Shooter extends SubsystemBase {
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Spark shooterTopMotor;
    private Spark shooterBottomMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public Shooter() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterTopMotor = new Spark(1);
        addChild("ShooterTopMotor",shooterTopMotor);
        shooterTopMotor.setInverted(false);

        shooterBottomMotor = new Spark(0);
        addChild("ShooterBottomMotor",shooterBottomMotor);
        shooterBottomMotor.setInverted(false);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // This method will be called once per scheduler run
    @Override
    public void periodic() {
        SmartDashboard.putNumber("Motor Speeds/Shooter 1 (Top)", shooterTopMotor.getSpeed());
        SmartDashboard.putNumber("Motor Speeds/Shooter 2 (Bottom)", shooterBottomMotor.getSpeed());
    }

    // This method will be called once per scheduler run when in simulation
    @Override
    public void simulationPeriodic() {
        SmartDashboard.putNumber("Motor Speeds/Shooter 1 (Top)", shooterTopMotor.getSpeed());
        SmartDashboard.putNumber("Motor Speeds/Shooter 2 (Bottom)", shooterBottomMotor.getSpeed());
    }
    
    /* Converts velocities to PWM values - Unused
    private double velocityToPWM(double velocity) {
        // Placeholder function; update after experimental testing
        double pwm = velocity / 100;
        return pwm;
    }

    public double pwmToVelocity(double pwm) {
        // Placeholder function; update after experimental testing
        double velocity = pwm * 100;
        return velocity;
    }
    */

    public double getTopMotorSpeed() {
        return shooterTopMotor.getSpeed();
    }

    public double getBottomMotorSpeed() {
        return shooterBottomMotor.getSpeed();
    }

    public void runTopMotor(double pwmInput) {
        shooterTopMotor.setSpeed(pwmInput);
    }

    public void runBottomMotor(double pwmInput) {
        shooterBottomMotor.setSpeed(pwmInput);
    }

    public void stopTopMotor() {
        shooterTopMotor.stopMotor();
    }

    public void stopBottomMotor() {
        shooterBottomMotor.stopMotor();
    }
}

