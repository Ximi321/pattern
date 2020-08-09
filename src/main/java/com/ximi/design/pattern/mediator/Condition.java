package com.ximi.design.pattern.mediator;

/**
 * 房主条件
 * 代码示例,就是level表示等级
 *
 * @author Ximi
 * @since 2020/08/09
 */
public class Condition {

    private Integer level;

    public Condition(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

}
