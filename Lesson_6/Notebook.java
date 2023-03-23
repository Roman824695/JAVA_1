package Lesson_6;

public class Notebook {
    String brand;
    String model;
    String color;
    String ram;
    String rom;

    

public Notebook(String brand, String model, String color, String ram, String rom){
    this.brand = brand;
    this.model = model;
    this.color = color; 
    this.ram = ram;
    this.rom = rom;


}
public String printInfo(){
    System.out.printf("Brand: %s, Model: %s, Color: %s, RAM: %s, ROM: %s", brand, model, color, ram, rom);
    return ".";
}
public String getBrand() {
    return brand;
}
public String getModel() {
    return model;
}

public String getColor() {
    return color;
}

public String getRam() {
    return ram;
}
public String getRom() {
    return rom;
}


}