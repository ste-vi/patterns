package org.stevi.gof.behavioral.state;

public class Atm {

    private int balance = 1000;
    private AtmState state = new OpenState(this);

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setState(AtmState state) {
        this.state = state;
    }

    public void withdraw(int amount) {
        state.withdraw(amount);
    }

    public void deposit(int amount) {
        state.deposit(amount);
    }
}
