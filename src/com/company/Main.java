package com.company;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport(3,Color.WHITE,5.0,4,4,new Turbo("Nitrogen"));
        transport.makeSignal(1,"Дрдрдрдрдрдрдр");
        System.out.println(transport.getInfo());

        Bus bus = new Bus(1,Color.BLACK,3.5,4,4,new Turbo("Fire"),
                "Волга",4,2);
        bus.makeSignal(1, "Гргргргргргргргргр");
        System.out.println(bus.getInfo());

        Bus bus1 = new Bus(3,Color.BLUE,2.2,4,4,new Turbo("Azot"),
                "Маз",4,3);
        bus1.makeSignal("Дрдрдрдрдрдрдрдрд");
        System.out.println(bus1.getInfo());

    }
}
