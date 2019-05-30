package com.example.per2.apexlegendsguide;

import java.util.Arrays;

public class Legends {

    public Legend[] legends;

    public Legends(Legend[] legends) {
        this.legends = legends;
    }

    public Legend[] getLegends() {
        return legends;
    }

    public void setLegends(Legend[] legends) {
        this.legends = legends;
    }

    @Override
    public String toString() {
        return "Legends{" +
                "legends=" + Arrays.toString(legends) +
                '}';
    }
}
