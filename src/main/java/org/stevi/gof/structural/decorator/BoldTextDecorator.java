package org.stevi.gof.structural.decorator;

public class BoldTextDecorator extends TextDecorator{

    protected BoldTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return "<b>%s</b>".formatted(super.getText());
    }
}
