package com.example.yinzhiyu.designpatternsdemo.strategy;

/**
 * Created by yinzhiyu on 2018-2-27.
 */

public class PrintThreeActivity implements IStratogy {
    @Override
    public void print() {
       System.out.println("打印机三开始工作");
    }
}
