package com.lanou3g.you17.homepage.singning;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by 高延鹏.on 16/9/3.
 */
public class SingningActivity extends BaseActivity implements OnClickListener{
    private ListView singList;
    private RelativeLayout singDelete;
    private SingAdapter mSingAdapter;
    private RecyclerView mRecyclerView;
    private SingRecyclerAdapter mRecyclerAdapter;
    private LinearLayout upLinLayout;
    private PopupWindow singPop;
    private View mView;

    @Override
    protected int getLayout() {
        return R.layout.singning_activity;
    }

    @Override
    public void initView() {
        singList = findView(R.id.singning_ls_view);
        singDelete = findView(R.id.singning_delete);
        upLinLayout = findView(R.id.sing_update);
        mSingAdapter = new SingAdapter(this);
        singDelete.setOnClickListener(this);
        upLinLayout.setOnClickListener(this);
        View view = LayoutInflater.from(this).inflate(R.layout.sing_header,null);
        mRecyclerView  = (RecyclerView) view.findViewById(R.id.sing_reaycler);
        singList.addHeaderView(view);
        mRecyclerAdapter = new SingRecyclerAdapter(this);

        mView = getLayoutInflater().inflate(R.layout.sing_pop,null,false);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(manager);

    }

    @Override
    protected void initData() {
        NetTool.getInstance().startRequest(API.SING_UPDATE, SingBean.class, new onHttpCallBack<SingBean>() {
            @Override
            public void onSuccess(SingBean response) {
                mSingAdapter.setSingBean(response.getData().getReturnData());
                singList.setAdapter(mSingAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });

        NetTool.getInstance().startRequest(API.SING_UPDATE, SingBean.class, new onHttpCallBack<SingBean>() {
            @Override
            public void onSuccess(SingBean response) {
                mRecyclerAdapter.setSingRyBean(response.getData().getReturnData());
                mRecyclerView.setAdapter(mRecyclerAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.singning_delete:
                finish();
                break;
            case R.id.sing_update:
                singPop = new PopupWindow(mView, LayoutParams.WRAP_CONTENT,
                        WindowManager.LayoutParams.WRAP_CONTENT);
                singPop.setAnimationStyle(R.style.AnimationSing);
                singPop.setFocusable(true);
                singPop.showAtLocation(v, Gravity.LEFT,890,-320);
                backgroundAlpha(0.8f);
                mView.setOnTouchListener(new OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if (singPop != null && singPop.isShowing()){
                            singPop.dismiss();
                            backgroundAlpha(1f);
                            singPop = null;
                        }
                        return true;
                    }
                });
                break;
        }
    }
    public void backgroundAlpha(float bgAlpha) {
        //设全屏
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = bgAlpha;
        getWindow().setAttributes(lp);
    }
}
