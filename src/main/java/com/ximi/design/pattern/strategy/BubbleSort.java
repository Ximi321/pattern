package com.ximi.design.pattern.strategy;

import java.util.List;

/**
 * 冒泡排序
 *
 * @author Ximi
 * @since 2020/07/28
 */
public class BubbleSort implements SortStrategy {

    @Override
    public <E extends Comparable> void sort(List<E> data) {
        for (int i = 0; i < data.size(); i++) {
            int t = i;
            for (int j = i + 1; j < data.size(); j++) {
                if (data.get(t).compareTo(data.get(j)) > 0) {
                    t = j;
                }
            }
            if (i != t) {
                E temp = data.get(i);
                data.set(i, data.get(t));
                data.set(t, temp);
            }
        }
    }
}
