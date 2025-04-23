package DesignPatterns;

public class Decorator1 {

    public static void main(String[] args) {
        Laptop normalLaptop = new NormalLaptop(50000);

        System.out.println("Normal Laptop Price :" + normalLaptop.price());
        System.out.println(normalLaptop.description());
        Laptop laptopWithRAM = new ExtraRamWithLaptop(normalLaptop, 2, 2000);

        System.out.println("Normal Laptop With 2 GB Ram Price :" + laptopWithRAM.price());
        System.out.println(laptopWithRAM.description());


    }

}


interface Laptop {
    double price();

    String description();
}

class NormalLaptop implements Laptop {

    private double price;

    NormalLaptop(double price) {
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String description() {
        return "NormalLaptop ";
    }
}

abstract class LaptopDecorator implements Laptop {
    Laptop laptop;

    LaptopDecorator(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public double price() {
        return laptop.price();
    }

    @Override
    public String description() {
        return laptop.description();
    }
}

class ExtraRamWithLaptop extends LaptopDecorator {

    private final Integer ramQuantity;
    private final double ramPrice;

    ExtraRamWithLaptop(Laptop laptop, Integer ramQuantity, double ramPrice) {
        super(laptop);
        this.ramPrice = ramPrice;
        this.ramQuantity = ramQuantity;
    }

    @Override
    public double price() {
        return super.price() + (this.ramPrice * this.ramQuantity);
    }

    @Override
    public String description() {
        return super.description() + " " + this.ramQuantity + " Extra RAM ";
    }
}
