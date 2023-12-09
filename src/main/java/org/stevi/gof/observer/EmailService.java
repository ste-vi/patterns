package org.stevi.gof.observer;

public class EmailService implements Observer {

    @Override
    public void update(Event event) {
        if (event instanceof UpdateUserEvent updateUserEvent) {
            System.out.println("Sending email about user update to " + updateUserEvent.userEmail());
        } else if (event instanceof CreateUserEvent createUserEvent) {
            System.out.println("Sending email about user create to " + createUserEvent.userEmail());
        }
    }
}
