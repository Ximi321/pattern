package com.ximi.design.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 复合表示式,目前写的比较烂
 *
 *
 * @author Ximi
 * @since 2020/08/08
 */
public class CompositeExpress implements ExpressInterpreter {

    private String express;
    private List<Interpreter> interpreters = new ArrayList<>();

    public CompositeExpress(String express) {
        this.express = express;
    }

    @Override
    public Number getExpressResult() throws ExpressException {
        explainExpress();
        verificationExpress();
        priorityCalculate();
        return finishResult();
    }

    /**
     * 解析表达式
     *
     * @return
     */
    private void explainExpress() throws ExpressException {
        //把表示式中的空格删除掉
        express = express.replace(" ", "");
        //子表示式
        StringBuilder childExpress = new StringBuilder();
        //记录左右括号数量
        Integer leftBracket = 0;
        Integer rightBracket = 0;
        for (int index = 0; index < express.length(); index++) {

            if ('(' == express.charAt(index)) {
                leftBracket++;
                if (leftBracket > 1) {
                    childExpress.append(express.charAt(index));
                }
                continue;
            }

            if (')' == express.charAt(index)) {
                rightBracket++;
                if (leftBracket == rightBracket) {  //左右括号数量相等
                    interpreters.add(new CompositeExpress(childExpress.toString()));
                    childExpress.setLength(0);
                    rightBracket = 0;
                    leftBracket = 0;
                    continue;
                }

                if (rightBracket > leftBracket) {  //右括号的数量大于左括号
                    throw new ExpressException("表示式解析异常");
                }
                childExpress.append(express.charAt(index));
                continue;
            }

            if (leftBracket > rightBracket) {
                childExpress.append(express.charAt(index));
                continue;
            }

            if ('*' == express.charAt(index)
                    || '/' == express.charAt(index)
                    || '-' == express.charAt(index)
                    || '+' == express.charAt(index)) {
                if (childExpress.length() > 0) {
                    interpreters.add(new NumberExpress(childExpress.toString()));
                    childExpress.setLength(0);
                }
                interpreters.add(OperationFactory.getOperation(String.valueOf(express.charAt(index))));
                continue;
            }

            childExpress.append(express.charAt(index));
            if (index == express.length() - 1) {

                if(leftBracket != 0){
                    throw new ExpressException("表示式错误");
                }

                interpreters.add(new NumberExpress(childExpress.toString()));
            }
        }
    }

    /**
     * 验证表示式
     *
     * @throws ExpressException
     */
    private void verificationExpress() throws ExpressException {
        if (interpreters.size() <= 0 || interpreters.size() % 2 == 0) {
            throw new ExpressException("解析异常");
        }

        for (int index = 0; index < interpreters.size(); index++) {
            if (index % 2 == 0 && !(interpreters.get(index) instanceof ExpressInterpreter)) {
                throw new ExpressException("解析异常");
            }
            if (index % 2 == 1 && !(interpreters.get(index) instanceof OperationInterpreter)) {
                throw new ExpressException("解析异常");
            }
        }
    }

    /**
     * 优先计算(* or /)
     */
    private void priorityCalculate() throws ExpressException {
        List<Interpreter> list = new ArrayList<>();
        for (int index = 0; index < interpreters.size(); index++) {
            if (interpreters.get(index) instanceof MultiplicationOperation
                    || interpreters.get(index) instanceof DevideOperation) {
                Number number = ((OperationInterpreter) interpreters.get(index)).calculate(
                        (ExpressInterpreter) list.get(list.size() - 1),
                        (ExpressInterpreter) interpreters.get(++index));
                list.set(list.size() - 1, new NumberExpress(String.valueOf(number.doubleValue())));
                continue;
            }
            list.add(interpreters.get(index));
        }
        interpreters = list;
    }

    /**
     * 计算最后的结果
     *
     * @return
     * @throws ExpressException
     */
    private Number finishResult() throws ExpressException {
        Number number = ((ExpressInterpreter) interpreters.get(0)).getExpressResult();
        for (int index = 1; index < interpreters.size(); index += 2) {
            OperationInterpreter operation = (OperationInterpreter) interpreters.get(index);
            ExpressInterpreter express = (ExpressInterpreter) interpreters.get(index + 1);
            number = operation.calculate(new NumberExpress(String.valueOf(number.doubleValue())), express);
        }
        return number;
    }

}
