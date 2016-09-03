package com.lanou3g.you17.search;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.RelativeLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by dllo on 16/8/26.
 */

/**
 * 一级搜索界面
 */
public class SearchFragment extends BaseFragment implements OnClickListener{

    //搜索导航栏下的GridView
    private GridView gridView;
    //搜索导航栏下的Adapter
    private SearchGridViewAdapter adapter;
    private RelativeLayout SearchNavigationBar;
    @Override
    protected int initLayout() {
        return R.layout.search_fragment;
    }

    @Override
    protected void initView() {
        gridView= (GridView) getView ().findViewById (R.id.search_gridView);
        adapter=new SearchGridViewAdapter(getContext ());
        SearchNavigationBar= (RelativeLayout) getView ().findViewById (R.id.Search_navigation_bar);
        SearchNavigationBar.setOnClickListener (this);
    }

    @Override
    protected void initData() {
        NetTool.getInstance ().startRequest (API.API_SEARCH_GRIDVIEW, SearchGridViewBean.class, new onHttpCallBack<SearchGridViewBean> () {
            @Override
            public void onSuccess (SearchGridViewBean response) {
                adapter.setBean (response);
                gridView.setAdapter (adapter);
            }

            @Override
            public void onError (Throwable e) {

            }
        });

        //搜索页面不同类型的girdview 点击跳转详情
        gridView.setOnItemClickListener (new OnItemClickListener () {
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent (getActivity (),SearchTypeDetailsActivity.class);


                startActivity (intent);
            }
        });
    }


    @Override
    public void onClick (View v) {
        switch (v.getId ()){
            //点击搜索,跳转页面点击方法
            case R.id.Search_navigation_bar:
                startActivity (new Intent (getActivity (),SearchActivity.class));
                break;
        }

    }
}
