package frc.robot.commands;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;

/** Add your docs here. */
public interface TrobotAddressableLEDPattern {
  public void setLEDs(AddressableLEDBuffer buffer);

  default boolean isAnimated() {
    return false;
  }
}
