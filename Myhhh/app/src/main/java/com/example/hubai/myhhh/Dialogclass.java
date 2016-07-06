package com.example.hubai.myhhh;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by hubai on 2016/7/4.
 */
public class Dialogclass extends Activity {
    protected void onCreare(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_layout);


    }
}

