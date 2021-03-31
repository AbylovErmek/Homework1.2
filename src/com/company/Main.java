package com.company;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport(2,4,new Turbo(new String[]{"Fire"}));
        transport.makeVoice("Make voice = " + "Дрдрдрдрдрдрдр");
        System.out.println(transport.getInfo());

        Bus bus = new Bus(10,4,new Turbo(new String[]{"Nitrogen"}),"Волга",4,1);
        bus.makeVoice("Make voice = " + "Гргргргргргргргргр");
        System.out.println(bus.getInfo());

        Bus bus1 = new Bus(12,4,new Turbo(new String[]{"Helium"}),"Маз",4,2);
        bus1.makeVoice("Make voice = " + "Дурдурдурдур");
        System.out.println(bus1.getInfo());

    }
}
