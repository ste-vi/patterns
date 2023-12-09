package org.stevi.gof.structural.decorator;

public class ItalicTextDecorator extends TextDecorator {

    protected ItalicTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return "<i>%s</i>".formatted(super.getText());
    }
}
