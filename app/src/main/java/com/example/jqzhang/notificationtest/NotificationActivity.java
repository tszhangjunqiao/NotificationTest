package com.example.jqzhang.notificationtest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by jqzhang on 2016/4/28.
 */
public class NotificationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);
        MainActivity.resetCount();
    }
}
