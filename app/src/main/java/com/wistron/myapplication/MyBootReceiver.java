package com.wistron.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class MyBootReceiver extends BroadcastReceiver {


    long          startTime             = 0 ;
    long          endtime               = 0 ;


    @Override
    public void onReceive(Context context, Intent intent) {

        A.a();
        A.a("1. Action: " + intent.getAction());
	startTime = System.currentTimeMillis();

	// delay 5 seconds.
	//
	//
	
	final Handler handler = new Handler();

	handler.postDelayed(new Runnable() {
	    @Override
	    public void run() {
		    //Do something after 100ms
		    A.a("333333333 " );

			endtime = System.currentTimeMillis();
			A.a(" starttime = " + startTime + "  endtime =" + endtime   );
			A.a(" endtime - starttime = "   + (endtime - startTime)     );

	    }
	}, 5000);


	A.a("2. after delay 5 seconds ");





//        Intent it = new Intent(context, MyAudioService.class);
//        context.startService(it);

    }

}
