package com.framework.broadtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("wyl_receiver", "onReceive: CustomReceiver" );
        Toast.makeText(context,"customReceiver",Toast.LENGTH_SHORT).show();
    }
}
