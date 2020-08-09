package com.ximi.design.pattern.mediator;

/**
 * 房客需求
 * 代码示例,就是level表示等级
 *
 * @author Ximi
 * @since 2020/08/09
 */
public class Require {

    private Integer level;

    public Require(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }
}
