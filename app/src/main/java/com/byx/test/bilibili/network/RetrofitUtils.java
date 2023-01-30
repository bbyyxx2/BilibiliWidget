package com.byx.test.bilibili.network;

/**
 * Created by bob
 * Date : 21-9-15
 * Describe :
 */

import androidx.annotation.NonNull;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit封装
 */
public class RetrofitUtils {
    private static final String TAG = "RetrofitUtils";
    private static RequesInterface mRequesInterfaceUrl;
    /**
     * 单例模式
     */
    public static RequesInterface getRequesInterfaceUrl() {
        if (mRequesInterfaceUrl == null) {
            synchronized (RetrofitUtils.class) {
                if (mRequesInterfaceUrl == null) {
                    mRequesInterfaceUrl = new RetrofitUtils().getRetrofit();
                }
            }
        }
        return mRequesInterfaceUrl;
    }
    private RetrofitUtils(){}

    public RequesInterface getRetrofit() {
        // 初始化Retrofit
        return initRetrofit(initOkHttp()) .create(RequesInterface.class);
    }

    /**
     * 初始化Retrofit
     */
    @NonNull
    private Retrofit initRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .client(client)
                .baseUrl("http://api.bilibili.com/x/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * 初始化okhttp
     */
    @NonNull
    private OkHttpClient initOkHttp() {
        return new OkHttpClient().newBuilder()
                .readTimeout(Constans.DEFAULT_TIME, TimeUnit.SECONDS)//设置读取超时时间
                .connectTimeout(Constans.DEFAULT_TIME, TimeUnit.SECONDS)//设置请求超时时间
                .writeTimeout(Constans.DEFAULT_TIME, TimeUnit.SECONDS)//设置写入超时时间
                .addInterceptor(new LogInterceptor())//添加打印拦截器
                .retryOnConnectionFailure(true)//设置出现错误进行重新连接。
                .build();
    }
}