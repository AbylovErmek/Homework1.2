package com.company;

import java.util.Arrays;

public class Transport extends Car{
    private int engine;
    private int disks;
    private Turbo turbo;

    public Transport(int glass, Color color, double volume, int engine, int disks, Turbo turbo) {
        super(glass, color, volume);
        this.engine = engine;
        this.disks = disks;
        this.turbo = turbo;
    }

    public int getEngine() {
        return engine;
    }

    public int getDisks() {
        return disks;
    }

    public Turbo getTurbo() {
        return turbo;
    }

    public void makeSignal(int number, String signal) {
        for (int i = 0; i < number; i++) {
            System.out.print(signal);
        }
    }

    public final void makeSignal(String signal) {
        System.out.println(signal);
    }

    public String getInfo() {
        return "\nEngine = " + engine + "\n---------------------" + "\nDisks = " + disks + "\nTurbo = "
                + turbo.getPower();
    }
}
