package com.example.hannahxian.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.hannahxian.myapplication.adapter.ClaimsViewPagerAdapter;
import com.example.hannahxian.myapplication.fragments.ClaimsFragment;

public class MyZhaiquanActivity extends AppCompatActivity {

    TabLayout mTabLayout;

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_zhaiquan);

        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.main_viewpager);

        initViewPager();
        initTabLayout();

    }

    private void initViewPager() {
        ClaimsViewPagerAdapter adapter = new ClaimsViewPagerAdapter(getSupportFragmentManager());
        adapter.addPager(new ClaimsFragment(),"债权投资记录");
        adapter.addPager(new ClaimsFragment(),"债权转让记录");
        mViewPager.setAdapter(adapter);
    }

    private void initTabLayout() {

        mTabLayout.addTab(mTabLayout.newTab().setText("债权投资记录"));
        mTabLayout.addTab(mTabLayout.newTab().setText("债权转让记录"));

        mTabLayout.setupWithViewPager(mViewPager);
    }
}
