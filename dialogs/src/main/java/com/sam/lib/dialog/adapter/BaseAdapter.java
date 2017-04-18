package com.sam.lib.dialog.adapter;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.sam.lib.dialog.AdapterView;


/**
 * Created by Administrator on 2017/2/20.
 */

public abstract class BaseAdapter implements AdapterView {

    private View mBaseView;

    private int mStyle = 0;
    private boolean mBottom = false;
    private boolean mCancelable = false;
    private boolean mTouchOut = false;

    protected abstract int getLayout();
    protected abstract void onCreate(View view);

    public BaseAdapter(final FragmentActivity context){
        mBaseView = LayoutInflater.from(context).inflate(getLayout(),null);
        onCreate(mBaseView);
    }

    @Override
    public View getView() {
        return mBaseView;
    }

    @Override
    public int getStyle() {
        return mStyle;
    }

    @Override
    public boolean isBottom() {
        return mBottom;
    }

    @Override
    public boolean isCancelable() {
        return mCancelable;
    }

    @Override
    public boolean isTouchOut() {
        return mTouchOut;
    }

    public void setStyle(int style){
        this.mStyle = style;
    }

    public void setBottom(boolean bottom){
        this.mBottom = bottom;
    }

    public void setCancelable(boolean cancelable){
        mCancelable = cancelable;
    }

    public void setTouchOut(boolean touchOut){
        mTouchOut = touchOut;
    }
}
