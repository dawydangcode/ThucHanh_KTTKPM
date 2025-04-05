package decorator;

public class Client {
    public static void main(String[] args) {
        // Cà phê cơ bản
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> Cost: " + coffee.cost());

        // Cà phê thêm sữa
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> Cost: " + coffee.cost());

        // Cà phê thêm sữa + đường
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> Cost: " + coffee.cost());
    }
}
