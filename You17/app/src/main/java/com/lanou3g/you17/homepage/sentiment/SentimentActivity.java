package com.lanou3g.you17.homepage.sentiment;

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
 * Created by 高延鹏.on 16/9/20.
 */
public class SentimentActivity extends BaseActivity {
    private ListView sentimentList;
    private StrongAdapter mStrongAdapter;
    private TextView titleType;
    @Override
    protected int getLayout() {
        return R.layout.atrong_activity;
    }

    @Override
    public void initView() {
        sentimentList = findView(R.id.atrong_lst_view);
        mStrongAdapter = new StrongAdapter(this);
        titleType = findView(R.id.title_type);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        String type  = intent.getStringExtra("type");
        titleType.setText(type);
        NetTool.getInstance().startRequest(API.SENTIMENT, StrongBean.class, new onHttpCallBack<StrongBean>() {
            @Override
            public void onSuccess(StrongBean response) {
                mStrongAdapter.setStrongBean(response.getData().getReturnData());
                sentimentList.setAdapter(mStrongAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });


    }
}
