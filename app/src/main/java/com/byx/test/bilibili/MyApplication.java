package com.byx.test.bilibili;

import android.app.Application;
import android.content.Context;

/**
 * Created by bob
 * Date : 21-9-1
 * Describe :
 */
public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = getApplicationContext();//获取全局变量，MyApplication.context
        init();
    }

    //为啥不在这个类判断支持nfc
    //为啥每个fragment又有一个子级？厨房是因为同级还有另一层页面，你这个没必要啊
    //建议bean写在同一包，不然以后。算了，再说吧

    /**
     * 初始化操作
     */
    public void init(){

    }

    /**
     * 得到全局context
     * @return
     */
    public static Context getContext() {
        return context;
    }

}
