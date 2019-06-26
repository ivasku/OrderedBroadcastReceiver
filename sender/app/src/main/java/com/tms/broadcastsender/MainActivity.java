package com.tms.broadcastsender;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
    }

    public void sendBroadcast(View v) {
        Intent intent = new Intent("com.tms.EXAMPLE_ACTION");

        intent.setPackage("com.tms.broadcastrec");


        Bundle extras = new Bundle();
        extras.putString("stringExtra" , "Start");

        sendOrderedBroadcast(intent, null, new ExampleBroadcastReceiver2(), null, 0, "Start" , extras );
    }
}

