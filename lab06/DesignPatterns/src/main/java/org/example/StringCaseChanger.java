package org.example;

public class StringCaseChanger implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        StringBuilder result = new StringBuilder();
        char ch;
        for (int i = 0; i < drink.getText().length(); i++) {
            ch = drink.getText().charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            else {
                ch = Character.toLowerCase((ch));
            }
            result.append(ch);
        }

        drink.setText(String.valueOf(result));
    }
}
