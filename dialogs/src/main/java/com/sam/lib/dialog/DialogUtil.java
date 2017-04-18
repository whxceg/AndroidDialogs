package com.sam.lib.dialog;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

import com.sam.lib.dialog.adapter.BaseAdapter;
import com.sam.lib.dialog.adapter.BottomAdapter;
import com.sam.lib.dialog.adapter.LoadingAdapter;


/**
 * Created by Administrator on 2017/2/20.
 */

public class DialogUtil {
    public static void show(FragmentActivity activity, String tag){
//        BaseConfig config = new BaseConfig(activity);
//        config.setBottom(true);
//        config.setStyle(R.style.ActionBoxStyle);
//        BaseDialog dialog = BaseDialog.newDialog();
//        dialog.showDialog(activity.getSupportFragmentManager(), config, tag);

//        BaseAdapter config = new BottomAdapter(activity, "s");
//        config.setBottom(true);
//        config.setStyle(R.style.ActionBoxStyle);
//        BaseDialog dialog = BaseDialog.newDialog();
//        dialog.showDialog(activity.getSupportFragmentManager(), config, tag);

    }

    public static void showBottom(FragmentActivity activity, String msg, String tag){
        BaseAdapter adapter = new BottomAdapter(activity, msg);
        adapter.setBottom(true);
        BaseDialog dialog = BaseDialog.newDialog();
        dialog.showDialog(activity.getSupportFragmentManager(), adapter, tag);

    }

    public static void showLoading(FragmentActivity activity, String msg, String tag){
        BaseAdapter adapter = new LoadingAdapter(activity,msg);
        BaseDialog dialog = BaseDialog.newDialog();
        dialog.showDialog(activity.getSupportFragmentManager(), adapter, tag);
    }

    public static void showLoading(FragmentActivity activity, String tag){
        showLoading(activity, "加载中...", tag);
    }

    public static void dissmiss(FragmentActivity activity, String tag){
        DialogFragment dialog = (DialogFragment) activity.getSupportFragmentManager().findFragmentByTag(tag);
        if(dialog != null){
            dialog.dismissAllowingStateLoss();
        }
    }
}
