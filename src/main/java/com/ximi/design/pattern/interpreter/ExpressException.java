package com.ximi.design.pattern.interpreter;

/**
 * 解析异常
 *
 * @author Ximi
 * @since 2020/08/08
 */
public class ExpressException extends Exception {

    public ExpressException(String message) {
        super(message);
    }

    public ExpressException(String message, Throwable cause) {
        super(message, cause);
    }
}
