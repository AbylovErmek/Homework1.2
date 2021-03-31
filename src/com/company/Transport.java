package com.company;

import java.util.Arrays;

public class Transport extends Car{
    private int engine;
    private int disks;
    private Turbo turbo;

    public Transport(int engine, int disks, Turbo turbo) {
        super(4, Color.WHITE,2.5);
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

    public void makeVoice(int number, String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public final void makeVoice(String voice) {
        System.out.println(voice);
    }

    public String getInfo() {
        return "Engine = " + engine + "\nDisks = " + disks + "\nTurbo = " + turbo.toString();
    }
}
