package com.example.yinzhiyu.designpatternsdemo.factory;

/**
 * Created by yinzhiyu on 2018-2-28.
 */

public class OTablePeople implements IDataBase{
    @Override
    public void add() {
        System.out.println("人员表添加数据");
    }

    @Override
    public void del() {
        System.out.println("人员表删除数据");
    }

    @Override
    public void change() {
        System.out.println("人员表修改数据");
    }

    @Override
    public void query() {
        System.out.println("人员表查询数据");
    }
}
