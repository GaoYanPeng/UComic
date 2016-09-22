package com.lanou3g.you17.search;
 /*

Created by tliYgTong_刘德强 on 16/8/31.
*/


import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * 一级搜索页面不同类型GridView点击后进入的详情Activity
 */
public class SearchTypeDetailsActivity extends BaseActivity implements OnClickListener {

    private ImageView search_details_back;
    private SearchTypeDetailsAdapter adapter;
    private ListView listView;
    private TextView type;

    @Override
    protected int getLayout () {
        return R.layout.search_type_activity;
    }

    @Override
    public void initView () {
        search_details_back = (ImageView) findViewById (R.id.search_details_back);
        search_details_back.setOnClickListener (this);
        adapter = new SearchTypeDetailsAdapter (this);
        listView = (ListView) findViewById (R.id.details_listview);
        type = (TextView) findViewById (R.id.Gridview_type);

    }

    @Override
    protected void initData () {

        NetTool.getInstance ().startRequest (API.API_SEARCH_GRIDVIEW_DETAILS, SearchTypeDetailsBean.class, new onHttpCallBack<SearchTypeDetailsBean> () {
            @Override
            public void onSuccess (SearchTypeDetailsBean response) {
                adapter.setBean (response);
                listView.setAdapter (adapter);
                String assignmentType = getIntent ().getStringExtra ("type");
                type.setText (assignmentType);
            }

            @Override
            public void onError (Throwable e) {

            }
        });
    }

    @Override
    public void onClick (View v) {
        switch (v.getId ()) {
            case R.id.search_details_back:
                finish ();
                break;
        }

    }
}
