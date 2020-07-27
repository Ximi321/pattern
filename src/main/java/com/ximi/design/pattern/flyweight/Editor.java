package com.ximi.design.pattern.flyweight;

import java.util.LinkedList;
import java.util.List;


/**
 * 编辑者
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class Editor {

    private List<Character> characterList = new LinkedList<>();

    public void appendCharacter(char c,Font font,int size,int colorRGB){
        CharacterStyle style = CharacterStyleFactory.createCharacterStyle(font,size,colorRGB);
        characterList.add(new Character(c,style));
    }
}
