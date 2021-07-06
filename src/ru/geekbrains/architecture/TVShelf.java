package ru.geekbrains.architecture;

public class TVShelf {
    private double widthInCm;
    private double heightInCm;

    public TVShelf(double widthInCm, double heightInCm) {
        this.widthInCm = widthInCm;
        this.heightInCm = heightInCm;
    }

    public double getWidthInCm() {
        return widthInCm;
    }

    public void setWidthInCm(double widthInCm) {
        this.widthInCm = widthInCm;
    }

    public double getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(double heightInCm) {
        this.heightInCm = heightInCm;
    }
}
