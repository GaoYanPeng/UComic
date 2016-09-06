package com.lanou3g.you17.homepage.animation;

import android.widget.ListView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by 高延鹏.on 16/9/6.
 */
public class AnimationActivity extends BaseActivity {
    private ListView animList;
    private AnimationAdapter mAnimationAdapter;
    @Override
    protected int getLayout() {
        return R.layout.anim_activity;
    }

    @Override
    public void initView() {

        animList = findView(R.id.anim_ls_view);
//        mAnimationAdapter = new AnimationAdapter(this);
    }

    @Override
    protected void initData() {
        NetTool.getInstance().startRequest(API.TOP_ANIMATION, AnimationBean.class, new onHttpCallBack<AnimationBean>() {
            @Override
            public void onSuccess(AnimationBean response) {
//                mAnimationAdapter.setAnimationBean(response);
//                animList.setAdapter(mAnimationAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });

    }
}
