package com.ximi.design.pattern.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 消息通知者
 */
public class Notification {

    private MsgSender msgSender;  //利用组合的方式把发送消息这个模块组合进来

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public void notify(String message){
        msgSender.send(message);
    }

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("2345");
        MsgSender msgSender = new TelephoneMsgSender(lists);
        Notification notification = new Notification(msgSender);
        notification.notify("666666");
    }
}
