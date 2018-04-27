package com.example.yinzhiyu.designpatternsdemo.adapter;

/**
 * Created by yinzhiyu on 2018-3-2.
 * 翻譯軟件，
 */

public class Translator implements IUkrainian {
    private Chinese mChinese;

    public Translator(Chinese chinese) {
        mChinese = chinese;
    }

    @Override
    public void sayUkrainian(String str) {
        mChinese.speakChinese("我是中文转成的乌克兰语"+str);
    }
}
