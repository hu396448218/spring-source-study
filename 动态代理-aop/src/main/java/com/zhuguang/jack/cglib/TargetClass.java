package com.zhuguang.jack.cglib;

/*
* 这里不实现接口
* */
public class TargetClass {

    public void add() {
        System.out.println("TargetClass.add");
    }

    /*
    * 这里有一个开启事务
    * */
    public void del() {
        System.out.println("TargetClass.del");
    }


    /*
    * 增强缓存
    * */
    public void query() {
        System.out.println("TargetClass.query");
    }

}
