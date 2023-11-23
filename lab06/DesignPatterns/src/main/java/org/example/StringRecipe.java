package org.example;

import java.util.List;

public class StringRecipe{

    private List<StringTransformer> recipleList;
    private StringDrink drink;

    public StringRecipe(List<StringTransformer> list) {
        this.recipleList = list;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer elem : recipleList) {
            elem.execute(drink);
        }
    }


    public void undo(StringDrink drink) {
        for (StringTransformer elem : recipleList) {
            elem.undo(drink);
        }
    }

}
