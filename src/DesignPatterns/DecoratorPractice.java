package DesignPatterns;

public class DecoratorPractice {
    public static void main(String[] args) {
        Phone phone=new SmartPhone();
        System.out.println(phone.price());

        Phone smartPhoneWithCharger=new ExtraChargerToPhone(phone,10);
        System.out.println(smartPhoneWithCharger.price());
    }
}


interface Phone {
    double price();
}

class SmartPhone implements Phone {
    @Override
    public double price() {
        return 10000;
    }
}

abstract class PhoneDecorator implements Phone {

    Phone phone;

    PhoneDecorator(Phone p) {
        this.phone = p;
    }

    @Override
    public double price() {
        return phone.price();
    }
}

class ExtraChargerToPhone extends PhoneDecorator {

    double voltage;

    ExtraChargerToPhone(Phone p, double voltage) {
        super(p);
        this.voltage=voltage;
    }

    @Override
    public double price() {
        return super.price() + (voltage * 10);
    }
}