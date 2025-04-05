package state_pattern.order;

public class PendingState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is now being processed.");
        order.setState(new ProcessState()); // Chuyển sang trạng thái Processing
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order must be processed before shipping.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order must be shipped before delivery.");
    }
}
