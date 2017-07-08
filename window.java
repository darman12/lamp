package com.company;

/**
 * Created by Spencer Freebairn on 5/27/17
 */
public class window implements WINDOWinterface {
    boolean open = false;
    String color = "white";

    public void openOrClose() {
        if (!open) {
            open = true;
        }
        else {
            open = false;
        }
    }

    public void paint(String newColor) {
        color = newColor;
    }

}
