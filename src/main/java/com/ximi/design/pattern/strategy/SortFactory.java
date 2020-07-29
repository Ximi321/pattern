package com.ximi.design.pattern.strategy;

import java.util.*;

/**
 * 排序工厂
 *
 * @author Ximi
 * @since 2020/07/28
 */
public class SortFactory {

    private static Map<Range,SortStrategy> sortStrategyMap;

    static {
        sortStrategyMap = new HashMap<>();
        sortStrategyMap.put(new Range(0,100),new BubbleSort());
        sortStrategyMap.put(new Range(101,10000),new QuickSort());
        sortStrategyMap.put(new Range(10001,Integer.MAX_VALUE),new MultiThreadMergerSort());
    }

    public static SortStrategy getSortStrategy(Integer size){
        for(Map.Entry<Range,SortStrategy> entry:sortStrategyMap.entrySet()){
            if(entry.getKey().getMin() >= size && entry.getKey().getMax() <= size){
                return entry.getValue();
            }
        }
        return null;
    }

}
