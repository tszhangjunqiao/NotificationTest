package com.example.jqzhang.notificationtest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private Button sendNotice;
    private PendingIntent pi;
    private static int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendNotice = (Button)findViewById(R.id.sendNotice_btn);
        Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
        pi = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
        sendNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.sendNotice_btn:
                        count ++;
                        NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                        Notification notification = new Notification.Builder(MainActivity.this)
                                .setAutoCancel(true)
                                .setTicker("new notification")
                                .setSmallIcon(R.mipmap.ic_launcher)
                                .setContentTitle("QQ新消息")
                                .setContentText("你有" + count +"条新消息")
                                .setWhen(System.currentTimeMillis())
                                .setDefaults(Notification.DEFAULT_ALL)
                                .setContentIntent(pi)
                                .build();
                        manager.notify(1, notification);

                }
            }
        });

    }

    public static  void resetCount(){
        count = 0;
    }
}
