package com.ximi.design.pattern.memento;

/**
 * 文本输入的快照
 *
 * @author Ximi
 * @since 2020/08/06
 */
public class Snapshot {

    public Snapshot(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }
}
