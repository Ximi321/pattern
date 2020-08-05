package com.ximi.design.pattern.visitor;

/**
 * 文本提取器
 *
 * @author Ximi
 * @since 2020/08/05
 */
public class TextExtractor implements Visitor {

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("提取" + wordFile.getFilePath() + "文件内容");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("提取" + pdfFile.getFilePath() + "文件内容");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("提取" + pptFile.getFilePath() + "文件内容");
    }
}
