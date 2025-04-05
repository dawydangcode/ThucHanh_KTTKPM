package state_pattern.vendingmachine;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin(); // Chèn xu
        vendingMachine.pressButton(); // Nhấn nút để lấy hàng

        System.out.println("\n--- Second Try ---\n");

        vendingMachine.insertCoin();
        vendingMachine.insertCoin(); // Chèn xu lần nữa (không được)
        vendingMachine.pressButton();
    }
}
