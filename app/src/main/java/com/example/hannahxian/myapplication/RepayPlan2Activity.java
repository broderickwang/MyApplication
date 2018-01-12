package com.example.hannahxian.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hannahxian.myapplication.adapter.RemitItemAdapter;
import com.example.hannahxian.myapplication.bean.RemitBean;

import java.util.ArrayList;
import java.util.List;

import marc.com.multrecycleadapter.MultiTypeSupport;

public class RepayPlan2Activity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repay_plan2);

        mRecyclerView = (RecyclerView)findViewById(R.id.repay_list2);

        final List<RemitBean> remitBeans = new ArrayList<>();
        for (int i=0;i<6;i++){
            RemitBean bean = new RemitBean();
            bean.setLiushuihao("990090"+i);
            remitBeans.add(bean);
        }

        RemitItemAdapter adapter = new RemitItemAdapter(this, remitBeans, new MultiTypeSupport() {
            @Override
            public int getLayoutId(Object item, int position) {
                if (position == 0)
                    return R.layout.repay_plan_head;
                return R.layout.repay_plan_item;
            }
        });

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
    }
}
