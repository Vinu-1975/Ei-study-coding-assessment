package task1.Structural.Decorator;


public class Main {
    public static void main(String[] args) {
        // Order coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " = $" + myCoffee.getCost());

        // Add milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " = $" + myCoffee.getCost());

        // Add sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " = $" + myCoffee.getCost());

        // Add whip
        myCoffee = new WhipDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " = $" + myCoffee.getCost());
    }
}

