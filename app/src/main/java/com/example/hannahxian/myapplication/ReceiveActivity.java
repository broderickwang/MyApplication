package com.example.hannahxian.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.hannahxian.myapplication.adapter.RemitItemAdapter;
import com.example.hannahxian.myapplication.bean.RemitBean;

import java.util.ArrayList;
import java.util.List;

import marc.com.multrecycleadapter.OnItemClickListner;

public class ReceiveActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        mRecyclerView = (RecyclerView) findViewById(R.id.recevi_list);

        final List<RemitBean> remitBeans = new ArrayList<>();
        for (int i=0;i<6;i++){
            RemitBean bean = new RemitBean();
            bean.setLiushuihao("990090"+i);
            remitBeans.add(bean);
        }

        RemitItemAdapter adapter = new RemitItemAdapter(this,remitBeans,R.layout.recevi_list_item) ;
        /*new RemitItemAdapter(this, remitBeans, new MultiTypeSupport() {
            @Override
            public int getLayoutId(Object item, int position) {
                if (position == 0)
                    return R.layout.remit_item_head;
                return R.layout.remit_item;
            }
        });*/

        adapter.setOnClickListner(new OnItemClickListner() {
            @Override
            public void onClice(RecyclerView parent, int position) {
                Toast.makeText(ReceiveActivity.this, remitBeans.get(position).getLiushuihao(), Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
    }
}
