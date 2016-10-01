package com.example.zjs12638.baidumap;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.baidu.location.LocationClient;
import com.baidu.mapapi.utils.DistanceUtil;

/**
 * Created by zjs12638 on 2016/9/12.
 */

public class LocationService extends Service {
    public static final String FIFE_NAME = "log.txt";
    LocationClient mLocationClient;
    private Object object = null;

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
}
