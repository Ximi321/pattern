package com.ximi.design.pattern.template;

/**
 * 用户
 *
 * @author Ximi
 * @since 2020/07/28
 */
public class User {

    /**
     * 名字
     */
    private String name;

    /**
     * 年龄
     */
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
