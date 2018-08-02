package com.wistron.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;


public class MyBootReceiver extends BroadcastReceiver {


    //    long          delayTime             = 5000 ;
    long delayTime = 10000;    // 10 seconds
    long startTime = 0;
    long endtime = 0;


    @Override
    public void onReceive(final Context context, Intent intent) {

        A.a();
        A.a("1. Action: " + intent.getAction());
        startTime = System.currentTimeMillis();

        // delay 5 seconds.
        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                A.a("3. ");

                endtime = System.currentTimeMillis();
                A.a(" starttime = " + startTime + "  endtime =" + endtime + " endtime - starttime = " + (endtime - startTime) );
//                A.a(" endtime - starttime = " + (endtime - startTime));

                A.a("start second activty");
                Intent intent = new Intent();
                intent.setClassName("com.wistron.secondapplication", "com.wistron.secondapplication.SecondActivity");
                context.startActivity(intent);
                A.a("start second activty done");


            }
        }, delayTime);


        A.a("2. ");


    }


}
