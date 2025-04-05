package state_pattern.order;

public class ShippedState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already shipped and cannot be processed again.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order has been delivered.");
        order.setState(new DeliveredState()); // Chuyển sang trạng thái Delivered
    }
}
