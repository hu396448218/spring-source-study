package com.zhuguang.jack.cglib;

public class Test {
    public static void main(String[] args) {
        TargetClass instance = (TargetClass)CglibInstanceFactory.getInstance();
        instance.query();
    }
}
