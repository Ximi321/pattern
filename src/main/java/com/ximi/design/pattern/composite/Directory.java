package com.ximi.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录
 *
 * @author Ximi
 * @since 2020/07/24
 */
public class Directory extends FileSystemNode{

    /**
     * 文件目录下面的子文件
     */
    private List<FileSystemNode> childFiles = new ArrayList<>();

    public Directory(String fileName) {
        super(fileName);
    }

    @Override
    public Integer countNumOfFiles() {
        int countNum = 0;
        for(FileSystemNode fileSystemNode:childFiles){
            countNum += fileSystemNode.countNumOfFiles();
        }
        return countNum + 1;
    }

    @Override
    public Integer countSizeOfFiles() {
        int countSize = 0;
        for(FileSystemNode fileSystemNode:childFiles){
            countSize += fileSystemNode.countSizeOfFiles();
        }
        return countSize + 1;
    }

    public void addFile(FileSystemNode fileSystemNode){
        childFiles.add(fileSystemNode);
    }
}
