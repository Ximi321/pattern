package com.ximi.design.pattern.facade;

/**
 * 用户
 *
 * @author Ximi
 * @since 2020/07/23
 */
public class User {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 电话号码
     */
    private String telePhone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }
}
