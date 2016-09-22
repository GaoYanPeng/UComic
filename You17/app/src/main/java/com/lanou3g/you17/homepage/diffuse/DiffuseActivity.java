package com.lanou3g.you17.homepage.diffuse;

import android.widget.ListView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by 高延鹏.on 16/9/21.
 */
public class DiffuseActivity extends BaseActivity {
    private ListView difList;
    private DiffuseAdapter mDiffuseAdapter;

    @Override
    protected int getLayout() {
        return R.layout.diffuse_activity;
    }

    @Override
    public void initView() {
        difList= findView(R.id.dif_list);
        mDiffuseAdapter = new DiffuseAdapter(this);

    }

    @Override
    protected void initData() {
        NetTool.getInstance().startRequest(API.DIFF, DiffuseBean.class, new onHttpCallBack<DiffuseBean>() {
            @Override
            public void onSuccess(DiffuseBean response) {
                mDiffuseAdapter.setDifBean(response.getData().getReturnData());
                difList.setAdapter(mDiffuseAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }
        });

    }
}
