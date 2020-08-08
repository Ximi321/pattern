package com.ximi.design.pattern.interpreter;

/**
 * 表达式解析
 */
public interface ExpressInterpreter extends Interpreter {

    /**
     * 获取解析后的结果
     *
     * @return
     * @throws ExpressException
     */
    public Number getExpressResult() throws ExpressException;

}
