package org.stevi.gof.behavioral.chainofresponsibility;

public interface Handler {

    void handle(Request request);

    void registerNextHandler(Handler handler);
}
