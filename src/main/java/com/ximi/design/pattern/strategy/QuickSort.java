package com.ximi.design.pattern.strategy;

import java.util.List;

/**
 * 快速排序
 *
 * @author Ximi
 */
public class QuickSort implements SortStrategy {

    @Override
    public <E extends Comparable> void sort(List<E> data) {
        quickSort(data, 0, data.size() - 1);
    }

    /**
     * 快排
     *
     * @param data
     * @param left
     * @param right
     * @param <E>
     */
    private <E extends Comparable> void quickSort(List<E> data, int left, int right) {

        if (left >= right) return;
        E sortElement = data.get(left);
        int frist = left + 1;
        int tail = right;
        while (frist <= tail) {
            if (sortElement.compareTo(data.get(frist)) > 0) {
                frist++;
            } else if (sortElement.compareTo(data.get(tail)) < 0) {
                tail--;
            } else {
                swap(data, frist, tail);
                frist++;
            }
        }
        swap(data, left, tail);
        quickSort(data, left, tail - 1);
        quickSort(data, frist, right);
    }

    /**
     * 交换两个元素
     *
     * @param data
     * @param x
     * @param y
     * @param <E>
     */
    private <E extends Comparable> void swap(List<E> data, int x, int y) {
        E t = data.get(x);
        data.set(x, data.get(y));
        data.set(y, t);
    }
}
