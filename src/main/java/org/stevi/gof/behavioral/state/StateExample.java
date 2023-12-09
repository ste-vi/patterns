package org.stevi.gof.behavioral.state;

public class StateExample {

    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.withdraw(100);
        atm.withdraw(900);

        atm.withdraw(10);
        atm.deposit(100);
        atm.withdraw(10);
    }
}
