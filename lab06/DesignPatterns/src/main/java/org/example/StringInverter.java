package org.example;

public class StringInverter implements  StringTransformer {

    public void execute(StringDrink drink) {
         String temp = drink.getText();
         String result = new String();
         char ch;
         for (int i = 0; i < temp.length(); i++) {
             ch = temp.charAt(i);
             result = ch + result;
         }

         drink.setText(result);
    }


}
