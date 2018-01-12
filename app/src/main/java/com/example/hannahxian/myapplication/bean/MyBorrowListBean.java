package com.example.hannahxian.myapplication.bean;

import android.graphics.drawable.Drawable;

/**
 * Created by hannahxian on 2018/1/7.
 */

public class MyBorrowListBean {
    Drawable imageId;

    String itemTitle;

    public MyBorrowListBean(Drawable imageId, String itemTitle) {
        this.imageId = imageId;
        this.itemTitle = itemTitle;
    }

    public Drawable getImageId() {
        return imageId;
    }

    public void setImageId(Drawable imageId) {
        this.imageId = imageId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
}
