package org.stevi.gof.decorator;

public class PlainText implements Text {

    @Override
    public String getText() {
        return "hello";
    }
}
