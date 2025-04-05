package state_pattern.vendingmachine;

public class NoCoinState implements State {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }



    @Override
    public void insertCoin() {
        System.out.println("Coin Inserted");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Insert coin first!!!");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted, can't dispense!!!");
    }
}
