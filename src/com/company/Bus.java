package com.company;

import java.util.Arrays;

public final class Bus extends Transport {
    private String name;
    private int wheel;
    private int trunk;

    public Bus(int engine, int disks, Turbo turbo, String name, int wheel, int trunk) {
        super(engine, disks, turbo);
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
    public void makeVoice(int number, String voice) {
        super.makeVoice(number, voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nName = " + name + "\nWheel = " + wheel + "\nTrunk = " + trunk +
                "\n_________________";
    }
}
