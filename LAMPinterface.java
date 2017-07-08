package com.company;

/**
 * This is an interface for the class named "lamp"
 */
public interface LAMPinterface {
    boolean powerOn = false;
    int brightness = 0;
    int armAngle = 90;

    void togglePower();
    void increaseBrightness(int increment);
    void decreaseBrightness(int decrement);
    void changeArmAngle(int newAngle);
}
