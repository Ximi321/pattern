package com.ximi.design.pattern.template;

import java.io.File;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        UserExport userExport = new UserExport();
        File file = userExport.export(new HashMap<>());
    }

}
