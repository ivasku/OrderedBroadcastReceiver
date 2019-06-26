package com.tms.broadcastrec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class OrderedReceiver3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        int resultCode = getResultCode();
        String resultData = getResultData();
        Bundle resultExtras = getResultExtras(true);
        String stringextra = resultExtras.getString("stringExtra");

        resultCode++;
        stringextra += " -> orderedReceiver3";

        String printData = "or3\n" +
                "resultCode: " + resultCode + "\n" +
                "resultData: " + resultData + "\n" +
                "stringExtra: " + stringextra;

        Toast.makeText(context, printData, Toast.LENGTH_SHORT).show();
        Log.d("ADI", "onReceive: OrderedReceiver3 " + printData);

        resultData = "OR3";
        resultExtras.putString("stringExtra" , stringextra);
        setResult(resultCode,resultData,resultExtras);

    }
}
