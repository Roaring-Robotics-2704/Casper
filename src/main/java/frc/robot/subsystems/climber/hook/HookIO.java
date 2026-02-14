// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.climber.hook;

import static edu.wpi.first.units.Units.Amps;
import static edu.wpi.first.units.Units.Volts;

import edu.wpi.first.units.measure.MutCurrent;
import edu.wpi.first.units.measure.MutVoltage;
import edu.wpi.first.units.measure.Voltage;
import org.littletonrobotics.junction.AutoLog;

public interface HookIO {
  @AutoLog
  public static class HookIOInputs {
    MutVoltage hookVoltage = Volts.mutable(0);
    MutCurrent hookCurrent = Amps.mutable(0);
  }

  default void updateInputs(HookIOInputs inputs) {}

  default void setHookVoltage(Voltage voltage) {}
}
