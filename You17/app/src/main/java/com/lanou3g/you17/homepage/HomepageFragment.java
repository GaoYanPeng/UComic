package com.lanou3g.you17.homepage;

import com.lanou3g.you17.base.BaseFragment;


import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.ranking.RankingActivity;
import com.lanou3g.you17.homepage.shuffling.ShufflingFigureAdapter;
import com.lanou3g.you17.homepage.singning.SingningActivity;
import com.lanou3g.you17.homepage.topic.TopicActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by dllo on 16/8/26.
 */
public class HomepageFragment extends BaseFragment implements OnClickListener {
    private RecyclerView mHomeRecyclerView;        private RelativeLayout mSigning;
    private HomeAdapter mHomeAdapter;               private RelativeLayout mTopic;
    private RelativeLayout rankingLayout;
    private Intent mIntent;
    private ViewPager vp;
    private boolean mm = true;
    private boolean flags = true;
    private Handler handler;
    private ImageView[] tips;
    private LinearLayout llturn;
    private ShufflingFigureAdapter adapter;


    @Override
    protected int initLayout() {
        return R.layout.homepager_fragment;
    }

    @Override
    protected void initView() {
        mHomeRecyclerView = (RecyclerView) getView().findViewById(R.id.all_recyclerview);
        mHomeAdapter = new HomeAdapter(getContext());
        LayoutManager lm = new LinearLayoutManager(getContext());
        mHomeRecyclerView.setLayoutManager(lm);
        rankingLayout = (RelativeLayout) getView().findViewById(R.id.ranking);
        mSigning = (RelativeLayout) getView().findViewById(R.id.home_signing);
        mTopic = (RelativeLayout) getView().findViewById(R.id.home_topic);

        adapter = new ShufflingFigureAdapter (getContext ());
        vp = (ViewPager) getView ().findViewById (R.id.vp);
        llturn = (LinearLayout) getView ().findViewById (R.id.ll_turn);
        vp.setAdapter (adapter);



        rankingLayout.setOnClickListener(this);
        mSigning.setOnClickListener(this);
        mTopic.setOnClickListener(this);
    }



    @Override
    protected void initData() {
        Log.d("HomepageFragment", "EEEEEEEEEE");
        NetTool.getInstance().startRequest(API.HOME, HomeBean.class, new onHttpCallBack<HomeBean>() {
            @Override
            public void onSuccess(HomeBean response) {


                mHomeAdapter.setHomeBean(response.getData().getReturnData());
                mHomeRecyclerView.setAdapter(mHomeAdapter);
                Log.d("HomepageFragment", "EEEEEEEEEE00000");

            }

            @Override
            public void onError(Throwable e) {
            }
        });

        handler = new Handler (new Handler.Callback () {
            @Override
            public boolean handleMessage (Message message) {
                vp.setCurrentItem (vp.getCurrentItem () + 1);


                return false;
            }
        });
        if (mm) {
            new Thread (new Runnable () {
                @Override
                public void run () {
                    while (flags) {
                        try {
                            Thread.sleep (3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                        handler.sendEmptyMessage (0);
                    }
                }
            }).start ();
            mm = false;
        }

        getFigure();
    }

    /**
     * 轮播图
     */
    private void getFigure() {
        NetTool.getInstance ().startRequest (API.HOME, HomeBean.class, new onHttpCallBack<HomeBean>() {
            @Override
            //成功时进行:
            public void onSuccess (final HomeBean response) {
                adapter.setShufflingBean (response);

                vp.addOnPageChangeListener (new OnPageChangeListener() {
                    @Override
                    public void onPageScrolled (int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected (int position) {
                        for (int i = 0; i < response.getData ().getReturnData ().getGalleryItems ().size (); i++) {
                            if (i == position % response.getData ().getReturnData ().getGalleryItems ().size ()) {
                                //选中的小白点
                                tips[i].setImageResource (R.mipmap.icon_game_dot_selected);
                            } else {
                                //未选中的
                                tips[i].setImageResource (R.mipmap.icon_game_dot_unselected);
                            }
                        }
                    }

                    @Override
                    public void onPageScrollStateChanged (int state) {

                    }
                });
                try {
                    tips = new ImageView[response.getData ().getReturnData ().getGalleryItems ().size ()];
                    for (int i = 0; i < response.getData ().getReturnData ().getGalleryItems ().size (); i++) {
                        ImageView imageView = new ImageView (getContext ());
                        imageView.setLayoutParams (new LinearLayout.LayoutParams (15, 15));
                        tips[i] = imageView;
                        if (i == 0) {
                            imageView.setImageResource (R.mipmap.icon_game_dot_selected);
                        } else {
                            imageView.setImageResource (R.mipmap.icon_game_dot_unselected);
                        }
                        LinearLayout.LayoutParams layoutParms = new LinearLayout.LayoutParams (15, 15);
                        layoutParms.leftMargin = 5;
                        layoutParms.rightMargin = 5;
                        llturn.addView (imageView, layoutParms);
                    }
                    adapter.setTips (tips);
                } catch (Exception e) {

                }
            }

            @Override
            public void onError (Throwable e) {

            }
        });
    }

//.........................排名....................................................


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ranking:
                mIntent = new Intent(getActivity(), RankingActivity.class);
                startActivity(mIntent);
                break;
            case R.id.home_signing:
                mIntent = new Intent(getActivity(),SingningActivity.class);
                startActivity(mIntent);
                break;
            case R.id.home_topic:
                mIntent = new Intent(getActivity(), TopicActivity.class);
                startActivity(mIntent);
                break;
        }

    }

}
