package com.ximi.design.pattern.conmand;

import java.util.Arrays;
import java.util.List;

/**
 * 开始命令
 *
 * @author Ximi
 * @since 2020/08/07
 */
public class StartConmand implements Conmand {

    public List<Object> parameters;

    public StartConmand(Object... parameters) {
        this.parameters = Arrays.asList(parameters);
    }

    @Override
    public void execute() {
        System.out.printf("开始命令\n");
    }
}
