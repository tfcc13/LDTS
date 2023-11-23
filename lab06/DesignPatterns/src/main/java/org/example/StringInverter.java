package org.example;

public class StringInverter implements  StringTransformer {

    public void execute(StringDrink drink) {
         StringBuilder temp = new StringBuilder(drink.getText());
         temp.reverse();
         drink.setText(String.valueOf(temp));
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }

}
