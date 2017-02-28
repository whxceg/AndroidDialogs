package com.sam.lib.dialog;

import android.view.View;

/**
 * Created by Administrator on 2017/2/20.
 */

public interface AdapterView {

    View getView();
    int getStyle();
    boolean isBottom();
    boolean isCancelable();
    boolean isCanceledOnTouchOutside();

}
