package com.company;

 class Computer {

  private String brand;
  private String name;
  private int ram;
  private int rom;
  private String colour;
  private String screen;
  private float weight;
  private byte battery;


  public String getBrand() {
   return brand;
  }

  public void setBrand(String brand) {
   if (!brand.matches("[A-Za-z0-9]*")) {
    System.out.println("invalid laptop brand [" + brand + "]");
   } else {
    this.brand = brand;
   }
  }

  public String getName() {
   return name;
  }

  public void setName(String name) {
   if (!name.matches("[A-Za-z0-9]*")) {
    System.out.println("invalid laptop name [" + name + "]");
   } else {
    this.name = name;
   }
  }

  public int getRam() {
   return ram;
  }

  public void setRam(int ram) {
   if (ram < 0) {
    System.out.println("invalid ram [" + ram + "]");
   } else {
    this.ram = ram;
   }
  }

  public int getRom() {
   return rom;
  }

  public void setRom(int rom) {
   if (rom < 0) {
    System.out.println("invalid rom [" + rom + "]");
   } else {
    this.rom = rom;
   }
  }

  public String getColour() {
   return colour;
  }

  public void setColour(String colour) {
   if (!colour.matches("[A-Za-z0-9]*")) {
    System.out.println("invalid laptop colour [" + colour + "]");
   } else {
    this.colour = colour;
   }
  }

  public String getScreen() {
   return screen;
  }

  public void setScreen(String screen) {
   if (!screen.matches("[A-Za-z0-9]*")) {
    System.out.println("invalid laptop colour [" + colour + "]");
   } else {
    this.screen = screen;
   }
  }

  public float getWeight() {
   return weight;
  }

  public void setWeight(float weight) {
   if (weight < 0) {
    System.out.println("invalid weight [" + weight + "]");
   } else {
    this.weight = weight;
   }
  }

  public byte getBattery() {
   return battery;
  }

  public void setBattery(byte battery) {
   if (battery < 0) {
    System.out.println("invalid battery [" + battery + "]");
   } else {
    this.battery = battery;
   }
  }

   public void showInfo() {
    System.out.printf("Laptop info : \n" +
                    "Laptop brand : %s \n" +
                    "name : %s \n" +
                    "Ram : %d gb \n" +
                    "Rom : %d gb \n" +
                    "Colour : %s \n" +
                    "Screen : %s \n" +
                    "Weight : %f \n" +
                    "Battery : %d ",
            brand, name, ram, rom, colour, screen, weight, battery);

   }


}
