package com.lanou3g.you17.mine;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;

/**
 * Created by dllo on 16/8/26.
 */
public class MineFragment extends BaseFragment implements OnClickListener{
    private LinearLayout mSignLayout;
    //

    @Override
    protected int initLayout() {
        return R.layout.mine_fragment;
    }

    @Override
    protected void initView() {
        mSignLayout = (LinearLayout) getView().findViewById(R.id.mine_fragment_sign_layout);
        mSignLayout.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mine_fragment_sign_layout:
                Intent intent = new Intent(getActivity(),SignActivity.class);
                startActivity(intent);
                break;
        }

    }
}
