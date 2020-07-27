package com.ximi.design.pattern.flyweight;

/**
 * 单个文字
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class Character {

    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}
