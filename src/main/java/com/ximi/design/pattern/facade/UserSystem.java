package com.ximi.design.pattern.facade;

/**
 * 用户系统
 *
 * @author Ximi
 * @since 2020/07/23
 */
public interface UserSystem {

    /**
     * 创建用户
     * @param userName 用户名
     * @param telePhone 电话号码
     * @return User
     */
    public User createUser(String userName,String telePhone);

}
