package com.ximi.design.pattern.visitor;

/**
 * word 文件
 *
 * @author Ximi
 * @since 2020/08/05
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
