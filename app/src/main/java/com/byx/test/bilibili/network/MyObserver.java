package com.byx.test.bilibili.network;


import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import com.byx.test.bilibili.base.BaseObserver;

import io.reactivex.disposables.Disposable;

/**
 * Created by bob
 * Date : 21-9-15
 * Describe :
 */

/**
 * Observer加入加载框
 * @param <T>
 */
public abstract class MyObserver<T> extends BaseObserver<T> {
    private boolean mShowDialog;
    private ProgressDialog dialog;
    private Context mContext;
    private Disposable d;

    public MyObserver(Context context, Boolean showDialog) {
        mContext = context;
        mShowDialog = showDialog;
    }

    public MyObserver(Context context) {
        this(context,true);
    }

    @Override
    public void onSubscribe(Disposable d) {
        this.d = d;
        if (!isConnected(mContext)) {
            Toast.makeText(mContext,"未連接網絡", Toast.LENGTH_SHORT).show();
            if (d.isDisposed()) {
                d.dispose();
            }
        } else {
            if (dialog == null && mShowDialog == true) {
                dialog = new ProgressDialog(mContext);
                dialog.setMessage("正在加載中......");
                dialog.show();
            }
        }
    }
    @Override
    public void onError(Throwable e) {
        if (d.isDisposed()) {
            d.dispose();
        }
        hidDialog();
        super.onError(e);
    }

    @Override
    public void onComplete() {
        if (d.isDisposed()) {
            d.dispose();
        }
        hidDialog();
        super.onComplete();
    }


    public void hidDialog() {
        if (dialog != null && mShowDialog == true)
            dialog.dismiss();
        dialog = null;
    }
    /**
     * 是否有网络连接，不管是wifi还是数据流量
     * @param context
     * @return
     */
    public static boolean isConnected(Context context)
    {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if (info == null)
        {
            return false;
        }
        boolean available = info.isAvailable();
        return available;
    }

    /**
     * 取消订阅
     */
    public void cancleRequest(){
        if (d!=null&&d.isDisposed()) {
            d.dispose();
            hidDialog();
        }
    }
}
