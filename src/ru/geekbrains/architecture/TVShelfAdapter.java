package ru.geekbrains.architecture;

public class TVShelfAdapter implements Inches {
    private final TVShelf tvShelf;

    public TVShelfAdapter(TVShelf tvShelf) {
        this.tvShelf = tvShelf;
    }


    public double getWidthInCm() {
        return tvShelf.getWidthInCm ();
    }

    public double getHeightInCm() {
        return tvShelf.getHeightInCm ();
    }

    public double getDiagonalInCm (){
        if (tvShelf.getWidthInCm () < tvShelf.getHeightInCm ()){
            System.out.print ("Полка должна располагаться горизонтально: ");
            return 0;
        } else return Math.sqrt ((Math.pow(tvShelf.getWidthInCm (), 2)) + (Math.pow(tvShelf.getHeightInCm (), 2)));
    }

    @Override
    public double getInches() {
        return getDiagonalInCm () * 0.394;
    }
}
