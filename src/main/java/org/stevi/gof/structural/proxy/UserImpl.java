package org.stevi.gof.structural.proxy;

public class UserImpl implements User {

    @Override
    public void changePassword(String newPassword) {
        System.out.println("Password has been changed: " + newPassword);
    }
}
