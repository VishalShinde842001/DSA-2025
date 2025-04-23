package DesignPatterns;

public class Decorator2 {
    public static void main(String[] args) {

        Tea normal = new NormalTea(10);
        System.out.println(normal.price());
        System.out.println(normal.description());
        Tea teaWithHalfLiter = new ExtraMilk(normal,500,40);
        System.out.println(teaWithHalfLiter.price());
        System.out.println(teaWithHalfLiter.description());

        Tea teaWithExtraSugarAnMilk=new ExtraSugar(teaWithHalfLiter,500,.04);
        System.out.println(teaWithExtraSugarAnMilk.price());
        System.out.println(teaWithExtraSugarAnMilk.description());

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

// ---- Concrete Decorator: ExtraSugar ----
 class ExtraSugar extends TeaDecorator {

    private final int extraSugarQuantityInGrams;
    private final double sugarPricePerGram;

    /**
     * @param tea                         the Tea to wrap
     * @param extraSugarQuantityInGrams  amount of sugar in grams
     * @param sugarPricePerGram          price for one gram of sugar
     */
    public ExtraSugar(Tea tea, int extraSugarQuantityInGrams, double sugarPricePerGram) {
        super(tea);
        this.extraSugarQuantityInGrams = extraSugarQuantityInGrams;
        this.sugarPricePerGram         = sugarPricePerGram;
    }

    @Override
    public double price() {
        double basePrice = super.price();  // price of the wrapped Tea
        double sugarCost = extraSugarQuantityInGrams * sugarPricePerGram;
        return basePrice + sugarCost;
    }

    @Override
    public String description() {
        return super.description()
                + " + Extra Sugar ("
                + extraSugarQuantityInGrams + "g)";
    }
}
