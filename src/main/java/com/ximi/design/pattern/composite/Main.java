package com.ximi.design.pattern.composite;

/**
 * 组合模式:如果一组对象能用树形结构表示，那么可以用组合模式。组合模式主要采用递归的方式来实现
 *
 * @author Ximi
 * @since 2020/07/24
 */
public class Main {

    public static void main(String[] args) {

        //data 目录下有两个文件夹  log 和 user
        Directory root = new Directory("data");
        Directory logDir = new Directory("log");
        Directory userDir = new Directory("user");
        root.addFile(logDir);
        root.addFile(userDir);

        //log 目录下面有  log1.tex 和 log2.txt 文件
        File log1 = new File("log1.txt");
        File log2 = new File("log2.txt");
        logDir.addFile(log1);
        logDir.addFile(log2);

        //user 目录下面有 user1.txt 和 user2.txt
        File user1 = new File("user1.txt");
        File user2 = new File("user2.txt");
        userDir.addFile(user1);
        userDir.addFile(user2);

        System.out.println("root file number:" + root.countNumOfFiles());
        System.out.println("root file size:" + root.countSizeOfFiles());

    }

}
