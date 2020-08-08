package com.ximi.design.pattern.interpreter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            String express = scanner.nextLine();
            CompositeExpress compositeExpress = new CompositeExpress(express);
            Number number = compositeExpress.getExpressResult();
            System.out.printf(String.valueOf(number));
        } catch (ExpressException ex){
            ex.printStackTrace();
        }
    }

}
