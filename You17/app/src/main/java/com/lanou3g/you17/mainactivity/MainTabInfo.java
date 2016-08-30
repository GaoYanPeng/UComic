package com.lanou3g.you17.mainactivity;

import android.support.v4.app.Fragment;

import com.lanou3g.you17.R;
import com.lanou3g.you17.bookcase.BookCaseFragment;
import com.lanou3g.you17.homepage.HomepageFragment;
import com.lanou3g.you17.mine.MineFragment;
import com.lanou3g.you17.setup.SetupFragment;
import com.lanou3g.you17.search.SearcFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/8/26.
 */
public class MainTabInfo {
    private String title;
    private int imageId;
    private Fragment f;

    public MainTabInfo(String title, int imageId, Fragment f) {
        this.title = title;
        this.imageId = imageId;
        this.f = f;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Fragment getF() {
        return f;
    }

    public void setF(Fragment f) {
        this.f = f;
    }

    public static List<MainTabInfo> getMainTabInfo() {
        List<MainTabInfo> infos = new ArrayList<>();
        infos.add(new MainTabInfo("首页", R.drawable.home_title, new HomepageFragment()));
        infos.add(new MainTabInfo("搜索", R.drawable.searc_title, new SearcFragment()));
        infos.add(new MainTabInfo("书架", R.drawable.book_title, new BookCaseFragment()));
        infos.add(new MainTabInfo("我的", R.drawable.main_title, new MineFragment()));
        infos.add(new MainTabInfo("设置", R.drawable.game_title, new SetupFragment()));

        return infos;
    }
}
