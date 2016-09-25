package com.lanou3g.you17.search.SearchTopGridView;
 /*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         佛祖保佑       永无BUG

Created by Android_刘德强 on 16/9/21.
*/

import android.content.Intent;
import android.widget.ListView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

//一级界面点击推荐GridView进入详情Tablayout中人气总榜的Fragment
public class SearchSentimentFragment extends BaseFragment{

    private SearchSentimentAdapter adapter;
    private ListView listView;

    @Override
    protected int initLayout () {
        return R.layout.search_sentiment_fragment;
    }

    @Override
    protected void initView () {
        listView= (ListView) getView ().findViewById (R.id.SearchSentimentListView);
        adapter=new SearchSentimentAdapter (getContext ());

    }

    @Override
    protected void initData () {
        Intent intent = getActivity ().getIntent ();
        String argValue = intent.getStringExtra ("argValues");
        String argCon = intent.getStringExtra ("argCons");
        String argName=intent.getStringExtra ("argNames");
        String Url=API.HottestargValue+argValue+ API.HottestArgName+argName+API.HottestargCon+argCon+API.Hottest;

        NetTool.getInstance ().startRequest (Url, SearchHottestBean.class, new onHttpCallBack<SearchHottestBean> () {
            @Override
            public void onSuccess (SearchHottestBean response) {
                adapter.setBean (response);
                listView.setAdapter (adapter);
            }

            @Override
            public void onError (Throwable e) {

            }
        });

    }
}
