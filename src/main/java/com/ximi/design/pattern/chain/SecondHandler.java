package com.ximi.design.pattern.chain;

/**
 * 第二个 handler
 *
 * @author Ximi
 * @since 2020/07/30
 */
public class SecondHandler extends Handler {

    @Override
    protected Boolean doHandler() {
        System.out.println("SecondHandler" + "处理成功，下一个你不需要处理");
        return false;
    }
}
