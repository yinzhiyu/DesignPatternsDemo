package com.example.yinzhiyu.designpatternsdemo.singlet;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yinzhiyu on 2018-2-27.
 * 多例模式
 */

public class Multition {
    private static int maxNumOfEmperor = 2;
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Multition("皇" + (i + 1) + "帝"));
        }
    }

    public Multition() {
    }

    public Multition(String info) {
        emperorInfoList.add(info);
    }

    public static Multition getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Multition) emperorList.get(countNumOfEmperor);
    }

    public static void multitionInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
