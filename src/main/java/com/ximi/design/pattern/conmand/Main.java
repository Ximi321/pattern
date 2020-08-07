package com.ximi.design.pattern.conmand;

import org.springframework.util.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ConmandExecutor executor = new ConmandExecutor();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String conmandText = scanner.nextLine();
            if(!StringUtils.isEmpty(conmandText)){
                String[] conmandParams = conmandText.split(" ");
                Conmand conmand = ConmandFactory.createConmand(conmandParams);
                if(conmand != null){
                    executor.executeConmand(conmand);
                }else {
                    System.out.printf("命令不正确\n");
                }
            }
        }

    }
}
