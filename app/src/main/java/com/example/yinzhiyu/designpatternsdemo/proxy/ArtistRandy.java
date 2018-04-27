package com.example.yinzhiyu.designpatternsdemo.proxy;

/**
 * Created by yinzhiyu on 2018-2-27.
 */

public class ArtistRandy implements IStudio {
    @Override
    public void singing() {
        System.out.println("Randy去WWE摔跤");
    }

    @Override
    public void dangcing() {
        System.out.println("Randy去另一個地方摔跤");
    }
}
