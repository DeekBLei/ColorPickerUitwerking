// Created by Deek
// Creation date 12/30/2021

package model;


public class Color implements ProtoType{
    private ColorName colorName;
    private String hexValue;

    public ColorName getColorName() {
        return colorName;
    }

    public void setColorName(ColorName colorName) {
        this.colorName = colorName;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public Color(ColorName color, String hexValue) {
        this.colorName = color;
        this.hexValue = hexValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorName=" + colorName +
                ", hexValue='" + hexValue + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        return new Color(this.colorName, this.hexValue);
    }
}