package state_pattern.vendingmachine;

public class SoldState implements State {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait. Dispensing item...");

    }

    @Override
    public void pressButton() {
        System.out.println("Already processing. Please wait...");

    }

    @Override
    public void dispense() {
        System.out.println("Item dispensed.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }
}
