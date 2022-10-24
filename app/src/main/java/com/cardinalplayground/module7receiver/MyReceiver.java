package com.cardinalplayground.module7receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");

        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context, "Charger Connected!", Toast.LENGTH_LONG).show();
        };

        if(intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)){
            Toast.makeText(context, "Charger Disconnected!", Toast.LENGTH_LONG).show();
        };

        if(intent.getAction().equals(Intent.ACTION_BATTERY_LOW)){
            Toast.makeText(context, "BATTERY LOW! PLEASE CONNECT YOUR CHARGER!", Toast.LENGTH_LONG).show();
        };

        if(intent.getAction().equals("com.cardinalplayground.testbroadcast")){
            Toast.makeText(context, "BROADCASE RECEIVED FROM THE OTHER APPLICATION!", Toast.LENGTH_LONG).show();
        };



    }
}