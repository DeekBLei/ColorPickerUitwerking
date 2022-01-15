// Created by Deek
// Creation date 12/30/2021

package model;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Palette {

    private static Set<Color> colorMap = new HashSet<>();

    static {
        getColorsFromDatBase();
    }

    public static Color getColor(ColorName colorName) {
        Optional<Color> optionalColor = colorMap.stream().filter(c -> c.getColorName().equals(colorName)).findFirst();
        return optionalColor.map(color -> (Color) color.clone()).orElse(null);
    }

    private static void getColorsFromDatBase() {
        /** This simulates a dataBase call*/
        colorMap.add(new Color(ColorName.PURPLE, "#FF00FF"));
        colorMap.add(new Color(ColorName.GREEN, "#00FF00"));
        colorMap.add(new Color(ColorName.ORANGE, "#FF8800"));
        colorMap.add(new Color(ColorName.RED, "#FF0000"));
        colorMap.add(new Color(ColorName.BLUE, "#0000FF"));
        colorMap.add(new Color(ColorName.YELLOW, "#FFFF00"));
    }
}