package test;

import model.Color;
import model.ColorName;
import model.Palette;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaletteTest {
    @Test
    public void getColor() {
        Color myblue = Palette.getColor(ColorName.BLUE);
        assertFalse(Palette.getColor(ColorName.BLUE).equals(myblue));
        assertTrue(myblue.getColorName().equals(Palette.getColor(ColorName.BLUE).getColorName()));
        assertTrue(myblue.getHexValue().equals(Palette.getColor(ColorName.BLUE).getHexValue()));
        myblue.setColorName(ColorName.PURPLE);
        assertFalse(myblue.getColorName().equals(Palette.getColor(ColorName.BLUE).getColorName()));
    }

}