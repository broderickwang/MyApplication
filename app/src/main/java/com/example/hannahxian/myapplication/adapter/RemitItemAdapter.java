package com.example.hannahxian.myapplication.adapter;

import android.content.Context;

import com.example.hannahxian.myapplication.bean.RemitBean;

import java.util.List;

import marc.com.multrecycleadapter.CommonRecycleAdapter;
import marc.com.multrecycleadapter.MultiTypeSupport;
import marc.com.multrecycleadapter.ViewHolder;

/**
 * Created by hannahxian on 2018/1/5.
 */

public class RemitItemAdapter extends CommonRecycleAdapter<RemitBean> {

    private int mLayoutId;

    public RemitItemAdapter(Context context, List<RemitBean> datas, int layoutId) {
        super(context, datas, layoutId);
        this.mLayoutId = layoutId;
    }

    public RemitItemAdapter(Context context, List<RemitBean> datas, MultiTypeSupport multiTypeSupport) {
        super(context, datas, multiTypeSupport);
    }

    @Override
    public void convert(ViewHolder holder, RemitBean item) {
//        holder.setText(R.id.liushuihao,item.getLiushuihao());
    }

    @Override
    public int getLayoutId(Object item, int position) {
        return mLayoutId;
    }
}
