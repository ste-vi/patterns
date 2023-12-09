package org.stevi.gof.behavioral.state;

public class OpenState implements AtmState {

    private final Atm atm;

    public OpenState(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void withdraw(int amount) {
        int balance = atm.getBalance();
        atm.setBalance(balance - amount);

        System.out.println("Withdrawing " + amount);

        if (balance - amount == 0) {
            atm.setState(new OutOfCashState(atm));
        }
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Depositing " + amount);
        atm.setBalance(atm.getBalance() + amount);
    }
}
