package com.ximi.design.pattern.conmand;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 命令的执行者
 *
 * @author Ximi
 * @since 2020/08/07
 */
public class ConmandExecutor {

    //创建一个固定的线程池
    private ExecutorService executor = Executors.newFixedThreadPool(4);

    /**
     * 执行一条命令
     *
     * @param conmand
     */
    public void executeConmand(Conmand conmand) {
        executor.submit(() -> {
            conmand.execute();
        });
    }

}
