package com.byx.test.bilibili.base;

/**
 * Created by bob
 * Date : 21-9-15
 * Describe :
 */

import android.util.Log;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 创建Base抽象类实现Observer
 */
public abstract class BaseObserver<T> implements Observer<BaseResponse<T>> {
    private static final String TAG = "BaseObserver";
    @Override
    public void onSubscribe(Disposable d) {
        Log.e(TAG, "onSubscribe: " );
    }
    @Override
    public void onNext(BaseResponse<T> response) {

        //在这边对 基础数据 进行统一处理  举个例子：
        if(response.getCode() == 0){
            onSuccess(response.getCode(),response.getData());
        }else{
            onFailure(response.getCode(),response.getMessage());
        }
    }
    @Override
    public void onError(Throwable e) {
        Log.e(TAG, "Throwable: " + e.getMessage());
    }

    @Override
    public void onComplete() {
        Log.e(TAG, "onComplete: " );
    }

    public abstract void onSuccess(int code,T demo);

    public abstract void onFailure(int code, String errorMsg);
}
