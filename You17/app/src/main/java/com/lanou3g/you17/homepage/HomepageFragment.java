package com.lanou3g.you17.homepage;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;

/**
 * Created by dllo on 16/8/26.
 */
public class HomepageFragment extends BaseFragment {
    private RecyclerView mHomeRecyclerView;
    private HomeAdapter mHomeAdapter;
    private static final String HOME = "http://app.u17.com/v3/appV3/android/phone/comic/boutiqueListNew?" +
            "android_id=3d6f8f613d878af1&v=3110099&model=Google+Nexus+5+-+4.4.4+-+API+19+-+1080x1920&come_" +
            "from=shouji360&key=6d785a6a482c2cc66517a5d09013c229dbd145e4f4b34e8ebc04b0c04a4836f8781a2df660e4" +
            "d74643aa584acfe831971b56c7e25ce7f16e1e51974feadd1da813bd70d86590efbaf0deacbdd0a4824ee179ae3fbbc0" +
            "89913559b6cf6e4da37587b212717e08ed56%253A%253A%253Au17";
    private ViewPager vp;
    private boolean mm = true;
    private boolean flags = true;
    private Handler handler;
    private ImageView[] tips;
    private LinearLayout llturn;
    private ShufflingFigureAdapter adapter;
    private ShufflingFigureBean arrays;




    @Override
    protected int initLayout() {
        return R.layout.homepager_fragment;
    }

    @Override
    protected void initView() {
        mHomeRecyclerView = (RecyclerView) getView().findViewById(R.id.all_recyclerview);
        mHomeAdapter = new HomeAdapter(getContext());
        LayoutManager lm= new LinearLayoutManager(getContext());
        mHomeRecyclerView.setLayoutManager(lm);
        arrays = new ShufflingFigureBean ();
        adapter = new ShufflingFigureAdapter (getContext ());
        vp = (ViewPager) getView ().findViewById (R.id.vp);
        llturn = (LinearLayout) getView ().findViewById (R.id.ll_turn);
        vp.setAdapter (adapter);

    }



    @Override
    protected void initData() {
        Log.d("HomepageFragment", "EEEEEEEEEE");
        NetTool.getInstance().startRequest(HOME, HomeBean.class, new onHttpCallBack<HomeBean>() {
            @Override
            public void onSuccess(HomeBean response) {


                mHomeAdapter.setHomeBean(response.getData().getReturnData());
                mHomeRecyclerView.setAdapter(mHomeAdapter);
                Log.d("HomepageFragment", "EEEEEEEEEE00000");

            }

            @Override
            public void onError(Throwable e) {
            }
        });

        handler = new Handler (new Handler.Callback () {
            @Override
            public boolean handleMessage (Message message) {
                vp.setCurrentItem (vp.getCurrentItem () + 1);


                return false;
            }
        });
        if (mm) {
            new Thread (new Runnable () {
                @Override
                public void run () {
                    while (flags) {
                        try {
                            Thread.sleep (3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                        handler.sendEmptyMessage (0);
                    }
                }
            }).start ();
            mm = false;
        }

        NetTool.getInstance ().startRequest (API.API_SHUFFLING_FIGURE, ShufflingFigureBean.class, new onHttpCallBack<ShufflingFigureBean> () {
            @Override
            //成功时进行:
            public void onSuccess (final ShufflingFigureBean response) {
                adapter.setImags (response);
                vp.addOnPageChangeListener (new OnPageChangeListener () {
                    @Override
                    public void onPageScrolled (int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected (int position) {
                        for (int i = 0; i < response.getData ().getReturnData ().getGalleryItems ().size (); i++) {
                            if (i == position % response.getData ().getReturnData ().getGalleryItems ().size ()) {
                                //选中的小白点
                                tips[i].setImageResource (R.mipmap.icon_game_dot_selected);
                            } else {
                                //未选中的
                                tips[i].setImageResource (R.mipmap.icon_game_dot_unselected);
                            }
                        }
                    }

                    @Override
                    public void onPageScrollStateChanged (int state) {

                    }
                });
                try {
                    tips = new ImageView[response.getData ().getReturnData ().getGalleryItems ().size ()];
                    for (int i = 0; i < response.getData ().getReturnData ().getGalleryItems ().size (); i++) {
                        ImageView imageView = new ImageView (getContext ());
                        imageView.setLayoutParams (new LinearLayout.LayoutParams (15, 15));
                        tips[i] = imageView;
                        if (i == 0) {
                            imageView.setImageResource (R.mipmap.icon_game_dot_selected);
                        } else {
                            imageView.setImageResource (R.mipmap.icon_game_dot_unselected);
                        }
                        LinearLayout.LayoutParams layoutParms = new LinearLayout.LayoutParams (15, 15);
                        layoutParms.leftMargin = 5;
                        layoutParms.rightMargin = 5;
                        llturn.addView (imageView, layoutParms);
                    }
                    adapter.setTips (tips);
                } catch (Exception e) {

                }
            }

            @Override
            public void onError (Throwable e) {

            }
        });
    }

}
