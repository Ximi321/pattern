package com.ximi.design.pattern.proxy;

public class StaticProxyUserController implements IUserController {

    private IUserController userController = null;

    public StaticProxyUserController(IUserController userController) {
        this.userController = userController;
    }

    @Override
    public Boolean registerUser(User user) {
        long startTime = System.currentTimeMillis();
        Boolean result =  userController.registerUser(user);
        System.out.println("registerUser:耗时"+ (System.currentTimeMillis() - startTime));
        return result;
    }

    @Override
    public Boolean cancelUser(User user) {
        long startTime = System.currentTimeMillis();
        Boolean result = userController.cancelUser(user);
        System.out.println("cancelUser:耗时"+ (System.currentTimeMillis() - startTime));
        return result;
    }

    public static void main(String[] args) {
        IUserController userController = new UserController();
        userController = new StaticProxyUserController(userController);
        userController.registerUser(new User());
        userController.cancelUser(new User());
    }

}
