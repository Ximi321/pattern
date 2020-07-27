package com.ximi.design.pattern.flyweight;

import java.util.LinkedList;


/**
 * 样式的创建工厂,如果已经创建过，就返回创建过的 CharacterStyle
 * 否则就创建一个保持在 styles 集合中
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class CharacterStyleFactory {

    private static LinkedList<CharacterStyle> styles = new LinkedList<>();

    public static CharacterStyle createCharacterStyle(Font font, int size, int colorRGB) {
        CharacterStyle style = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle info : styles) {
            if (info.equals(style)) {
                return info;
            }
        }
        styles.add(style);
        return style;
    }

}
