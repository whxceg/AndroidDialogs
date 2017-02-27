package com.sam.dialogs;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.sam.lib.dialog.DialogUtil;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view){
        DialogUtil.showLoading(this, "loading");
    }
}
