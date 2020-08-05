package com.ximi.design.pattern.visitor;

/**
 * 文件压缩
 *
 * @author Ximi
 * @since 2020/08/05
 */
public class Compressor implements Visitor {

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("压缩" + wordFile.getFilePath() + "文件内容");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("压缩" + pdfFile.getFilePath() + "文件内容");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("压缩" + pptFile.getFilePath() + "文件内容");
    }

}
