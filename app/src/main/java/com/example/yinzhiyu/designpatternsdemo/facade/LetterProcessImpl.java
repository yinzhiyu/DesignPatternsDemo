package com.example.yinzhiyu.designpatternsdemo.facade;

/**
 * Created by yinzhiyu on 2018-3-2.
 */

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容...");
    }

    @Override
    public void writeEnvelope(String address) {
        System.out.println("填写收件人地址及姓名...");
    }

    @Override
    public void LetterIntoEnvelope() {
        System.out.println("把信放到信封中...");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件...");
    }
}
