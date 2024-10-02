package task1.Structural.Decorator;


public class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 2.00;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
