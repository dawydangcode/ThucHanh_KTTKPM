package state_pattern.order;

public class DeliveredState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already delivered. Cannot process further.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already delivered. Cannot ship again.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is already delivered.");
    }
}
