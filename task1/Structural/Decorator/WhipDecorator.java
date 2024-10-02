package task1.Structural.Decorator;

public class WhipDecorator extends CoffeeDecorator {

    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.70; // Adds whip cost
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip";
    }
}
