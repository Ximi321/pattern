package com.ximi.design.pattern.template;

/**
 * 文件的头部
 *
 * @author Ximi
 * @since 2020/07/28
 */
public class HeadColumn {

    /**
     * 获取
     */
    private String headName;

    /**
     * 字段名
     */
    private String fieldName;

    public HeadColumn(String headName, String fieldName) {
        this.headName = headName;
        this.fieldName = fieldName;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
