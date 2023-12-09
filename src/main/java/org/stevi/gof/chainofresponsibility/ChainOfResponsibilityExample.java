package org.stevi.gof.chainofresponsibility;

public class ChainOfResponsibilityExample {

    public static void main(String[] args) {
        Handler handler = registerHandlers();
        handler.handle(new Request());
    }

    private static Handler registerHandlers() {
        Handler handlerOne = new HandlerOne();
        Handler handlerTwo = new HandlerTwo();

        handlerOne.registerNextHandler(handlerTwo);

        return handlerOne;
    }
}
