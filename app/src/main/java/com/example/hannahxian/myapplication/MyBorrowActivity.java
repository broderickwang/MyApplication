package com.example.hannahxian.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.hannahxian.myapplication.adapter.MyBorrowListAdapter;
import com.example.hannahxian.myapplication.bean.MyBorrowListBean;

import java.util.ArrayList;
import java.util.List;

public class MyBorrowActivity extends AppCompatActivity {

    Toolbar mToolbar;

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_borrow);
//        mToolbar = (Toolbar) findViewById(R.id.borrw_toolbar);
//        mToolbar.setBackgroundColor(getResources().getColor(R.color.BLUE));

//        setSupportActionBar(mToolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.mybrrow_list);

        List<MyBorrowListBean> borrowListBeans = new ArrayList<>();
        borrowListBeans.add(new MyBorrowListBean(getResources().getDrawable(R.mipmap.loan_audit),"审核中借款"));
        borrowListBeans.add(new MyBorrowListBean(getResources().getDrawable(R.mipmap.loan_passed),"已通过借款"));
        borrowListBeans.add(new MyBorrowListBean(getResources().getDrawable(R.mipmap.loan_refused),"已拒绝借款"));

        MyBorrowListAdapter adapter = new MyBorrowListAdapter(this,borrowListBeans,R.layout.my_borrow_list_item);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);


    }
}
