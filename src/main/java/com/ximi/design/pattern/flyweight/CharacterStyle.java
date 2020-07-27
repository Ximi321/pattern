package com.ximi.design.pattern.flyweight;

/**
 * 字体的样式
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class CharacterStyle {

    private Font font;
    private int size;
    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    public Font getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public int getColorRGB() {
        return colorRGB;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof CharacterStyle)){
            return false;
        }
        CharacterStyle style = (CharacterStyle)obj;
        return style.getFont().equals(this.font)
                && style.getColorRGB() == this.getColorRGB()
                && style.getSize() == this.getSize();
    }


}
