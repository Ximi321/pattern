package com.ximi.design.pattern.conmand;

import java.util.Arrays;
import java.util.List;

/**
 * 打开命令
 *
 * @author Ximi
 * @since 2020/08/07
 */
public class OpenConmand implements Conmand{

    public List<Object> parameters;

    public OpenConmand(Object... parameters) {
        this.parameters = Arrays.asList(parameters);
    }

    @Override
    public void execute() {
        System.out.printf("打开命令\n");
    }
}
