// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.shooter;

import static frc.robot.subsystems.shooter.ShooterConstants.LEFT_MOTOR_ID;
import static frc.robot.subsystems.shooter.ShooterConstants.RIGHT_MOTOR_ID;

import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

  public class ShooterInputs {}

  private final SparkMax leftMotor;
  private final SparkMax rightMotor;

  /** Creates a new Shooter. */
  public Shooter() {
    leftMotor = new SparkMax(LEFT_MOTOR_ID, SparkMax.MotorType.kBrushless);
    rightMotor = new SparkMax(RIGHT_MOTOR_ID, SparkMax.MotorType.kBrushless);
  }

  public void updateInputs(ShooterInputs inputs) {}

  @Override
  public void periodic() {}
}
