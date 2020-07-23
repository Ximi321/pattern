package com.ximi.design.pattern.proxy;

public class UserController implements IUserController{


    @Override
    public Boolean registerUser(User user) {
        xsleep(100);
        System.out.println("注册用户");
        return true;
    }

    @Override
    public Boolean cancelUser(User user) {
        xsleep(50);
        System.out.println("删除用户");
        return true;
    }

    private void xsleep(long time){
        try {
            Thread.sleep(time);
        } catch (Exception ex){

        }
    }
}
