package com.lanou3g.you17.mine;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.tools.API;

/**
 * "我的" - 签到页面
 */
public class SignActivity extends BaseActivity {
    private WebView mSignWeb;
    private WebViewClient mWebViewClient;


    @Override
    protected int getLayout() {
        return R.layout.sign_activity;
    }

    @Override
    public void initView() {

        mSignWeb = findView(R.id.sign__web);
        mWebViewClient = new WebViewClient();
        mSignWeb.setWebViewClient(mWebViewClient);
        WebSettings webSettings = mSignWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mSignWeb.loadUrl(API.API_SIGN);
    }




    @Override
    protected void initData() {


    }
}
