package com.lanou3g.you17.homepage.comic;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
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
public class ComicActivity extends BaseActivity implements OnClickListener{
    private ListView comicList;
    private StrongAdapter mComicAdapter;
    private TextView titleType;
    private ImageView comicClose;
    @Override
    protected int getLayout() {
        return R.layout.atrong_activity;
    }

    @Override
    public void initView() {
        comicList = findView(R.id.atrong_lst_view);
        mComicAdapter = new StrongAdapter(this);
        titleType = findView(R.id.title_type);
        comicClose = findView(R.id.search_details_back);
        comicClose.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        String type  = intent.getStringExtra("type");
        titleType.setText(type);

        NetTool.getInstance().startRequest(API.COMIC, StrongBean.class, new onHttpCallBack<StrongBean>() {
            @Override
            public void onSuccess(StrongBean response) {
                mComicAdapter.setStrongBean(response.getData().getReturnData());
                comicList.setAdapter(mComicAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.search_details_back:
                finish();
                break;
        }
    }
}
