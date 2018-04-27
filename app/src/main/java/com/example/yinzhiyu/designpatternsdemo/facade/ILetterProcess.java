package com.example.yinzhiyu.designpatternsdemo.facade;

/**
 * Created by yinzhiyu on 2018-3-2.
 */

public interface ILetterProcess {
    void writeContext(String context);//写信内容

    void writeEnvelope(String address);//写信封

    void LetterIntoEnvelope();//把信放到信封中

    void sendLetter();//邮寄信件
}
