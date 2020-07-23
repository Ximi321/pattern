package com.ximi.design.pattern.bridge;

/**
 * 消息发送
 */
public interface MsgSender {

    /**
     * 发送消息
     * @param message
     */
    public void send(String message);

}
