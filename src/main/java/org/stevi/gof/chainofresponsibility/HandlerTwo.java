package org.stevi.gof.chainofresponsibility;

public class HandlerTwo implements Handler {

    private Handler nextHandler;

    @Override
    public void handle(Request request) {
        executeSomeLogicOnRequest(request);
        // no next call
    }

    private void executeSomeLogicOnRequest(Request request) {
        System.out.println("Some logic in handler two");
    }

    @Override
    public void registerNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
