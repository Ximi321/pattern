package com.ximi.design.pattern.interpreter;

import sun.rmi.runtime.Log;

/**
 * 数子表达式
 *
 * @author Ximi
 * @since 2020/08/08
 */
public class NumberExpress implements ExpressInterpreter {

    //表达式
    private String express;

    public NumberExpress(String express) {
        this.express = express;
    }

    @Override
    public Number getExpressResult() throws ExpressException {
        try {
            if(express.contains(".")){
                return Double.valueOf(express);
            }else {
                return Long.valueOf(express);
            }
        } catch (Exception ex){
            throw new ExpressException(express + "解释成数字异常",ex);
        }
    }
}
