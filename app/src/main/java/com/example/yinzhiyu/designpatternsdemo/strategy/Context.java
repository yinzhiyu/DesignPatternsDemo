package com.example.yinzhiyu.designpatternsdemo.strategy;

/**
 * Created by yinzhiyu on 2018-2-27.
 */

public class Context {
    private IStratogy mIStratogy;

    public Context(IStratogy IStratogy) {
        mIStratogy = IStratogy;
    }

    public void print() {
        mIStratogy.print();
    }
}
