// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.climber;

import static edu.wpi.first.units.Units.Inches;

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.units.measure.Distance;

/** Add your docs here. */
public class ClimberConstants {
  public static final int CLIMBER_MOTOR_ID = 41;
  public static final int CLIMBER_STALL_CURRENT_LIMIT = 40;
  public static final int CLIMBER_FREE_CURRENT_LIMIT = 20;

  public static final Distance CLIMBER_PULLEY_CIRCUMFERENCE =
      Inches.of(3.0 * Math.PI); // Assuming a 3 inch diameter pulley
  public static final double CLIMBER_GEARING = 45.0; // 45:1 gear reduction

  public static final int HOOK_MOTOR_ID = 42;
  public static final int HOOK_STALL_CURRENT_LIMIT = 30;
  public static final int HOOK_FREE_CURRENT_LIMIT = 15;

  public static final DCMotor CLIMBER_MOTOR_TYPE = DCMotor.getNEO(1);
  public static final DCMotor HOOK_MOTOR_TYPE = DCMotor.getNeo550(1);

  public static final Distance MAX_CLIMBER_HEIGHT =
      Inches.of(24); // Maximum height the climber can reach
  public static final Distance MIN_CLIMBER_HEIGHT =
      Inches.of(0); // Minimum height the climber can reach
  public static final Distance MID_CLIMBER_HEIGHT = Inches.of(12); // Middle height of the climber
  public static final Distance CLIMBER_TOLERANCE =
      Inches.of(0.5); // Tolerance for reaching target heights
}
