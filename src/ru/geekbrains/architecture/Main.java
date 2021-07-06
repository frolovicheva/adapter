package ru.geekbrains.architecture;

public class Main {

    public static void main(String[] args) {

        TV tv22 = new TV (22.00);
        TVShelfAdapter shelf_100_60 = new TVShelfAdapter (new TVShelf (100, 60));
        info (tv22,shelf_100_60);

        TV tv50 = new TV (50.00);
        TVShelfAdapter shelf2_100_60 = new TVShelfAdapter (new TVShelf (100, 60));
        info (tv50,shelf2_100_60);

        TV tv32 = new TV (32.00);
        TVShelfAdapter shelf_60_100 = new TVShelfAdapter (new TVShelf (60, 100));
        info (tv32,shelf_60_100);
    }

    private static boolean isShelfSizeSuitableForTV (TV tv, TVShelfAdapter shelf){
        return tv.getInches () < shelf.getInches ();
    }

    public static void info (TV tv, TVShelfAdapter shelf){
        if (isShelfSizeSuitableForTV (tv, shelf)){
            System.out.printf ("TV %s дюйма поместится на полке шириной %s см и высотой %s см \n",
                    tv.getInches (), shelf.getWidthInCm (),shelf.getHeightInCm ());
        } else
            System.out.printf ("TV %s дюйма НЕ поместится на полке шириной %s см и высотой %s см \n",
                    tv.getInches (), shelf.getWidthInCm (),shelf.getHeightInCm ());
    }
}
