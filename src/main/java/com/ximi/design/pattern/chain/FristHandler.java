package com.ximi.design.pattern.chain;

/**
 * 第一个 handler
 *
 * @author Ximi
 * @since 2020/07/30
 */
public class FristHandler extends Handler {

    @Override
    protected Boolean doHandler() {
        System.out.println("FristHandler" + "处理成功，下一个你接着处理");
        return true;
    }
}
