package org.example;


public class StringBar extends Bar{

    public StringBar() {
        super();
    }
    @Override
    public boolean isHappyHour() {
        return super.happyHour;
    }

    @Override
    public void startHappyHour() {
        super.happyHour  = true;
    }

    @Override
    public void endHappyHour() {
       super.happyHour = false;
    }
}
