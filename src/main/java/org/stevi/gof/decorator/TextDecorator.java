package org.stevi.gof.decorator;

public abstract class TextDecorator implements Text {

    private final Text text;

    protected TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text.getText();
    }
}
