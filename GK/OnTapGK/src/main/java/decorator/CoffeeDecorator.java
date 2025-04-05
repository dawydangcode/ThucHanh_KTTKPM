package decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee; // Giữ tham chiếu đến đối tượng gốc

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}
