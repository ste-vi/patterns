package org.stevi.gof.structural.proxy;

public class UserProxy implements User {

    private final boolean hasUpdateUserAccess;
    private final UserImpl user;

    public UserProxy(boolean hasUpdateUserAccess) {
        this.hasUpdateUserAccess = hasUpdateUserAccess;
        this.user = new UserImpl();
    }

    @Override
    public void changePassword(String newPassword) {
        System.out.println("Proxy: someone tries to change password");
        if (hasUpdateUserAccess) {
            System.out.println("Proxy: access to change password has been verified");
            user.changePassword(newPassword);
        } else {
            System.out.println("Proxy: access to change password has been denied");
        }
    }
}
