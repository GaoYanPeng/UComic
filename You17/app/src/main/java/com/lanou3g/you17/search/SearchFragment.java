package com.lanou3g.you17.search;

import android.widget.GridView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by dllo on 16/8/26.
 */
//搜索页面
public class SearchFragment extends BaseFragment {

    //搜索导航栏下的GridView
    private GridView gridView;
    //搜索导航栏下的Adapter
    private SearchGridViewAdapter adapter;
    @Override
    protected int initLayout() {
        return R.layout.search_fragment;
    }

    @Override
    protected void initView() {
        gridView= (GridView) getView ().findViewById (R.id.search_gridView);
        adapter=new SearchGridViewAdapter(getContext ());
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

    }
}
