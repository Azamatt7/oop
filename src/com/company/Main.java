package com.company;

public class Main {
    public static void main(String[]args) {
//        Computer apple = new Computer();
//        apple.memory= 512;
//        apple.name = "MacBook Pro";
//        apple.battrey = 20;
//        apple.weight = 1.2f;
//        apple.colour = "Space Gray";
//        apple.screen = "IPS";
//
//
//        System.out.println(apple.memory);
//        System.out.println(apple.name);
//        System.out.println(apple.battrey);
//        System.out.println(apple.weight);
//        System.out.println(apple.colour);
//        System.out.println(apple.screen);


//        Person adilet = new Person();
//        adilet.name = "Adilet";
//        adilet.lastName = "Zhumakadyrov";
//        adilet.age = 17;
//        adilet.height = 1.82;
//        adilet.weight = 66;
//        adilet.gender = 'M';
//        adilet.colour = "white";
//        adilet.nationality = "Kyrgyz";
//        adilet.status = "single";
//        adilet.education = true;
//
//
//
//        Person maksat = new Person();
//        maksat.name = "Maksat";
//        maksat.lastName = "Maksatov";
//        maksat.age = 30;
//        maksat.height = 1.78;
//        maksat.weight = 75;
//        maksat.gender = 'M';
//        maksat.colour = "white";
//        maksat.nationality = "Kyrgyz";
//        maksat.status = "single";
//        maksat.education = true;
//
//
//
//        adilet.run();
//        maksat.run();
//
//        adilet.speak();
//        maksat.speak();



        Computer laptop = new Computer();
        laptop.setName("MacBook Pro");
        laptop.setBrand("Apple");
        laptop.setScreen("Retina");
        laptop.setColour("Space Gray");
        laptop.setWeight(1.2f);
        laptop.setRam(16);
        laptop.setRom(512);
        laptop.setBattery((byte)20);

        Computer HP = new Computer();
        HP.setName("Pavillion");
        HP.setBrand("HP");
        HP.setScreen("LCD");
        HP.setColour("Silver");
        HP.setWeight(1.8f);
        HP.setRam(8);
        HP.setRom(1000);
        HP.setBattery((byte)12);


        Computer Asus = new Computer();
        Asus.setName("Predator");
        Asus.setBrand("Asus");
        Asus.setScreen("LCD");
        Asus.setColour("Black");
        Asus.setWeight(2.2f);
        Asus.setRam(32);
        Asus.setRom(2000);
        Asus.setBattery((byte) 8);


        Computer Lenovo = new Computer();
        Lenovo.setName("Latitude");
        Lenovo.setBrand("lenovo");
        Lenovo.setScreen("LeD");
        Lenovo.setColour("Black");
        Lenovo.setWeight(1.8f);
        Lenovo.setRam(12);
        Lenovo.setRom(500);
        Lenovo.setBattery((byte)10);


        Lenovo.showInfo();
        HP.showInfo();
        Asus.showInfo();
        laptop.showInfo();


//
//        Peaksoft peaksoft = new Peaksoft();
//
//        String[] rooms = {"FACEBOOK","APPLE","SPACEX","STARLINK","CAFETERIA"};
//        peaksoft.rooms = rooms;
//
//        peaksoft.showRooms();



//        UchBurchtuk uchBurchtuk = new UchBurchtuk();
//        uchBurchtuk.a = 0;
//        uchBurchtuk.b = 10;
//        uchBurchtuk.c = 6;
//        uchBurchtuk.area();














    }
}
