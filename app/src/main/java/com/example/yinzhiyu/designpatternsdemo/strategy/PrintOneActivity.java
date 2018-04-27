package com.example.yinzhiyu.designpatternsdemo.strategy;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by yinzhiyu on 2018-2-27.
 */

public class PrintOneActivity  implements IStratogy {
    @Override
    public void print() {
       System.out.println("打印机一开始工作");
    }
}
