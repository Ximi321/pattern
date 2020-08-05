package com.ximi.design.pattern.visitor;

/**
 * 访问者
 *
 * @author Ximi
 * @since 2020/08/05
 */
public interface  Visitor {

    /**
     * 访问word 文件
     * @param wordFile
     */
    public void visit(WordFile wordFile);

    /**
     * 访问pdf 文件
     * @param pdfFile
     */
    public void visit(PdfFile pdfFile);

    /**
     * 访问ppt 文件
     * @param pptFile
     */
    public void visit(PPTFile pptFile);

}
