package frc.team1701.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {

    WPI_TalonSRX motor;
    Joystick thrust;

    @Override
    public void robotInit() {
        motor = new WPI_TalonSRX(7);
        thrust = new Joystick(1);
    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }

    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
        motor.set(-thrust.getRawAxis(1));
    }

    @Override
    public void testPeriodic() { }
}