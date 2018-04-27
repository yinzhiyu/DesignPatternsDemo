package com.example.yinzhiyu.designpatternsdemo.factory;

/**
 * Created by yinzhiyu on 2018-2-28.
 */

public class OTableWater implements IDataBase {
    @Override
    public void add() {
        System.out.println("水资源表添加数据");
    }

    @Override
    public void del() {
        System.out.println("水资源表删除数据");
    }

    @Override
    public void change() {
        System.out.println("水资源表修改数据");
    }

    @Override
    public void query() {
        System.out.println("水资源表查询数据");
    }
}
