package com.lanou3g.you17.homepage.singning;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
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
import android.widget.TextView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by 高延鹏.on 16/9/3.
 */
public class SingningActivity extends BaseActivity implements OnClickListener, OnRefreshListener {
    private ListView singList;
    private RelativeLayout singDelete;
    private SingAdapter mSingAdapter;
    private RecyclerView mRecyclerView;
    private SingRecyclerAdapter mRecyclerAdapter;
    private LinearLayout upLinLayout;
    private PopupWindow singPop;
    private View mView;
    private TextView singUpdate, singTicket, singClick, singYoung, singGril;
    private SwipeRefreshLayout swpl;

    @Override
    protected int getLayout() {
        return R.layout.singning_activity;
    }

    @Override
    public void initView() {
        singList = findView(R.id.singning_ls_view);
        singDelete = findView(R.id.singning_delete);
        upLinLayout = findView(R.id.sing_update);
        swpl = findView(R.id.swrl);
        swpl.setOnRefreshListener(this);
        mSingAdapter = new SingAdapter(this);
        singDelete.setOnClickListener(this);
        upLinLayout.setOnClickListener(this);

        View view = LayoutInflater.from(this).inflate(R.layout.sing_header, null);
        mView = getLayoutInflater().inflate(R.layout.sing_pop, null, false);
        singUpdate = (TextView) mView.findViewById(R.id.sing_pop_update);
        singTicket = (TextView) mView.findViewById(R.id.sing_pop_ticket);
        singClick = (TextView) mView.findViewById(R.id.sing_pop_click);
        singYoung = (TextView) mView.findViewById(R.id.sing_pop_young);
        singGril = (TextView) mView.findViewById(R.id.sing_pop_gril);
        singUpdate.setOnClickListener(this);
        singTicket.setOnClickListener(this);
        singClick.setOnClickListener(this);
        singYoung.setOnClickListener(this);
        singGril.setOnClickListener(this);


        mRecyclerView = (RecyclerView) view.findViewById(R.id.sing_reaycler);
        singList.addHeaderView(view);
        mRecyclerAdapter = new SingRecyclerAdapter(this);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(manager);

    }

    @Override
    protected void initData() {
        getUpdate();
        getHeard();


    }

    private void getGril() {
        NetTool.getInstance().startRequest(API.SING_GIRL, SingBean.class, new onHttpCallBack<SingBean>() {
            @Override
            public void onSuccess(SingBean response) {
                mSingAdapter.setSingBean(response.getData().getReturnData());
                singList.setAdapter(mSingAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    /**
     * 少年
     */
    private void getYoung() {
        NetTool.getInstance().startRequest(API.SING_YOUNG, SingBean.class, new onHttpCallBack<SingBean>() {
            @Override
            public void onSuccess(SingBean response) {
                mSingAdapter.setSingBean(response.getData().getReturnData());
                singList.setAdapter(mSingAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    /**
     * 点击
     */
    private void getClick() {
        NetTool.getInstance().startRequest(API.SING_CLICK, SingBean.class, new onHttpCallBack<SingBean>() {
            @Override
            public void onSuccess(SingBean response) {
                mSingAdapter.setSingBean(response.getData().getReturnData());
                singList.setAdapter(mSingAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    /**
     * 月票
     */
    private void getTicket() {
        NetTool.getInstance().startRequest(API.SING_TICKET, SingBean.class, new onHttpCallBack<SingBean>() {
            @Override
            public void onSuccess(SingBean response) {
                mSingAdapter.setSingBean(response.getData().getReturnData());
                singList.setAdapter(mSingAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    /**
     * 头布局
     */
    private void getHeard() {
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

    /**
     * 更新
     */
    private void getUpdate() {
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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.singning_delete:
                finish();
                break;
            case R.id.sing_update:
                singPop = new PopupWindow(mView, LayoutParams.WRAP_CONTENT,
                        WindowManager.LayoutParams.WRAP_CONTENT);
                singPop.setAnimationStyle(R.style.AnimationSing);
                singPop.setFocusable(true);
                singPop.showAtLocation(v, Gravity.LEFT, 890, -320);
                backgroundAlpha(0.8f);
                mView.setOnTouchListener(new OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if (singPop != null && singPop.isShowing()) {
                            singPop.dismiss();
                            backgroundAlpha(1f);
                            singPop = null;
                        }
                        return true;
                    }
                });
                break;
            case R.id.sing_pop_update:
                getUpdate();
                swpl.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        swpl.setRefreshing(false);

                        getUpdate();
                    }
                });
                singPop.dismiss();
                backgroundAlpha(1f);
                break;
            case R.id.sing_pop_ticket:
                getTicket();
                swpl.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        swpl.setRefreshing(false);
                        getTicket();
                    }
                });

                singPop.dismiss();
                backgroundAlpha(1f);
                break;
            case R.id.sing_pop_click:
                swpl.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        getClick();
                        swpl.setRefreshing(false);
                    }
                });
                getClick();
                singPop.dismiss();
                backgroundAlpha(1f);
                break;
            case R.id.sing_pop_young:
                swpl.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        getYoung();
                        swpl.setRefreshing(false);

                    }
                });
                getYoung();
                singPop.dismiss();
                backgroundAlpha(1f);
                break;
            case R.id.sing_pop_gril:
                swpl.setOnRefreshListener(new OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        getGril();
                        swpl.setRefreshing(false);

                    }
                });
                getGril();
                singPop.dismiss();
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
        getUpdate();
        getHeard();
        swpl.setRefreshing(false);
    }
}
