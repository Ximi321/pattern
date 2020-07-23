package com.ximi.design.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShallowClone implements Cloneable{

    /**
     * 名字
     */
    public String name;

    /**
     * 地址列表
     */
    public List<Address> addressList;

    @Override
    public String toString() {
        return "ShallowClone{" +
                "name='" + name + '\'' +
                ", addressList=" + addressList +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {
        ShallowClone shallow = new ShallowClone();
        shallow.name = "Ximi";
        shallow.addressList = new ArrayList<>();
        shallow.addressList.add(new Address());

        try {
            ShallowClone clone = (ShallowClone) shallow.clone();
            System.out.println(shallow.addressList == clone.addressList);
        } catch (Exception ex){

        }
    }
}
