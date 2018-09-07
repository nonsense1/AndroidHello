package cn.com.sdzs.helloworld.ARouter;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.ArrayList;
import java.util.List;

import cn.com.sdzs.helloworld.R;

@Route(path = "/test/tablayout", extras = 1)
public class TabActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<String> mIndicators;
    private List<Fragment> mTabFragments;
    private ContentPagerAdaper mContentAdaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        mTabLayout = findViewById(R.id.tab);
        mViewPager = findViewById(R.id.pager);
        initContent();
        initTab();
    }

    private void initTab() {
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        ViewCompat.setElevation(mTabLayout, 10);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initContent() {
        mIndicators = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            mIndicators.add("Tab"+ i);
        }
        mTabFragments = new ArrayList<>();
        for (String s : mIndicators){
            mTabFragments.add(TabFragment.getInstance(s));
        }
        mContentAdaper = new ContentPagerAdaper(getSupportFragmentManager());
        mViewPager.setAdapter(mContentAdaper);
    }

    class ContentPagerAdaper extends FragmentPagerAdapter {
        public ContentPagerAdaper(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            return mTabFragments.get(position);
        }

        @Override
        public int getCount() {
            return mIndicators.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mIndicators.get(position);
        }
    }
}
