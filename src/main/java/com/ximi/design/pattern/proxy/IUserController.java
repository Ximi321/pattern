package com.ximi.design.pattern.proxy;

public interface IUserController {

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    public Boolean registerUser(User user);

    /**
     * 注销用户
     *
     * @param user
     * @return
     */
    public Boolean cancelUser(User user);

}
