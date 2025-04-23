package DesignPatterns;

public class Decorator2 {
    public static void main(String[] args) {

        Tea normal = new NormalTea(10);
        System.out.println(normal.price());
        System.out.println(normal.description());
        Tea teaWithHalfLiter = new ExtraMilk(normal,500,40);
        System.out.println(teaWithHalfLiter.price());
        System.out.println(teaWithHalfLiter.description());
    }
}


interface Tea {
    double price();

    String description();
}

class NormalTea implements Tea {
    private final double price;

    NormalTea(double price) {
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String description() {
        return "Normal Tea";
    }
}

abstract class TeaDecorator implements Tea {

    Tea tea;

    TeaDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public double price() {
        return tea.price();
    }

    @Override
    public String description() {
        return tea.description();
    }
}

class ExtraMilk extends TeaDecorator {

    private final int extraMilkQuantityInMl;

    private final double extraMilkPrice;

    ExtraMilk(Tea tea, int extraMilkQuantity, double extraMilkPrice) {
        super(tea);
        this.extraMilkPrice = extraMilkPrice;
        this.extraMilkQuantityInMl = extraMilkQuantity;
    }

    @Override
    public double price() {
        return super.price() + ((extraMilkQuantityInMl / 1000.0) * extraMilkPrice);
    }

    @Override
    public String description() {
        return super.description()+" With Extra Milk";
    }
}