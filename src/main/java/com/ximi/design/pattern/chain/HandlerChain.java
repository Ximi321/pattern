package com.ximi.design.pattern.chain;

/**
 * handler 的处理链
 *
 * @author Ximi
 * @since 2020/07/30
 */
public class HandlerChain {

    private Handler headHandler = null;
    private Handler tailHandler = null;

    /**
     * 处理数据
     */
    public void handler() {
        if (headHandler != null) {
            headHandler.handler();
        }
    }

    /**
     * 添加处理handler
     *
     * @param handler
     */
    public void addHandler(Handler handler) {

        if (headHandler == null && tailHandler == null) {
            headHandler = handler;
            tailHandler = handler;
        } else {
            tailHandler.setSuccessor(handler);
            tailHandler = handler;
        }
    }

}
