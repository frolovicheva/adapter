package ru.geekbrains.architecture;

public class TV implements Inches{
    private double screenInInches;

    public TV(double screenInInches) {
        this.screenInInches = screenInInches;
    }

    public void setScreenInInches(double screenInInches) {
        this.screenInInches = screenInInches;
    }

    @Override
    public double getInches() {
        return screenInInches;
    }
}

