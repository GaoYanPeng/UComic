package com.lanou3g.you17.homepage.upadte;

import android.content.Intent;
import android.widget.ListView;
import android.widget.TextView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.homepage.strong.StrongAdapter;
import com.lanou3g.you17.homepage.strong.StrongBean;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by 高延鹏.on 16/9/21.
 */
public class UpdateItemActivity extends BaseActivity{
    private ListView updateLis;
    private StrongAdapter mUpdateAdapter;
    private TextView titleType;
    @Override
    protected int getLayout() {
        return R.layout.atrong_activity;
    }

    @Override
    public void initView() {
        updateLis = findView(R.id.atrong_lst_view);
        mUpdateAdapter = new StrongAdapter(this);
        titleType = findView(R.id.title_type);

    }

    @Override
    protected void initData() {
        //更改title
        Intent intent = getIntent();
        String type  = intent.getStringExtra("type");
        titleType.setText(type);

        NetTool.getInstance().startRequest(API.UPDATE, StrongBean.class, new onHttpCallBack<StrongBean>() {
            @Override
            public void onSuccess(StrongBean response) {
                mUpdateAdapter.setStrongBean(response.getData().getReturnData());
                updateLis.setAdapter(mUpdateAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });



    }
}
