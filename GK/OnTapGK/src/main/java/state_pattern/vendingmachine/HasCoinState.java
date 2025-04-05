package state_pattern.vendingmachine;

public class HasCoinState implements State {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }


    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void pressButton() {
        System.out.println("Button pressed... Dispensing item...");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Press the button to get an item.");
    }
}
