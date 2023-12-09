package org.stevi.gof.structural.decorator;

public class PlainText implements Text {

    @Override
    public String getText() {
        return "hello";
    }
}
