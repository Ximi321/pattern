package com.ximi.design.pattern.chain;

/**
 * 第三个 handler
 *
 * @author Ximi
 * @since 2020/07/30
 */
public class ThirdHandler extends Handler {

    @Override
    protected Boolean doHandler() {
        System.out.println("ThirdHandler" + "你们把我忘记了");
        return true;
    }
}
