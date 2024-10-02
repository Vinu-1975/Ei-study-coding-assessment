package task1.Structural.Decorator;



public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.20; // Adds sugar cost
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}


