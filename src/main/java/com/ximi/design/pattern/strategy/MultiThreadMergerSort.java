package com.ximi.design.pattern.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * 多线程归并排序
 *
 * @author Ximi
 * @since 2020/07/28
 */
public class MultiThreadMergerSort implements SortStrategy {


    private ForkJoinPool pool = ForkJoinPool.commonPool();

    @Override
    public <E extends Comparable> void sort(List<E> data) {
        try {
            SortTask sortTask = new SortTask<E>(data, 0, data.size() - 1);
            pool.submit(sortTask);
            List<E> temp = (List<E>) sortTask.get();
            data.clear();
            data.addAll(temp);
        } catch (Exception e) {
            throw new RuntimeException("排序异常", e);
        }
    }

    /**
     * 处理排序的任务
     *
     * @param <E>
     */
    private class SortTask<E extends Comparable> extends RecursiveTask<List<E>> {

        Integer first;
        Integer tail;
        List<E> data;

        public SortTask(List<E> data, Integer first, Integer tail) {
            this.first = first;
            this.tail = tail;
            this.data = data;
        }

        @Override
        protected List<E> compute() {

            if (first == tail) {  //这个地方可以把 first 和 tail 的间距搞大点,然后使用简单的排序方式:比如冒泡
                List<E> list = new ArrayList<>();
                list.add(data.get(first));
                return list;
            }

            SortTask left = new SortTask(data, first, (first + tail) / 2);
            SortTask right = new SortTask(data, (first + tail) / 2 + 1, tail);

            left.fork();
            right.fork();

            List<E> leftData = (List<E>) left.join();
            List<E> rightData = (List<E>) right.join();

            return merger(leftData, rightData);
        }

        /**
         * 合并两个有序集合
         *
         * @param leftData
         * @param rightData
         * @return
         */
        private List<E> merger(List<E> leftData, List<E> rightData) {

            List<E> datas = new ArrayList<>();
            E left = null;
            E right = null;
            Integer indexLeft = 0;
            Integer indexRight = 0;
            while (true) {

                if (left == null && indexLeft != leftData.size()) {
                    left = leftData.get(indexLeft++);
                }

                if (right == null && indexRight != rightData.size()) {
                    right = rightData.get(indexRight++);
                }

                if(left == null && right == null){
                    break;
                }

                if(left != null && right == null){
                    datas.add(left);
                    left = null;
                    continue;
                }

                if(left == null && right != null){
                    datas.add(right);
                    right = null;
                    continue;
                }

                if (left.compareTo(right) <= 0) {
                    datas.add(left);
                    left = null;
                } else {
                    datas.add(right);
                    right = null;
                }
            }

            return datas;
        }
    }
}
