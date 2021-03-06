package com.lanou3g.you17.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by dllo on 16/8/2.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        initData();
    }

    //获取布局
    protected abstract int getLayout();

    //绑定控件
    public abstract void initView();

    //初始化数据
    protected abstract void initData();

    public <T extends View>T findView(int id){
        return (T) findViewById(id);
    }
}
