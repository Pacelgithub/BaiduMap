package com.example.zjs12638.baidumap;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by zjs12638 on 2016/9/12.
 */

public class ShareAction extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_share);
    }
}
