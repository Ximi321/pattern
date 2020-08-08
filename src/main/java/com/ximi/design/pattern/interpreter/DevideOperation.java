package com.ximi.design.pattern.interpreter;

/**
 * 除法操作
 *
 * @author Ximi
 * @since 2020/08/08
 */
public class DevideOperation implements OperationInterpreter {

    @Override
    public Number calculate(ExpressInterpreter express1, ExpressInterpreter express2) throws ExpressException {
        return express1.getExpressResult().doubleValue() / express2.getExpressResult().doubleValue();
    }
}
