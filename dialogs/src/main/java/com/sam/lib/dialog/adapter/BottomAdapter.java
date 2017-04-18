package com.sam.lib.dialog.adapter;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

import com.sam.lib.dialog.R;

/**
 * Created by Administrator on 2017/2/27.
 */

public class BottomAdapter extends BaseAdapter {

    private TextView mMsgText;

    public BottomAdapter(FragmentActivity context, String message) {
        super(context);
        setBottom(true);
        setCancelable(true);
        setMessage(message);
    }

    public void setMessage(String message) {
        if (message != null) {
            mMsgText.setText(message);
        }
    }

    @Override
    protected int getLayout() {
        return R.layout.dialogs_loading_adapter;
    }

    @Override
    protected void onCreate(View view) {
        mMsgText = (TextView) view.findViewById(R.id.tv_msg);
    }

    @Override
    public int getStyle() {
        return R.style.DialogLoadingStyle;
    }
}
