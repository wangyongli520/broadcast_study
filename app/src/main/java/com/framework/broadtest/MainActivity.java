package com.framework.broadtest;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void send(View view){
        Intent intent = new Intent("com.framework.CUSTOM_RECEIVER");
        intent.setComponent(new ComponentName("com.framework.broadtest","com.framework.broadtest.CustomReceiver"));
        sendBroadcast(intent);
    }
}
