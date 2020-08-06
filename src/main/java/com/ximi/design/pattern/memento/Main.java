package com.ximi.design.pattern.memento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SnapshotHolder snapshotHolder = new SnapshotHolder();
        InputText inputText = new InputText();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String text = scanner.next();
            if(":list".equals(text)){
                System.out.println(inputText.getText());
            }else if(":undo".equals(text)){
                Snapshot snapshot = snapshotHolder.popSnapshot();
                if(null != snapshot){
                    inputText.restoreSnapshot(snapshot);
                }
            }else {
                snapshotHolder.pushSnapshot(inputText.createSnapshot());
                inputText.append(text);
            }
        }
    }
}
