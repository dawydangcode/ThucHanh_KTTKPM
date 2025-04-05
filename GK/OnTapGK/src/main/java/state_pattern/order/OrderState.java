package state_pattern.order;

public interface OrderState {
    void processOrder(Order order);
    void shipOrder(Order order);
    void deliverOrder(Order order);
}
