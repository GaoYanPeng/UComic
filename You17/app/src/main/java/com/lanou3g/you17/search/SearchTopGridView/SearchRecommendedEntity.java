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

import android.support.v4.app.Fragment;

import com.lanou3g.you17.search.SearchGridViewBean;

import java.util.ArrayList;
import java.util.List;

//一级搜索界面 点击推荐GridView进入详情的Tablayout 实体类
public class SearchRecommendedEntity {

    private String title;
    private String type;
    private Fragment fragment;
    private SearchGridViewBean bean;


    public SearchRecommendedEntity (String title, Fragment fragment) {
        this.title = title;
        this.fragment = fragment;
    }


    public String getTitle () {
        return title;
    }

    public Fragment getFragment () {
        return fragment;
    }

    public static List<SearchRecommendedEntity> getSearchRecommendedEntity () {
        List<SearchRecommendedEntity> searchRecommendedEntities = new ArrayList<> ();
        searchRecommendedEntities.add (new SearchRecommendedEntity ("今日最热",new SearchHottestFragment ()));
        searchRecommendedEntities.add (new SearchRecommendedEntity ("人气推荐",new SearchSentimentFragment ()));
        return searchRecommendedEntities;

    }




}
