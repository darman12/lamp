package com.company;

public class Main {

    public static void main(String[] args) {
        window bottomWindow = new window();
        bottomWindow.openOrClose();

        lamp funLamp = new lamp();
        funLamp.togglePower();
        System.out.println("Brightness: " + funLamp.brightness + "\nPower on? " + funLamp.powerOn);

        funLamp.togglePower();
        System.out.println("Brightness: " + funLamp.brightness + "\nPower on? " + funLamp.powerOn);

        funLamp.increaseBrightness(5);
        System.out.println("Brightness: " + funLamp.brightness + "\nPower on? " + funLamp.powerOn);

        funLamp.decreaseBrightness(11);
        System.out.println("Brightness: " + funLamp.brightness + "\nPower on? " + funLamp.powerOn);

        funLamp.changeArmAngle(45);
        System.out.println("Brightness: " + funLamp.brightness + "\nPower on? " + funLamp.powerOn + "\nArm angle: " +
        funLamp.armAngle);
    }
}
