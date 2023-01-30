package com.byx.test.bilibili.utils;

/**
 * Created by bob
 * Date : 21-9-1
 * Describe :
 */
public class SpCommonUtils {

    public static final String VMID = "DedeUserID";
    public static final String SESSDATA = "SESSDATA";

    public static String getVmid(){
        return SpUtils.getInstance().getSharedPreferencesForString(VMID);
    }

    public static String getSessdata(){
        return SpUtils.getInstance().getSharedPreferencesForString(SESSDATA);
    }
}
