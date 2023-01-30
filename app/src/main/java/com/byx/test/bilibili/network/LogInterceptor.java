package com.byx.test.bilibili.network;


import android.util.Log;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
/**
 * Created by bob
 * Date : 21-9-15
 * Describe :
 */

/**
 *  TODO Log拦截器代码
 */
public class LogInterceptor implements Interceptor{
    private String TAG = "LogInterceptor";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Log.e(TAG,"request:" + request.toString());
/*        long t1 = System.nanoTime();
        okhttp3.Response response = chain.proceed(chain.request());
        long t2 = System.nanoTime();
        Log.e(TAG,String.format(Locale.getDefault(), "Received response for %s in %.1fms%n%s",
                response.request().url(), (t2 - t1) / 1e6d, response.headers()));
        okhttp3.MediaType mediaType = response.body().contentType();
        String content = response.body().string();
        Log.e(TAG, "response body:" + content);
        return response.newBuilder()
                .body(okhttp3.ResponseBody.create(mediaType, content))
                .build();*/

        Response response = chain.proceed(chain.request());
        MediaType mediaType = response.body().contentType();
        //结果数据
        String content = response.body().string();

        log("Request Start--------------------------");

        log("请求地址: " + request.url());
        if ("POST".equals(request.method())) {
            if (request.body() != null) {
                log("请求类型: " + request.method() + ", ContentLength = (" + request.body().contentLength() + "-byte body)");
            }
        } else {
            log("请求类型 = " + request.method());
        }

        //打印请求头
        Set<String> heards = request.headers().names();
        for (String names : heards) {
            for (String name : request.headers(names)) {
                log("请 求 头: " + names + " = " + name);
            }
        }

        //如果是POST请求则输出请求参数
        if ("POST".equals(request.method())) {
            if (request.body() != null) {
                Buffer buffer = new Buffer();
                request.body().writeTo(buffer);

                Charset charset = StandardCharsets.UTF_8;
                MediaType contentType = request.body().contentType();
                if (contentType != null) {
                    charset = contentType.charset(charset);
                }
                //打印请求参数，参数是加密的，需要解码
                log("请求参数: " + buffer.readString(charset));
            }
            log("请求响应  = " + response.code() + " , ContentLength = (" + response.body().contentLength() + "-byte body)");
        }
        //结果是加密的，需要解码
        log("响应结果: " + content);
        log("--------------------Request End: ");

        return response.newBuilder()
                .body(ResponseBody.create(mediaType, content))
                .build();
    }

    private void log(String msg){
        Log.i(TAG, msg);
    }
}