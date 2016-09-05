package com.lanou3g.you17.mine;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;

/**
 * "我的"页面
 */
public class MineFragment extends BaseFragment implements OnClickListener{
    private LinearLayout mSignLayout;
    private  LinearLayout recordsConsumption;
    private LinearLayout Top_up_layout;
    private LinearLayout subscription;



    @Override
    protected int initLayout() {
        return R.layout.mine_fragment;
    }

    @Override
    protected void initView() {
        mSignLayout = (LinearLayout) getView().findViewById(R.id.mine_fragment_sign_layout);
        mSignLayout.setOnClickListener(this);
        recordsConsumption= (LinearLayout) getView ().findViewById (R.id.recordsConsumption);
        recordsConsumption.setOnClickListener (this);
        Top_up_layout= (LinearLayout) getView ().findViewById (R.id.Top_up_layout);
        Top_up_layout.setOnClickListener (this);
        subscription= (LinearLayout) getView ().findViewById (R.id.subscription);
        subscription.setOnClickListener (this);


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
            case R.id.recordsConsumption:
                startActivity (new Intent (getActivity (),RecordsConsumptionActivity.class));
                break;
            case R.id.Top_up_layout:
                startActivity (new Intent (getActivity (),Top_up_Activity.class));
                break;
            case R.id.subscription:
                startActivity (new Intent (getActivity (),SubscriptionActivity.class));
                break;
        }

    }
}
