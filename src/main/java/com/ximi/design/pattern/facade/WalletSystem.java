package com.ximi.design.pattern.facade;

/**
 * 钱包系统
 *
 * @author Ximi
 * @since 2020/07/23
 */
public interface WalletSystem {

    /**
     * 创建钱包
     * @param user
     */
    public void createWallet(User user);

}
