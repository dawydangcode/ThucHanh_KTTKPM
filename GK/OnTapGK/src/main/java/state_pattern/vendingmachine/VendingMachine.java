package state_pattern.vendingmachine;

public class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State currentState;

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        currentState = noCoinState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getNoCoinState() { return noCoinState; }
    public State getHasCoinState() { return hasCoinState; }
    public State getSoldState() { return soldState; }

    // Hành động
    public void insertCoin() {
        currentState.insertCoin();
    }

    public void pressButton() {
        currentState.pressButton();
        currentState.dispense();
    }

}
