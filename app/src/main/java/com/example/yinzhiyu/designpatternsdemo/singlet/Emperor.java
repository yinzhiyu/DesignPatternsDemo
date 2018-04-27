package com.example.yinzhiyu.designpatternsdemo.singlet;

/**
 * Created by yinzhiyu on 2018-2-27.
 * 通用单例模式
 * 直接new一个对象传递给类的成员变量 emperor
 * 你要的时候 getInstance() 直接返回给你。
 */

public class Emperor {
    private static final Emperor emperor = new Emperor();

    //限制住不能直接产生一个实例
    private Emperor() {
    }

    public synchronized static Emperor getInstance() {
        return emperor;
    }

    public void emperorName() {
        System.out.println("尹狗蛋儿！");
    }
//    public static void emperorName() {
//        System.out.println("尹狗蛋儿！");
//    }
}
