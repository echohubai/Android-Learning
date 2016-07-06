package com.example.hubai.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by hubai on 2016/7/4.
 */
public class BaseActivity extends Activity {
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollertor.addActivity(this);
    }

    protected  void onDestory() {
        super.onDestroy();
        ActivityCollertor.removeActivity(this);
    }
}
