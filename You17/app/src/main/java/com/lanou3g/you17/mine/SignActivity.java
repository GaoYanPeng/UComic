package com.lanou3g.you17.mine;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.tools.API;

/**
 * 签到
 */
public class SignActivity extends BaseActivity implements OnClickListener{
    private WebView mSignWeb;
    private WebViewClient mWebViewClient;
    private RelativeLayout sign_back;


    @Override
    protected int getLayout() {
        return R.layout.sign_activity;
    }

    @Override
    public void initView() {

        mSignWeb = findView(R.id.sign__web);
        mSignWeb.setWebViewClient(mWebViewClient);
        mSignWeb.loadUrl(API.API_SIGN);

        mWebViewClient = new WebViewClient();
        WebSettings webSettings = mSignWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        sign_back=findView (R.id.sign_back);
        sign_back.setOnClickListener (this);
    }




    @Override
    protected void initData() {


    }

    @Override
    public void onClick (View v) {
        switch (v.getId ()){
            case R.id.sign_back:
                finish ();
                break;
        }
    }
}
