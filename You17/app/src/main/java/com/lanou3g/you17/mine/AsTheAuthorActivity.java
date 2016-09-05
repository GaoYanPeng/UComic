package com.lanou3g.you17.mine;
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

Created by tliYgTong_刘德强 on 16/9/5.
*/


import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.RelativeLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.tools.API;

/**
 * "我的"- 成为作者
 */
public class AsTheAuthorActivity extends BaseActivity implements OnClickListener{

    private RelativeLayout as_the_author_back;
    private WebView author_webView;

    @Override
    protected int getLayout () {
        return R.layout.mine_as_the_author;
    }

    @Override
    public void initView () {
        as_the_author_back=findView (R.id.as_the_author_back);
        as_the_author_back.setOnClickListener (this);
        author_webView=findView (R.id.author_webView);

    }

    @Override
    protected void initData () {
        author_webView.loadUrl (API.MINE_AUTHOR);

    }

    @Override
    public void onClick (View v) {
        switch (v.getId ()){
            case R.id.as_the_author_back:
                finish ();
                break;
        }
    }
}
