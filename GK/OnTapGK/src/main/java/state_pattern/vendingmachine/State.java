package state_pattern.vendingmachine;

public interface State {
    void insertCoin();
    void pressButton();
    void dispense(); // Gửi hàng ra
}
