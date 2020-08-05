package com.ximi.design.pattern.visitor;

/**
 * 资源文件
 *
 * @author Ximi
 * @since 2020/08/05
 */
public abstract class ResourceFile {

    //文件路径
    private String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 接受一个访问者
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

    public String getFilePath() {
        return filePath;
    }
}
