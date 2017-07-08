package com.company;

public class lamp implements LAMPinterface {
    boolean powerOn = false;
    int brightness = 0;
    int armAngle = 90;

    // turns lamp state to on/off and sets brightness accordingly
    public void togglePower() {
        if (!powerOn) {
            powerOn = true;
            brightness = 1;
        }
        else {
            powerOn = false;
            brightness = 0;
        }
    }

    // increaes brightness value and sets lamp state to on if necessary
    public void increaseBrightness(int increment) {
        if(!powerOn) {                      // turns lamp on if it isn't already
            togglePower();
            brightness += increment - 1;
        }
        else {
            brightness += increment;        // just increments brightness if lamp is already on
        }
    }

    // decreases brightness and turns lamp off if brightness is 0 or less
    public void decreaseBrightness(int decrement) {
        brightness -= decrement;
        if (brightness <= 0) {
            togglePower();
        }
    }

    // changes angle of lamp arm, prevents user from angling arm beyond physical limitations
    public void changeArmAngle(int newAngle) {
        if (newAngle >= 135) {
            armAngle = 135;
        }
        else if (newAngle <= 0) {
            armAngle = 0;
        }
        else {
            armAngle = newAngle;
        }
    }
}
