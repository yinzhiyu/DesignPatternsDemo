package com.example.yinzhiyu.designpatternsdemo.strategy;

/**
 * Created by yinzhiyu on 2018-2-27.
 */

public class PrintTwoActivity implements IStratogy {
    @Override
    public void print() {
       System.out.println("打印机二开始工作");
    }
}
