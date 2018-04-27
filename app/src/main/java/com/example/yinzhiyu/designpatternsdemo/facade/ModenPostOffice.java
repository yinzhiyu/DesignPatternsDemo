package com.example.yinzhiyu.designpatternsdemo.facade;

/**
 * Created by yinzhiyu on 2018-3-2.
 */

public class ModenPostOffice  {
    private ILetterProcess mILetterProcess = new LetterProcessImpl();
    public void sendLetter(String context ,String address){
        mILetterProcess.writeContext(context);
        mILetterProcess.writeEnvelope(address);
        mILetterProcess.LetterIntoEnvelope();
        mILetterProcess.sendLetter();
    }
}
