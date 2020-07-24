package com.ximi.design.pattern.composite;

import java.util.Random;

/**
 * 文件
 *
 * @author Ximi
 * @since 2020/07/24
 */
public class File extends FileSystemNode {

    public File(String fileName) {
        super(fileName);
    }

    @Override
    public Integer countNumOfFiles() {
        return 1;
    }

    @Override
    public Integer countSizeOfFiles() {
        return new Random().nextInt();   //随机用一个数来表示文件的大小,实际上应该是固定的
    }
}
