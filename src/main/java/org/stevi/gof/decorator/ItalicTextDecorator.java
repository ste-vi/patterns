package org.stevi.gof.decorator;

public class ItalicTextDecorator extends TextDecorator {

    protected ItalicTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return "<i>%s</i>".formatted(super.getText());
    }
}
