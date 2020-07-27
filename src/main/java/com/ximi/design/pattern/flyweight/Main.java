package com.ximi.design.pattern.flyweight;

import java.awt.*;

/**
 * 享元模式，多个对象同享用一个对象,同享的对象是不可变的对象，
 * 共享的对象一般由工厂来创建。
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class Main {

    public static void main(String[] args) {
        Font font = new Font("宋体");
        String context = "you see! plane";
        Editor editor = new Editor();
        for (char c : context.toCharArray()) {
            editor.appendCharacter(c,font,25, Color.BLACK.getRGB());
        }
    }
}
