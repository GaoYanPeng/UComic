package com.lanou3g.you17.homepage;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;
import com.lanou3g.you17.homepage.ranking.RankingActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by dllo on 16/8/26.
 */
public class HomepageFragment extends BaseFragment implements OnClickListener {
    private RecyclerView mHomeRecyclerView;
    private HomeAdapter mHomeAdapter;
    private RelativeLayout rankingLayout;
    private Intent mIntent;

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
        rankingLayout.setOnClickListener(this);
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
    }
//.........................排名....................................................


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ranking:
                mIntent = new Intent(getActivity(), RankingActivity.class);
                startActivity(mIntent);
                break;
        }

    }
}
