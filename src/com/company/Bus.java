package com.company;

import java.util.Arrays;

public final class Bus extends Transport {
    private String name;
    private int wheel;
    private int trunk;

    public Bus(int glass, Color color, double volume, int engine, int disks, Turbo turbo, String name, int wheel, int trunk) {
        super(glass, color, volume, engine, disks, turbo);
        this.name = name;
        this.wheel = wheel;
        this.trunk = trunk;
    }

    public String getName() {
        return name;
    }

    public int getWheel() {
        return wheel;
    }

    public int getTrunk() {
        return trunk;
    }

    @Override
    public void makeSignal(int number, String signal) {
        super.makeSignal(number, signal);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName = " + name + "\nWheel = " + wheel + "\nTrunk = " + trunk;
    }
}
