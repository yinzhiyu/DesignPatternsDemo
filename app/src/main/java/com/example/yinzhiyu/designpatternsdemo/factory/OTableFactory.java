package com.example.yinzhiyu.designpatternsdemo.factory;

import java.util.List;
import java.util.Random;

/**
 * Created by yinzhiyu on 2018-2-28.
 */

public class OTableFactory {

    public static IDataBase createOTable(Class c) {
        IDataBase mIDataBase = null;//定义一个类型的数据库操作
        try {
            mIDataBase = (IDataBase) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            System.out.println("发生错误！");
        } catch (IllegalAccessException e) {
//            e.printStackTrace();
            System.out.println("发生错误！");
        } catch (InstantiationException e) {
//            e.printStackTrace();
            System.out.println("发生错误！");
        }
        return mIDataBase;
    }

    public static IDataBase createOTable() {
        IDataBase mIDataBase = null;

        List<Class> IDataBaseList = ClassUtils.getAllClassByInterface(IDataBase.class);
        Random random = new Random();
        int rand = random.nextInt(IDataBaseList.size());
        mIDataBase = createOTable(IDataBaseList.get(rand));
        return mIDataBase;

    }
}
