package com.ximi.design.pattern.memento;

/**
 * 文本输入
 *
 * @author Ximi
 * @since 2020/08/06
 */
public class InputText {

    private StringBuilder text = new StringBuilder();

    public void append(String text){
        this.text.append(text);
    }

    public String getText(){
        return text.toString();
    }

    public Snapshot createSnapshot(){
        return new Snapshot(text.toString());
    }

    public void restoreSnapshot(Snapshot snapshot){
        text.replace(0,text.length(),snapshot.getText());
    }
}
