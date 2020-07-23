package com.ximi.design.pattern.prototype;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;

public class DepthClone implements Cloneable {

    /**
     * 名字
     */
    public String name;

    /**
     * 地址列表
     */
    public ArrayList<Address> addressList = new ArrayList<>();


    public DepthClone(String name) {
        this.name = name;
        this.addressList = new ArrayList<>();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DepthClone depthClone = (DepthClone) super.clone();
        if (!CollectionUtils.isEmpty(addressList)) {
            depthClone.addressList = (ArrayList<Address>) addressList.clone();
        }
        return depthClone;
    }


    public static void main(String[] args) {
        DepthClone depth = new DepthClone("Ximi");
        Address address = new Address();
        depth.addressList.add(address);

        try {
            DepthClone clone = (DepthClone) depth.clone();
            System.out.println(depth.addressList == clone.addressList);
            System.out.println(depth.addressList.get(0) == clone.addressList.get(0));
        } catch (Exception ex){

        }
    }
}
