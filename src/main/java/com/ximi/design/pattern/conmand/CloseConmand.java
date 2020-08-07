package com.ximi.design.pattern.conmand;

import java.util.Arrays;
import java.util.List;

/**
 * 关闭命令
 *
 * @author Ximi
 * @since 2020/08/07
 */
public class CloseConmand implements Conmand {

    public List<Object> parameters;

    public CloseConmand(Object... parameters) {
        this.parameters = Arrays.asList(parameters);
    }

    @Override
    public void execute() {
        System.out.printf("关闭命令\n");
    }
}
