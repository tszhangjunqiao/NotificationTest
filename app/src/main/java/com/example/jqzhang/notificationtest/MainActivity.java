package com.example.jqzhang.notificationtest;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button sendNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendNotice = (Button)findViewById(R.id.sendNotice_btn);
        sendNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.sendNotice_btn:
                        NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                        Notification notification = new Notification(R.mipmap.ic_launcher, "this is ticker text", System.currentTimeMillis());
                        Notification.Builder builder = new Notification.Builder(MainActivity.this);
                }
            }
        });
    }
}
