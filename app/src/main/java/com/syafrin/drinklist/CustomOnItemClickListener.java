package com.syafrin.drinklist;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemCLickCallBack ClickCallBack;

    CustomOnItemClickListener(int position, OnItemCLickCallBack callBack) {
        this.position = position;
        this.ClickCallBack = callBack;
    }

    @Override
    public void onClick(View v) {
        ClickCallBack.onItemClicked(v,position);
    }

    public interface OnItemCLickCallBack{
        void onItemClicked(View v, int position);
    }
}
