package com.lanou3g.you17.MyApp;
 /*

Created by tliYgTong_刘德强 on 16/8/31.
*/


import android.app.Application;
import android.content.Context;

public class MyApp extends Application {

    private Context sContext;
    @Override
    public void onCreate () {
        super.onCreate ();
        //this代表当前环境
        sContext=this;
    }

    //对外提供一个方法,让别的类获取自己的Context对象
    public Context getContext () {
        return sContext;
    }
}
