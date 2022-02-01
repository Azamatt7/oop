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
        laptop.name = "MacBook Pro";
        laptop.brand = "Apple";
        laptop.screen = "Retina";
        laptop.colour = "Space Gray";
        laptop.weight = 1.2f;
        laptop.ram = 16;
        laptop.rom = 512;
        laptop.battrey = 20;

        Computer HP = new Computer();
        HP.name = "Pavillion";
        HP.brand = "HP";
        HP.screen = "LCD";
        HP.colour = "Silver";
        HP.weight = 1.8f;
        HP.ram = 8;
        HP.rom = 1000;
        HP.battrey = 12;


        Computer Asus = new Computer();
        Asus.name = "Predator";
        Asus.brand = "Asus";
        Asus.screen = "LCD";
        Asus.colour = "Black";
        Asus.weight = 2.2f;
        Asus.ram = 32;
        Asus.rom = 2000;
        Asus.battrey = 8;


        Computer Lenovo = new Computer();
        Lenovo.name = "Latitude";
        Lenovo.brand = "lenovo";
        Lenovo.screen = "LeD";
        Lenovo.colour = "Black";
        Lenovo.weight = 1.8f;
        Lenovo.ram = 12;
        Lenovo.rom = 500;
        Lenovo.battrey = 10;

        Computer Acer = new Computer();
        Acer.name = "Alien";
        Acer.brand = "Acer";
        Acer.screen = "LCD";
        Acer.colour = "Blue";
        Acer.weight = 2.0f;
        Acer.ram = 8;
        Acer.rom = 750;
        Acer.battrey = 9;


        laptop.Works();
        HP.Works();
        Asus.Works();
        Acer.Works();
        Lenovo.Works();

        laptop.switchOn();
        HP.switchOn();
        Asus.switchOn();
        Acer.switchOn();
        Lenovo.switchOn();

        laptop.switchingOff();
        HP.switchingOff();
        Asus.switchingOff();
        Acer.switchingOff();
        Lenovo.switchingOff();


        Peaksoft peaksoft = new Peaksoft();

        String[] rooms = {"FACEBOOK","APPLE","SPACEX","STARLINK","CAFETERIA"};
        peaksoft.rooms = rooms;

        peaksoft.showRooms();







    }
}
