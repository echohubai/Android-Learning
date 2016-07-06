package com.example.hubai.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hubai on 2016/7/4.
 */
public class ActivityCollertor {


    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }
public static  void  finishAll(){
    for (Activity activity : activities) {
        if (!activity.isFinishing()){
            activity.finish();
        }
    }
}

}