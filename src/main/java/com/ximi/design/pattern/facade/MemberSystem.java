package com.ximi.design.pattern.facade;

/**
 * 会员系统
 *
 * @author Ximi
 * @since 2020/07/23
 */
public interface MemberSystem {

    /**
     * 把用户添加为会员
     *
     * @param user
     */
    public void addMember(User user);

}
