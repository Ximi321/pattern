package com.ximi.design.pattern.conmand;

/**
 * 命令工厂
 */
public class ConmandFactory {

    /**
     * 创建命令
     *
     * @param params
     * @return
     */
    public static Conmand createConmand(Object... params) {
        if (params.length == 0) {
            return null;
        }

        if ("start".equals(params[0].toString())) {
            return new StartConmand(params);
        }

        if ("close".equals(params[0].toString())) {
            return new CloseConmand(params);
        }

        if ("open".equals(params[0].toString())) {
            return new OpenConmand(params);
        }

        return null;
    }

}
