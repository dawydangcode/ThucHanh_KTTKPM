package state_pattern.order;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new PendingState(); // Trạng thái mặc định là Pending
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.processOrder(this);
    }

    public void shipOrder() {
        state.shipOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }
}
