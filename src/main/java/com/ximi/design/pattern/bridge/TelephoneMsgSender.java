package com.ximi.design.pattern.bridge;

import java.util.List;

/**
 * 电话发送
 */
public class TelephoneMsgSender implements MsgSender {

    private List<String> telePhones;

    public TelephoneMsgSender(List<String> telePhones) {
        this.telePhones = telePhones;
    }

    @Override
    public void send(String message) {
        telePhones.forEach(telePhone -> {System.out.println(telePhone +":" + message);});
    }
}
