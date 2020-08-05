package com.ximi.design.pattern.visitor;


import java.util.ArrayList;
import java.util.List;

/**
 * 访问这模式主要使用方法重载的特性,在java中,方法执行的入口在编译器就已经确定了。
 * 下面的情况就会出现编译不通过
 *
 * class A{
 *
 *     void fun(B)
 *
 *     void fun(C)
 * }
 *
 * class B extend X {
 *
 * }
 *
 * class C extend X {
 *
 * }
 *
 * A.fun(X) 编译不通过
 *
 * 访问者模式主要是处理上面的问题,通过在 X 中依赖注入A, X的子类传递具体的类型,如下:
 *
 * class abstract X {
 *     abstract void accept(A)
 * }
 *
 * class B extend X{
 *     void accept(A){
 *         A.fun(this)  //this 就是A
 *     }
 * }
 *
 * class C extend X{
 *     void accept(A){
 *         A.fun(this) //this 就是C
 *     }
 * }
 *
 *
 *
 * @author Ximi
 * @since 2020/08/05
 */
public class Main {

    public static void main(String[] args) {

        List<ResourceFile> list = new ArrayList<>();

        list.add(new WordFile("a.docx"));
        list.add(new PdfFile("b.pdf"));
        list.add(new PPTFile("c.ppt"));

        Visitor visitor = new TextExtractor();
        for(ResourceFile resourceFile:list){
            resourceFile.accept(visitor);
        }

        Visitor visitor1 = new Compressor();
        for(ResourceFile resourceFile:list){
            resourceFile.accept(visitor1);
        }
    }

}
