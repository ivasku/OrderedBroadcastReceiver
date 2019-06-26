package com.tms.broadcastsender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ExampleBroadcastReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        int resultCode = getResultCode();
        String resultData = getResultData();
        Bundle resultExtras = getResultExtras(true);
        String stringextra = resultExtras.getString("stringExtra");

        resultCode++;
        stringextra += " -> senderReciever";

        String printData = "senderReciever\n" +
                "resultCode: " + resultCode + "\n" +
                "resultData: " + resultData + "\n" +
                "stringExtra: " + stringextra;

        Toast.makeText(context, printData, Toast.LENGTH_SHORT).show();
        Log.d("ADI", "onReceive: senderReciever " + printData);

        resultData = "senderReciever";
        resultExtras.putString("stringExtra" , stringextra);
        setResult(resultCode,resultData,resultExtras);

    }
}
