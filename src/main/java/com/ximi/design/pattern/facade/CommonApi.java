package com.ximi.design.pattern.facade;

/**
 * 普通的接口。
 * 如果创建用户的时候，需要给用户创建钱包,和添加唯会员，需要调用三次接口，接口的易用性不高
 *
 * @author Ximi
 * @since 2020/07/23
 */
public class CommonApi {

    private UserSystem userSystem;  //依赖注入userSystem的实现

    private WalletSystem walletSystem;

    private MemberSystem memberSystem;

    /**
     * 注册用户
     *
     * @param userName  用户名
     * @param telePhone 电话号码
     * @return
     */
    public User register(String userName, String telePhone) {
        return userSystem.createUser(userName, telePhone);
    }

    /**
     * 创建钱包
     *
     * @param user
     */
    public void createWallet(User user) {
        walletSystem.createWallet(user);
    }

    /**
     * 注册为会员
     *
     * @param user
     */
    public void registerMember(User user) {
        memberSystem.addMember(user);
    }

}
