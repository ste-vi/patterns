package org.stevi.gof.structural.decorator;

public class DecoratorExample {

    public static void main(String[] args) {

        Text plainText = new PlainText();
        Text boldText = new BoldTextDecorator(plainText);
        Text italicBoldText = new ItalicTextDecorator(boldText);

        System.out.println(plainText.getText());
        System.out.println(boldText.getText());
        System.out.println(italicBoldText.getText());
    }
}
