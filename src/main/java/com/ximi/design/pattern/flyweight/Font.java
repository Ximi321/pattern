package com.ximi.design.pattern.flyweight;

/**
 * 字体样式类
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class Font {

    private String font;

    public Font(String font) {
        this.font = font;
    }

    public String getFont() {
        return font;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Font)) {
            return false;
        }
        return ((Font) obj).getFont().equals(this.font);
    }
}
