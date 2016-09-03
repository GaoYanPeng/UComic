package com.lanou3g.you17.homepage.ranking;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by 高延鹏.on 16/9/2.
 */
public class RankingFragment extends BaseFragment {
    private static final String RKF_POSITION = "position";
    private String[] URL = {API.TICKET,API.CLICK,API.TEASING,API.ALTERNATIVE,API.TERRORIST,API.JOKE
            ,API.NEW,API.MOVED
    };
    private String str;
    private ListView rankingList;
    private RFragmentAdapter mRFmAdapter;
    public static  RankingFragment newInstance(int position){
        Bundle args = new Bundle();
        Log.d("RankingFragment", "position:" + position);
        args.putInt(RKF_POSITION,position);
        RankingFragment fm = new RankingFragment();
        fm.setArguments(args);
        return fm;
    }
    @Override
    protected int initLayout() {
        return R.layout.ranking_fragment;
    }

    @Override
    protected void initView() {
        rankingList = (ListView) getView().findViewById(R.id.ranking_ls_view);

    }

    @Override
    protected void initData() {
        mRFmAdapter = new RFragmentAdapter(getContext());
        int position = 0;
        //获取传入Bundle 的位置信息,并取出
        final  Bundle args = getArguments();
        if (args != null){
            position = args.getInt(RKF_POSITION);
            str = URL[position];
        }

        NetTool.getInstance().startRequest(str, RankingBean.class, new onHttpCallBack<RankingBean>() {
            @Override
            public void onSuccess(RankingBean response) {
                mRFmAdapter.setRankingBean(response.getData().getReturnData());
                rankingList.setAdapter(mRFmAdapter);
            }
            @Override
            public void onError(Throwable e) {

            }
        });
    }
}
