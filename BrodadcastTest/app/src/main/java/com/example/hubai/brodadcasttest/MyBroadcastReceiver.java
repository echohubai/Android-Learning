package com.example.hubai.brodadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by hubai on 2016/7/4.
 */
public class MyBroadcastReceiver extends BroadcastReceiver{
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context,"received in MyReceiver",Toast.LENGTH_SHORT).show();
}
}