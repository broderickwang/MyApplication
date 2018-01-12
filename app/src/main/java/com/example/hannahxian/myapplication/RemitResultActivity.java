package com.example.hannahxian.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.hannahxian.myapplication.adapter.RemitItemAdapter;
import com.example.hannahxian.myapplication.bean.RemitBean;

import java.util.ArrayList;
import java.util.List;

import marc.com.multrecycleadapter.OnItemClickListner;

public class RemitResultActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remit_result);
        mRecyclerView = (RecyclerView) findViewById(R.id.remit_list);
        final List<RemitBean> remitBeans = new ArrayList<>();
        for (int i=0;i<5;i++){
            RemitBean bean = new RemitBean();
            bean.setLiushuihao("990090"+i);
            remitBeans.add(bean);
        }
        RemitItemAdapter adapter = new RemitItemAdapter(this,remitBeans,R.layout.remit_item);
        adapter.setOnClickListner(new OnItemClickListner() {
            @Override
            public void onClice(RecyclerView parent, int position) {
                Toast.makeText(RemitResultActivity.this, remitBeans.get(position).getLiushuihao(), Toast.LENGTH_SHORT).show();
            }
        });

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);


    }
}
