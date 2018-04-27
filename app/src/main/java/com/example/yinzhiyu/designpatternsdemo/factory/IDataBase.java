package com.example.yinzhiyu.designpatternsdemo.factory;

/**
 * Created by yinzhiyu on 2018-2-28.
 * 定义一个接口，关于数据库的基本操作
 */

public interface IDataBase {
    //增
    void add();

    //删
    void del();

    //改
    void change();

    //查
    void query();
}
