package com.example.hannahxian.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hannahxian.myapplication.adapter.RemitItemAdapter;
import com.example.hannahxian.myapplication.bean.RemitBean;

import java.util.ArrayList;
import java.util.List;

public class PassedActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passed);

        mRecyclerView = (RecyclerView) findViewById(R.id.passed_list);

        final List<RemitBean> remitBeans = new ArrayList<>();
        for (int i=0;i<5;i++){
            RemitBean bean = new RemitBean();
            bean.setLiushuihao("990090"+i);
            remitBeans.add(bean);
        }
        RemitItemAdapter adapter = new RemitItemAdapter(this,remitBeans,R.layout.passed_list_item);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
    }
}
