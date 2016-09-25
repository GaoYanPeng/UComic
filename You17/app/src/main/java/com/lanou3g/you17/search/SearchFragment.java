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
import com.lanou3g.you17.search.SearchGridView.SearchTypeDetailsActivity;
import com.lanou3g.you17.search.SearchTopGridView.SearchGridViewAdapter;
import com.lanou3g.you17.search.SearchTopGridView.SearchRecommendedActivity;
import com.lanou3g.you17.search.SearchTopGridView.SearchTitleGirdViewAdapter;
import com.lanou3g.you17.tools.API;

import java.util.List;

/**
 * Created by dllo on 16/8/26.
 */

/**
 * 一级搜索界面
 */
public class SearchFragment extends BaseFragment implements OnClickListener {

    //搜索导航栏下的GridView
    private GridView gridView;
    //搜索导航栏下的Adapter
    private SearchGridViewAdapter adapter;
    private RelativeLayout SearchNavigationBar;
    private SearchTitleGirdViewAdapter mAdapter;
    private GridView mGridView;
    private List<SearchGridViewBean.DataBean.ReturnDataBean.TopListBean> arrybean;

    @Override
    protected int initLayout () {
        return R.layout.search_fragment;
    }

    @Override
    protected void initView () {
        gridView = (GridView) getView ().findViewById (R.id.search_gridView);
        adapter = new SearchGridViewAdapter (getContext ());
        SearchNavigationBar = (RelativeLayout) getView ().findViewById (R.id.Search_navigation_bar);
        SearchNavigationBar.setOnClickListener (this);
        mAdapter = new SearchTitleGirdViewAdapter (getContext ());
        mGridView = (GridView) getView ().findViewById (R.id.search_title_gridView);
    }

    @Override
    protected void initData () {

        NetTool.getInstance ().startRequest (API.API_SEARCH_GRIDVIEW, SearchGridViewBean.class, new onHttpCallBack<SearchGridViewBean> () {
            @Override
            public void onSuccess (final SearchGridViewBean response) {

                adapter.setBean (response);
                gridView.setAdapter (adapter);
                mAdapter.setBean (response);
                mGridView.setAdapter (mAdapter);

                //搜索页面上方四个标题类型GridView,点击进入详情
                mGridView.setOnItemClickListener (new OnItemClickListener () {
                    @Override
                    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                        Intent intent=new Intent (getActivity (), SearchRecommendedActivity.class);
                        //标题获取
                        String titleType = response.getData ().getReturnData ().getTopList ().get (position).getSortName ();
                        intent.putExtra ("recommended_type", titleType);
                        //上层GridView-今日最热-拼接前半段
                        String argValue = response.getData ().getReturnData ().getTopList ().get (position).getExtra ().getTabList ().get (0).getArgValue () + "";
                        intent.putExtra ("argValue", argValue);
                        //上层GridView-今日最热-拼接后半段
                        String argCon = response.getData ().getReturnData ().getTopList ().get (position).getExtra ().getTabList ().get (0).getArgCon () + "";
                        intent.putExtra ("argCon", argCon);
                        //今日最热-拼接网址中一个特殊的字段argName
                        String argName=response.getData ().getReturnData ().getTopList ().get (position).getExtra ().getTabList ().get (0).getArgName ();
                        intent.putExtra ("argName",argName);

                        //人气总榜-拼接前半段
                        String argValues = response.getData ().getReturnData ().getTopList ().get (position).getExtra ().getTabList ().get (1).getArgValue () + "";
                        intent.putExtra ("argValues", argValues);
                        //人气总榜-拼接后半段
                        String argCons = response.getData ().getReturnData ().getTopList ().get (position).getExtra ().getTabList ().get (1).getArgCon () + "";
                        intent.putExtra ("argCons", argCons);
                        //人气总榜-拼接网址中一个特殊的字段argName
                        String argNames=response.getData ().getReturnData ().getTopList ().get (position).getExtra ().getTabList ().get (1).getArgName ();
                        intent.putExtra ("argNames",argNames);
                        startActivity (intent);


                    }
                });

                //搜索页面不同类型的girdview 点击跳转详情
                gridView.setOnItemClickListener (new OnItemClickListener () {
                    @Override
                    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent (getActivity (),SearchTypeDetailsActivity.class);
                        String type = response.getData ().getReturnData ().getRankingList ().get (position).getSortName ();
                        intent.putExtra ("type", type);
                        //下层GridView-详情拼接前半段
                        String classificationargValue=response.getData ().getReturnData ().getRankingList ().get (position).getArgValue ()+"";
                        intent.putExtra ("classificationargValue",classificationargValue);
                        //下层GridView-详情拼接后半段
                        String classificationargCon=response.getData ().getReturnData ().getRankingList ().get (position).getArgCon ()+"";
                        intent.putExtra ("classificationargCon",classificationargCon);
                        //下层GridView-拼接网址中一个特殊的字段argName
                        String classificationargName=response.getData ().getReturnData ().getRankingList ().get (position).getArgName ();
                        intent.putExtra ("classificationargName",classificationargName);
                        startActivity (intent);
                    }
                });
            }

            @Override
            public void onError (Throwable e) {

            }
        });


    }


    @Override
    public void onClick (View v) {
        switch (v.getId ()) {
            //点击搜索,跳转页面点击方法
            case R.id.Search_navigation_bar:
                startActivity (new Intent (getActivity (), SearchActivity.class));
                break;
        }

    }
}
