package org.stevi.gof.behavioral.chainofresponsibility;

public class HandlerOne implements Handler {

    private Handler nextHandler;

    @Override
    public void handle(Request request) {
        executeSomeLogicOnRequest(request);
        nextHandler.handle(request);
    }

    private void executeSomeLogicOnRequest(Request request) {
        System.out.println("Some logic in handler one");
    }

    @Override
    public void registerNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
