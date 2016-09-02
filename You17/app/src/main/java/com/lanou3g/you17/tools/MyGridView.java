package com.lanou3g.you17.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

/**
 * Created by 高延鹏.on 16/9/1.
 */
public class MyGridView extends GridView {
    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyGridView(Context context, AttributeSet attrs, int defStyleRes) {
        super(context, attrs, defStyleRes);
    }

    //重写dispatchTouchEvent方法禁止GridView滑动
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(ev.getAction() == MotionEvent.ACTION_MOVE){
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * //遇到一个ScrollView嵌套GridView的情况，由于这两款控件都自带滚动条，外层的ScrollView会对滚动事件进行拦截，就会存在GridView会显示不全。
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec= MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >>2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }


}
