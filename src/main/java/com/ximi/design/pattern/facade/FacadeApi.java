package com.ximi.design.pattern.facade;

/**
 * 门面模式:
 * 把多个操作封装一个接口,提供了接口的易用性，同时还可以解决事务问题,接口性能问题
 *
 * @author Ximi
 * @since 2020/07/23
 */
public class FacadeApi {

    //依赖注入userSystem的实现
    private UserSystem userSystem;

    private WalletSystem walletSystem;

    private MemberSystem memberSystem;

    /**
     * 注册用户，同时为用户添加钱包，注册会员
     *
     * @param userName  用户名
     * @param telePhone 电话号码
     * @return
     */
    public void register(String userName, String telePhone) {
        User user = userSystem.createUser(userName, telePhone);
        walletSystem.createWallet(user);
        memberSystem.addMember(user);
    }

}


