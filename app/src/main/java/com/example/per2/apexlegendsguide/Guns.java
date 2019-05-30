package com.example.per2.apexlegendsguide;

import java.util.Arrays;

public class Guns {

    public Gun[] guns;

    public Guns(Gun[] guns) {
        this.guns = guns;
    }

    public Gun[] getGuns() {
        return guns;
    }

    public void setGuns(Gun[] guns) {
        this.guns = guns;
    }

    @Override
    public String toString() {
        return "Guns{" +
                "guns=" + Arrays.toString(guns) +
                '}';
    }
}
