package com.ximi.design.pattern.interpreter;

import java.util.*;

/**
 * 操作工厂
 *
 * @author Ximi
 * @since 2020/08/08
 */
public class OperationFactory {

    public static Map<String,OperationInterpreter> map = new HashMap<>();

    static {
        map.put("*",new MultiplicationOperation());
        map.put("-",new MinusOperation());
        map.put("+",new AdditionOperation());
        map.put("/",new DevideOperation());
    }

    /**
     * 获取一个操作
     * @param c
     * @return
     */
    public static OperationInterpreter getOperation(String c){
        return map.get(c);
    }

}
