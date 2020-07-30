package com.ximi.design.pattern.chain;

/**
 * 处理类
 */
public abstract class Handler {

    /**
     * 下一个处理这
     */
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handler() {
        Boolean handled = doHandler();
        if (handled && successor != null) {
            successor.handler();
        }
    }

    /**
     * 真正的处理函数
     *
     * @return 返回false 表示一个 successor 不需要处理,返回true 表示下一个 successor 需要处理
     */
    protected abstract Boolean doHandler();


}
