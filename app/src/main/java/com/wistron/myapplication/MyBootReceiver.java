package com.wistron.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        A.a();
        A.a("1. Action: " + intent.getAction());

//        Intent it = new Intent(context, MyAudioService.class);
//        context.startService(it);

    }

}
