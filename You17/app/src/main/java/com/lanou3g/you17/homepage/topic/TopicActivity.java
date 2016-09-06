package com.lanou3g.you17.homepage.topic;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by 高延鹏.on 16/9/5.
 */
public class TopicActivity extends BaseActivity implements OnClickListener,OnRefreshListener{

    private ListView topList;
    private TopicAdapter mTopicAdapter;
    private RelativeLayout topPop;
    private PopupWindow mTopPop;

    private SwipeRefreshLayout mTopSwi;
    private TextView topAll,topComm,topSpace;
    private View mPopView;

    @Override
    protected int getLayout() {
        return R.layout.topic_activity;
    }

    @Override
    public void initView() {
        topList = findView(R.id.topic_ls_view);
        mTopSwi = findView(R.id.top_sw);
        mTopicAdapter = new TopicAdapter(this);
      View  view = LayoutInflater.from(this).inflate(R.layout.top_tali,null,false);
        mPopView = LayoutInflater.from(this).inflate(R.layout.top_pop,null,false);

        topAll = (TextView) mPopView.findViewById(R.id.top_pop_all);
        topComm = (TextView) mPopView.findViewById(R.id.top_pop_comm);
        topSpace = (TextView) mPopView.findViewById(R.id.top_pop_space);

        topPop = findView(R.id.top_pop);
        topPop.setOnClickListener(this);
        mTopSwi.setOnRefreshListener(this);
        topAll .setOnClickListener(this);
        topComm.setOnClickListener(this);
        topSpace.setOnClickListener(this);

        topList.addFooterView(view);

    }

    @Override
    protected void initData() {
        getTopAll();


    }

    private void getSpace() {
        NetTool.getInstance().startRequest(API.TOP_SPACE, TopicBean.class, new onHttpCallBack<TopicBean>() {
            @Override
            public void onSuccess(TopicBean response) {
                mTopicAdapter.setTopicBean(response.getData().getReturnData());
                topList.setAdapter(mTopicAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    private void getcomm() {
        NetTool.getInstance().startRequest(API.TOP_RECOM, TopicBean.class, new onHttpCallBack<TopicBean>() {
            @Override
            public void onSuccess(TopicBean response) {
                mTopicAdapter.setTopicBean(response.getData().getReturnData());
                topList.setAdapter(mTopicAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    private void getTopAll() {
        NetTool.getInstance().startRequest(API.TOP_ALL, TopicBean.class, new onHttpCallBack<TopicBean>() {
            @Override
            public void onSuccess(TopicBean response) {
                mTopicAdapter.setTopicBean(response.getData().getReturnData());
                topList.setAdapter(mTopicAdapter);


            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        case R.id.top_pop:
           mTopPop = new PopupWindow(mPopView, LayoutParams.WRAP_CONTENT,
                    WindowManager.LayoutParams.WRAP_CONTENT);
            mTopPop.setAnimationStyle(R.style.AnimationTopic);
            mTopPop.setFocusable(true);
            mTopPop.showAtLocation(v, Gravity.CENTER, 0, -350);
            backgroundAlpha(0.8f);
            mPopView.setOnTouchListener(new OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (mTopPop != null && mTopPop.isShowing()) {
                        mTopPop.dismiss();
                        backgroundAlpha(1f);
                        mTopPop = null;
                    }
                    return true;
                }
            });
            break;
            case R.id.top_pop_all:
                mTopSwi.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        getTopAll();
                        mTopSwi.setRefreshing(false);
                    }
                });
                getTopAll();
                mTopPop.dismiss();
                backgroundAlpha(1f);

                break;
            case R.id.top_pop_comm:
                mTopSwi.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        getcomm();
                        mTopSwi.setRefreshing(false);
                    }
                });
                getcomm();
                mTopPop.dismiss();
                backgroundAlpha(1f);
                break;
            case R.id.top_pop_space:
                mTopSwi.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        getSpace();
                        mTopSwi.setRefreshing(false);
                    }
                });
                getSpace();
                mTopPop.dismiss();
                backgroundAlpha(1f);
                break;
        }


    }
    public void backgroundAlpha(float bgAlpha) {
        //设全屏
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = bgAlpha;
        getWindow().setAttributes(lp);
    }

    @Override
    public void onRefresh() {
        mTopSwi.setRefreshing(false);
    }
}
