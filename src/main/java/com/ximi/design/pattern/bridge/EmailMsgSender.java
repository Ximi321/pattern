package com.ximi.design.pattern.bridge;

import java.util.List;

/**
 * 邮件发送
 */
public class EmailMsgSender implements MsgSender {

    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        emails.forEach(email -> System.out.println(email + ":" + message));
    }
}
