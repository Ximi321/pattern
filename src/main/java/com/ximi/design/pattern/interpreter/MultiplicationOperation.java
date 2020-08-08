package com.ximi.design.pattern.interpreter;

/**
 * 乘法
 *
 * @author Ximi
 * @since 2020/08/08
 */
public class MultiplicationOperation implements OperationInterpreter{

    @Override
    public Number calculate(ExpressInterpreter express1, ExpressInterpreter express2) throws ExpressException {
        return express1.getExpressResult().doubleValue() * express2.getExpressResult().doubleValue();
    }
}
