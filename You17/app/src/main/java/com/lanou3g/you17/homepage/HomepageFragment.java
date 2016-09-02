package com.lanou3g.you17.homepage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.Log;
import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;

/**
 * Created by dllo on 16/8/26.
 */
public class HomepageFragment extends BaseFragment {
    private RecyclerView mHomeRecyclerView;
    private HomeAdapter mHomeAdapter;
    private static final String HOME = "http://app.u17.com/v3/appV3/android/phone/comic/boutiqueListNew?" +
            "android_id=3d6f8f613d878af1&v=3110099&model=Google+Nexus+5+-+4.4.4+-+API+19+-+1080x1920&come_" +
            "from=shouji360&key=6d785a6a482c2cc66517a5d09013c229dbd145e4f4b34e8ebc04b0c04a4836f8781a2df660e4" +
            "d74643aa584acfe831971b56c7e25ce7f16e1e51974feadd1da813bd70d86590efbaf0deacbdd0a4824ee179ae3fbbc0" +
            "89913559b6cf6e4da37587b212717e08ed56%253A%253A%253Au17";

    @Override
    protected int initLayout() {
        return R.layout.homepager_fragment;
    }

    @Override
    protected void initView() {
        mHomeRecyclerView = (RecyclerView) getView().findViewById(R.id.all_recyclerview);
        mHomeAdapter = new HomeAdapter(getContext());
        LayoutManager lm= new LinearLayoutManager(getContext());
        mHomeRecyclerView.setLayoutManager(lm);

    }

    @Override
    protected void initData() {
        Log.d("HomepageFragment", "EEEEEEEEEE");
        NetTool.getInstance().startRequest(HOME, HomeBean.class, new onHttpCallBack<HomeBean>() {
            @Override
            public void onSuccess(HomeBean response) {


                mHomeAdapter.setHomeBean(response);
                mHomeRecyclerView.setAdapter(mHomeAdapter);
                Log.d("HomepageFragment", "EEEEEEEEEE00000");

            }

            @Override
            public void onError(Throwable e) {
            }
        });
    }
}
