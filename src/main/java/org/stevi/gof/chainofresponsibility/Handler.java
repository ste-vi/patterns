package org.stevi.gof.chainofresponsibility;

public interface Handler {

    void handle(Request request);

    void registerNextHandler(Handler handler);
}
