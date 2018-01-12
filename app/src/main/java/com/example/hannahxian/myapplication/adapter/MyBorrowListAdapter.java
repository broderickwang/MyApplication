package com.example.hannahxian.myapplication.adapter;

import android.content.Context;

import com.example.hannahxian.myapplication.R;
import com.example.hannahxian.myapplication.bean.MyBorrowListBean;

import java.util.List;

import marc.com.multrecycleadapter.CommonRecycleAdapter;
import marc.com.multrecycleadapter.ViewHolder;

/**
 * Created by hannahxian on 2018/1/7.
 */

public class MyBorrowListAdapter extends CommonRecycleAdapter<MyBorrowListBean> {

    private int mLayoutId;

    public MyBorrowListAdapter(Context context, List<MyBorrowListBean> datas, int layoutId) {
        super(context, datas, layoutId);
        this.mLayoutId = layoutId;
    }

    @Override
    public void convert(ViewHolder holder, MyBorrowListBean item) {
        holder.setText(R.id.item_title,item.getItemTitle());
        holder.setBackground(R.id.item_icon,item.getImageId());
    }

    @Override
    public int getLayoutId(Object item, int position) {
        return mLayoutId;
    }
}
