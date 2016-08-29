package com.lanou3g.you17.bookcase;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.design.widget.TabLayout.Tab;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseFragment;
import com.lanou3g.you17.mainactivity.MainAdapter;
import com.lanou3g.you17.mainactivity.MainTabInfo;

/**
 * Created by dllo on 16/8/26.
 */
public class BookCaseFragment extends BaseFragment {
    private ViewPager bookPager;
    private TabLayout bookTab;
    private ImageView bookDelete;

    @Override
    protected int initLayout() {
        return R.layout.bookcase_fragment;
    }

    @Override
    protected void initView() {
        bookPager = (ViewPager) getView().findViewById(R.id.book_Pager);
        bookTab = (TabLayout) getView().findViewById(R.id.book_tab);
        bookDelete = (ImageView) getView().findViewById(R.id.book_delete);

    }

    @Override
    protected void initData() {
        BookAdapter adapter = new BookAdapter(getActivity().getSupportFragmentManager());
        bookPager.setAdapter(adapter);
        bookTab.setupWithViewPager(bookPager);
        bookTab.setSelectedTabIndicatorColor(0x00000000);
        bookTab.setTabTextColors(Color.GRAY,0xff8BE057);
//        mViewPager.setCurrentItem(1);
        bookTab.setOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(Tab tab) {
                int Position = tab.getPosition();
                if (Position == 1) {
                    bookDelete.setVisibility(View.VISIBLE);
                } else {
                    bookDelete.setVisibility(View.INVISIBLE);
                }
            }
            @Override
            public void onTabUnselected(Tab tab) {

            }

            @Override
            public void onTabReselected(Tab tab) {

            }
        });


        }
    }

