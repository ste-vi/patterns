package org.stevi.gof.structural.proxy;

public class ProxyExample {

    public static void main(String[] args) {
        User user = new UserProxy(false);
        user.changePassword("123");
    }
}
