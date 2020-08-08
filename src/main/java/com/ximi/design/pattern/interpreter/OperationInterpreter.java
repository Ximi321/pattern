package com.ximi.design.pattern.interpreter;

/**
 * 操作解释器
 *
 * @author Ximi
 * @since 2020/08/08
 */
public interface OperationInterpreter extends Interpreter{

    /**
     * 计算两个表示式的结果
     * @param express1 表示式1
     * @param express2 表示式2
     * @return
     * @throws ExpressException
     */
    public Number calculate(ExpressInterpreter express1,ExpressInterpreter express2) throws ExpressException;

}
