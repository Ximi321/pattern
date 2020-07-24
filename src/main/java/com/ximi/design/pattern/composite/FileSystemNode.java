package com.ximi.design.pattern.composite;

/**
 * 文件系统节点的抽象类
 *
 * @author Ximi
 * @since 2020/07/24
 */
public abstract class FileSystemNode {

    /**
     * 文件名
     */
    protected String fileName;

    public FileSystemNode(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 文件的数量大小
     *
     * @return
     */
    public abstract Integer countNumOfFiles();

    /**
     * 文件的容量大小
     *
     * @return
     */
    public abstract Integer countSizeOfFiles();


}
