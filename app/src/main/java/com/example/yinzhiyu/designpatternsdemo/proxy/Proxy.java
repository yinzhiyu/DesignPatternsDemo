package com.example.yinzhiyu.designpatternsdemo.proxy;

/**
 * Created by yinzhiyu on 2018-2-27.
 */

public class Proxy implements IStudio {
    private IStudio mIStudio;

    public Proxy() {
        mIStudio = new ArtistRain();
    }

    public Proxy(IStudio IStudio) {
        mIStudio = IStudio;
    }

    @Override
    public void singing() {
        mIStudio.singing();
    }

    @Override
    public void dangcing() {
        mIStudio.dangcing();
    }
}
