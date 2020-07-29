package com.ximi.design.pattern.strategy;

import java.util.List;

/**
 * 排序策略
 */
public interface SortStrategy {

    /**
     * 排序,需要排序的数据
     * @param data
     */
    public <E extends Comparable> void sort(List<E> data);

}
