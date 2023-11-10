package org.example;

public class StringReplacer implements StringTransformer{
    private char replacedChar;
    private char newChar;


    public StringReplacer( char oldChar, char newChar) {
        this.replacedChar = oldChar;
        this.newChar = newChar;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(replacedChar,newChar));
    }
}
