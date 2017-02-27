package com.sam.lib.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Administrator on 2017/2/20.
 */

public class BaseDialog extends DialogFragment {

    private AdapterView mAdapterView;
    public static BaseDialog newDialog(){
        BaseDialog dialog = new BaseDialog();
        return dialog;
    }

    public void showDialog(FragmentManager fragmentManager, AdapterView adapterView, String tag){
        this.mAdapterView = adapterView;
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(this, tag);
        ft.commitAllowingStateLoss();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getContext(),mAdapterView.getStyle());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(mAdapterView.getView());
        dialog.setCanceledOnTouchOutside(mAdapterView.isCanceledOnTouchOutside());
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                return mAdapterView.isCancelable();
            }
        });
        if(mAdapterView.isBottom()){
            Window window = dialog.getWindow();
            window.setGravity(Gravity.LEFT | Gravity.BOTTOM);
            WindowManager.LayoutParams lp = window.getAttributes();
            lp.x = 0;
            lp.y = 0;
            lp.width = getResources().getDisplayMetrics().widthPixels;
            window.setAttributes(lp);
        }
        return dialog;
    }

}
