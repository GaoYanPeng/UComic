package com.lanou3g.you17.search;
 /*

Created by tliYgTong_刘德强 on 16/8/31.
*/


import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

import java.util.ArrayList;

/**
 * 点击搜索标题栏后跳转的二级搜索页面Activity
 */
public class SearchActivity extends BaseActivity implements OnClickListener {

    private boolean isFristTime = true;
    ArrayList<String> str = new ArrayList<> ();
    private String a;

    /** 标签之间的间距 px */
    final int itemMargins = 40;

    /** 标签的行间距 px */
    final int lineMargins = 40;

    private ViewGroup container = null;

    private int containerWidth;
    private Paint paint;
    private TextView textView;
    private LinearLayout.LayoutParams tvParams;
    private LinearLayout layout;
    private LinearLayout.LayoutParams params;
    private LayoutInflater inflater;
    private int itemPadding;

    private ImageView search_back;

    @Override
    protected int getLayout () {
        return R.layout.search_activity;
    }

    @Override
    public void initView () {
        container = (ViewGroup) findViewById (R.id.container);
        search_back = (ImageView) findViewById (R.id.search_back);
        search_back.setOnClickListener (this);

    }

    @Override
    protected void initData () {

        NetTool.getInstance ().startRequest (API.API_TOP_SEARCH_URL, SearchTopSearchBean.class, new onHttpCallBack<SearchTopSearchBean> () {
            @Override
            public void onSuccess (SearchTopSearchBean response) {
                for (int j = 0; j < response.getData ().getReturnData ().size (); j++) {
                    a = response.getData ().getReturnData ().get (j).getTag ();
                    str.add (a);
                }

                if (isFristTime) {
                    isFristTime = false;
                    containerWidth = container.getMeasuredWidth () - container.getPaddingRight ()
                            - container.getPaddingLeft ();

                    inflater = getLayoutInflater ();

                    /** 用来测量字符的宽度 */
                    paint = new Paint ();
                    textView = (TextView) inflater.inflate (R.layout.search_item_top_search, null);
                    itemPadding = textView.getCompoundPaddingLeft () + textView.getCompoundPaddingRight ();
                    tvParams = new LinearLayout.LayoutParams (LayoutParams.WRAP_CONTENT,
                            LayoutParams.WRAP_CONTENT);
                    tvParams.setMargins (0, 0, itemMargins, 0);

                    paint.setTextSize (textView.getTextSize ());

                    layout = new LinearLayout (SearchActivity.this);
                    layout.setLayoutParams (new LinearLayout.LayoutParams (LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
                    layout.setOrientation (LinearLayout.HORIZONTAL);
                    container.addView (layout);

                    params = new LinearLayout.LayoutParams (LayoutParams.MATCH_PARENT,
                            LayoutParams.WRAP_CONTENT);
                    params.setMargins (0, lineMargins, 0, 0);

                    int remainWidth = containerWidth;

                    for (int i = 0; i < str.size (); ++i) {
                        final String text = str.get (i);
                        final float itemWidth = paint.measureText (text) + itemPadding;
                        if (remainWidth > itemWidth) {
                            addItemView (inflater, layout, tvParams, text);
                        } else {
                            resetTextViewMarginsRight (layout);
                            layout = new LinearLayout (SearchActivity.this);
                            layout.setLayoutParams (params);
                            layout.setOrientation (LinearLayout.HORIZONTAL);

                            /** 将前面那一个textview加入新的一行 */
                            addItemView (inflater, layout, tvParams, text);
                            container.addView (layout);
                            remainWidth = containerWidth;
                        }
                        remainWidth = (int) (remainWidth - itemWidth + 0.5f) - itemMargins;
                    }
                    resetTextViewMarginsRight (layout);


                }

            }

            @Override
            public void onError (Throwable e) {

            }
        });

    }

    @Override
    public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged (hasFocus);


    }


    /*****************
     * 将每行最后一个textview的MarginsRight去掉
     *********************************/
    private void resetTextViewMarginsRight (ViewGroup viewGroup) {
        final TextView tempTextView = (TextView) viewGroup.getChildAt (viewGroup.getChildCount () - 1);
        tempTextView.setLayoutParams (new LinearLayout.LayoutParams (LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
    }

    private void addItemView (LayoutInflater inflater, ViewGroup viewGroup, LayoutParams params, String text) {
        final TextView tvItem = (TextView) inflater.inflate (R.layout.search_item_top_search, null);
        tvItem.setText (text);
        viewGroup.addView (tvItem, params);
    }



    @Override
    public void onClick (View v) {
        switch (v.getId ()){
            //返回按钮
            case R.id.search_back:
                finish ();
                break;
        }

    }
}
