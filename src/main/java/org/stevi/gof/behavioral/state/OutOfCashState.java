package org.stevi.gof.behavioral.state;

public class OutOfCashState implements AtmState {

    private final Atm atm;

    public OutOfCashState(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("ATM is out of cash");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Out of cash: Depositing " + amount);
        atm.setBalance(atm.getBalance() + amount);
        atm.setState(new OpenState(atm));
    }
}
