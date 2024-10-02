package task1.Structural.Decorator;


public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    // Constructor to set the component to be decorated
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost(); // Delegates to the component
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription(); // Delegates to the component
    }
}
