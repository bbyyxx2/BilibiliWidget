package com.byx.test.bilibili.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.byx.test.bilibili.MyApplication;

import java.util.Map;

/**
 * Created by bob
 * Date : 21-9-1
 * Describe :
 */
public class SpUtils {

    private static final String TAG = "SpUtils";

    private static SharedPreferences msharedPreferences = null;
    private static SharedPreferences.Editor editor = null;
    private static volatile SpUtils instance;

    static SpUtils getInstance() {
        if (instance == null) {
            synchronized (SpUtils.class) {
                if (instance == null) {
                    instance = new SpUtils();
                }
            }
        }
        return instance;
    }

    private SpUtils() {
        Log.e(TAG,"SpUtils init");
        msharedPreferences = MyApplication.getContext().getSharedPreferences("appSetting", Context.MODE_PRIVATE);
        editor = msharedPreferences.edit();
    }

    public void SaveMap(Map<String,String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Log.i(TAG,entry.getKey() + "=" + entry.getValue());
            editor.putString(entry.getKey(),entry.getValue());
        }
        editor.apply();
    }

    public String getSharedPreferencesForString(String key){
        return msharedPreferences.getString(key,"");
    }
}
