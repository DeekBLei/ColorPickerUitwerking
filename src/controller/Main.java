package controller;

import model.Color;
import model.ColorName;
import model.Palette;

public class Main {

    public static void main(String[] args) {
        Color myBlue = Palette.getColor(ColorName.BLUE);
        myBlue.setHexValue("#0806DD");
        System.out.println("presetBLue"+ Palette.getColor(ColorName.BLUE) + " myBlue: "+ myBlue );
        Color myBluish = Palette.getColor(ColorName.BLUE);
        myBluish.setHexValue("#4b6a94");
        System.out.println("presetBLue"+ Palette.getColor(ColorName.BLUE) + " myBluish: "+ myBluish );
    }
}
