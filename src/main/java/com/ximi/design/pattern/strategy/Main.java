package com.ximi.design.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        SortStrategy sortStrategy = SortFactory.getSortStrategy(list.size());
        sortStrategy.sort(list);
    }

}
