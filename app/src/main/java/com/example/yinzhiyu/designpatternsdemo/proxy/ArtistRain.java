package com.example.yinzhiyu.designpatternsdemo.proxy;

/**
 * Created by yinzhiyu on 2018-2-27.
 */

public class ArtistRain implements IStudio {
    @Override
    public void singing() {
        System.out.println("Rain唱歌");
    }

    @Override
    public void dangcing() {
        System.out.println("Rain跳舞");
    }
}
