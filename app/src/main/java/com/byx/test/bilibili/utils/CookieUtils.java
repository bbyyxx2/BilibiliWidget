package com.byx.test.bilibili.utils;


import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.webkit.CookieManager;

import com.byx.test.bilibili.MyApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bob
 * Date : 21-9-1
 * Describe :
 */
public class CookieUtils {

    private static final String TAG = "CookieUtils";


    public static void SaveCookie(String url){
        CookieManager cookieManager = CookieManager.getInstance();
        String cookieStr = cookieManager.getCookie(url);
        Log.i("Cookies","Cookies = "+ cookieStr);
        Map<String,String> cookieMap = cookieToMap(cookieStr);

        SpUtils.getInstance().SaveMap(cookieMap);
    }

    public static Map<String,String> cookieToMap(String value){
        Map<String,String> map = new HashMap<>();
        value = value.replace(" ","");
        if (value.contains(";")){
            String values[] = value.split(";");
            for(String val : values){
                String vals[] = val.split("=");
                map.put(vals[0],vals[1]);
            }
        }else {
            String values[] = value.split("=");
            map.put(values[0],values[1]);
        }
        return map;
    }
}
