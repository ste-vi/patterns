package org.stevi.gof.behavioral.templatemethod;

public abstract class NotificationService {

    public final void doNotify() {
        String user = fetchUser();
        notifyUser(user);
    }

    protected abstract String fetchUser();

    protected abstract void notifyUser(String user);

}
