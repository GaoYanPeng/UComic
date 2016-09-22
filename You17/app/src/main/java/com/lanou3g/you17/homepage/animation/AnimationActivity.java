package com.lanou3g.you17.homepage.animation;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by 高延鹏.on 16/9/6.
 */
public class AnimationActivity extends BaseActivity {
    private WebView mWebView;
    @Override
    protected int getLayout() {
        return R.layout.anim_activity;
    }

    @Override
    public void initView() {


        mWebView = findView(R.id.web_view);
        WebViewClient webViewClient = new WebViewClient();
        mWebView.setWebViewClient(webViewClient);
        WebSettings wSet =  mWebView.getSettings();
        wSet.setJavaScriptEnabled(true);

    }

    @Override
    protected void initData() {
        mWebView.loadUrl(API.TOP_ANIMATION);

    }
}
