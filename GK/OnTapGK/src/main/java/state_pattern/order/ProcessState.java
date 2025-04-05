package state_pattern.order;

public class ProcessState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already being processed.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is now being shipped.");
        order.setState(new ShippedState()); // Chuyển sang trạng thái Shipped
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order must be shipped before delivery.");
    }
}
