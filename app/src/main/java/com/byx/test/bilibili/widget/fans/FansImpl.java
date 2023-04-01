package com.byx.test.bilibili.widget.fans;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RemoteViews;

import com.byx.test.bilibili.R;
import com.byx.test.bilibili.network.MyObserver;
import com.byx.test.bilibili.network.RequesInterface;
import com.byx.test.bilibili.network.RetrofitUtils;
import com.byx.test.bilibili.network.RxHelper;
import com.byx.test.bilibili.utils.SpCommonUtils;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bob
 * Date : 21-8-31
 * Describe :
 */
public class FansImpl extends AppWidgetProvider {

    private static final String TAG = "FansImpl";
    private static final String ACTION = "android.appwidget.action.APPWIDGET_UPDATE";

    private Retrofit retrofit = null;


    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        Log.i(TAG, "onUpdate");
        // 获取AppWidget对应的视图
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_fans);

        RetrofitUtils.getRequesInterfaceUrl()
                .getFansById(SpCommonUtils.getVmid())
                .compose(RxHelper.observableIO2Main(context))
                .subscribe(new MyObserver<FansEntity>(context, false) {

                    @Override
                    public void onSuccess(int code, FansEntity demo) {
                        Log.i(TAG, String.valueOf(demo.getFollower()));
                        remoteViews.setTextViewText(R.id.fans_number, String.valueOf(demo.getFollowing()));
                        appWidgetManager.updateAppWidget(appWidgetIds[0], remoteViews);
                    }

                    @Override
                    public void onFailure(int code, String errorMsg) {
                        Log.i(TAG, "失败code：" + code + "Msg" + errorMsg);
                    }
                });

        RetrofitUtils.getRequesInterfaceUrl()
                .getImageById("ApipostRequest/0.0.28 (https://www.apipost.cn)",SpCommonUtils.getVmid())
                .compose(RxHelper.observableIO2Main(context))
                .subscribe(new MyObserver<Myinfo>(context, false) {
                    @Override
                    public void onSuccess(int code, Myinfo demo) {

                        if (retrofit == null) {
                            retrofit = new Retrofit.Builder()
                                    .baseUrl("http://api.bilibili.com/x/")
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
                        }

                        RequesInterface request = retrofit.create(RequesInterface.class);

                        Call<ResponseBody> call1 = request.getPic(demo.getFace());
                        call1.enqueue(new Callback<ResponseBody>() {
                            @Override
                            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                try {
                                    InputStream byteStream = response.body().byteStream();
                                    remoteViews.setImageViewBitmap(R.id.user_image, toRoundBitmap(BitmapFactory.decodeStream(byteStream)));
                                    appWidgetManager.updateAppWidget(appWidgetIds[0], remoteViews);
                                    byteStream.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override
                            public void onFailure(Call<ResponseBody> call, Throwable t) {
                                Log.i(TAG, "失败");
                            }
                        });
                        if (demo.getVip().getType() == 2){
//                            Drawable byteStream = context.getResources().getDrawable(R.drawable.ic_small_vip);
//                            remoteViews.setImageViewBitmap(R.id.vip_image, toRoundBitmap(BitmapFactory.decodeStream(byteStream)));
                            remoteViews.setViewVisibility(R.id.vip_image, View.VISIBLE);
                            remoteViews.setImageViewResource(R.id.vip_image, R.drawable.ic_small_vip);
                        } else {
                            remoteViews.setViewVisibility(R.id.vip_image, View.VISIBLE);
                            remoteViews.setImageViewResource(R.id.vip_image, R.drawable.ic_big_vip);
                        }
                        appWidgetManager.updateAppWidget(appWidgetIds[0], remoteViews);

//                        if (!TextUtils.isEmpty(demo.getPendant().getImage())){
//                            Call<ResponseBody> call2 = request.getVipPic(demo.getPendant().getImage());
//                            call2.enqueue(new Callback<ResponseBody>() {
//                                @Override
//                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                                    try {
//                                        InputStream byteStream = response.body().byteStream();
//                                        remoteViews.setViewVisibility(R.id.user_image_pendant, View.VISIBLE);
//                                        remoteViews.setImageViewBitmap(R.id.user_image_pendant, imageScale(BitmapFactory.decodeStream(byteStream), 600, 600));
//                                        appWidgetManager.updateAppWidget(appWidgetIds[0], remoteViews);
//                                        byteStream.close();
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
//                                }
//
//                                @Override
//                                public void onFailure(Call<ResponseBody> call, Throwable t) {
//                                    Log.i(TAG, "失败");
//                                }
//                            });
////
//                        } else {
//                            remoteViews.setViewVisibility(R.id.user_image_pendant, View.GONE);
//                            appWidgetManager.updateAppWidget(appWidgetIds[0], remoteViews);
//                        }
                        //Avatar_subscript_url不再提供小图标url
//                        if (!TextUtils.isEmpty(demo.getVip().getAvatar_subscript_url())){
//                            Call<ResponseBody> call2 = request.getVipPic(demo.getVip().getAvatar_subscript_url());
//                            call2.enqueue(new Callback<ResponseBody>() {
//                                @Override
//                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                                    try {
//                                        InputStream byteStream = response.body().byteStream();
//                                        remoteViews.setViewVisibility(R.id.vip_image, View.VISIBLE);
//                                        remoteViews.setImageViewBitmap(R.id.vip_image, toRoundBitmap(BitmapFactory.decodeStream(byteStream)));
//                                        appWidgetManager.updateAppWidget(appWidgetIds[0], remoteViews);
//                                        byteStream.close();
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
//                                }
//
//                                @Override
//                                public void onFailure(Call<ResponseBody> call, Throwable t) {
//                                    Log.i(TAG, "失败");
//                                }
//                            });
//                        }else {
//                            remoteViews.setViewVisibility(R.id.vip_image, View.GONE);
//                            appWidgetManager.updateAppWidget(appWidgetIds[0], remoteViews);
//                        }
                    }

                    @Override
                    public void onFailure(int code, String errorMsg) {
                        Log.i(TAG, "失败code：" + code + "Msg" + errorMsg);
                    }
                });


//        if (retrofit == null){
//            retrofit = new Retrofit.Builder()
//                    .baseUrl("http://api.bilibili.com/x/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//        RequesInterface request = retrofit.create(RequesInterface.class);
//        //获取粉丝
//        Log.i(TAG,SpCommonUtils.getVmid());
//        Call<FansEntity> call = request.getFansById(SpCommonUtils.getVmid());
//        call.enqueue(new Callback<FansEntity>() {
//            @Override
//            public void onResponse(Call<FansEntity> call, Response<FansEntity> response) {
//                Log.i(TAG,String.valueOf(response.body().getData().getFollower()));
//                remoteViews.setTextViewText(R.id.fans_number,String.valueOf(response.body().getData().getFollowing()));
//                appWidgetManager.updateAppWidget(appWidgetIds[0],remoteViews);
//            }
//
//            @Override
//            public void onFailure(Call<FansEntity> call, Throwable t) {
//
//            }
//        });
        //获取头像url
//        Call<Myinfo> call2 = request.getImageById(SpCommonUtils.getVmid());
//        call2.enqueue(new Callback<Myinfo>() {
//            @Override
//            public void onResponse(Call<Myinfo> call, Response<Myinfo> response) {
//                //获取头像流
//                Call<ResponseBody> call3 = request.getPic(response.body().getData().getFace());
//                call3.enqueue(new Callback<ResponseBody>() {
//                    @Override
//                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                        try {
//                            InputStream byteStream = response.body().byteStream();
//                            remoteViews.setImageViewBitmap(R.id.user_image, toRoundBitmap(BitmapFactory.decodeStream(byteStream)));
//                            appWidgetManager.updateAppWidget(appWidgetIds[0],remoteViews);
//                            byteStream.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    @Override
//                    public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//                    }
//                });
//            }
//            @Override
//            public void onFailure(Call<Myinfo> call, Throwable t) {
//
//            }
//        });
    }


    public static Bitmap toRoundBitmap(Bitmap bitmap) {
        // 前面同上，绘制图像分别需要bitmap，canvas，paint对象
        bitmap = Bitmap.createScaledBitmap(bitmap, 400, 400, true);
        Bitmap bm = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bm);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        // 这里需要先画出一个圆
        canvas.drawCircle(200, 200, 200, paint);
        // 圆画好之后将画笔重置一下
        paint.reset();
        // 设置图像合成模式，该模式为只在源图像和目标图像相交的地方绘制源图像
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0, 0, paint);
        return bm;
    }

    /**
     * 调整图片大小
     *
     * @param bitmap
     *            源
     * @param dst_w
     *            输出宽度
     * @param dst_h
     *            输出高度
     * @return
     */
    public static Bitmap imageScale(Bitmap bitmap, int dst_w, int dst_h) {
        int src_w = bitmap.getWidth();
        int src_h = bitmap.getHeight();
        Log.e("test",src_w + "h:" + src_h);
        float scale_w = ((float) dst_w) / src_w;
        float scale_h = ((float) dst_h) / src_h;
        Matrix matrix = new Matrix();
        matrix.postScale(scale_w, scale_h);
        Bitmap dstbmp = Bitmap.createBitmap(bitmap, 0, 0, src_w, src_h, matrix,
                true);
        return dstbmp;
    }

}
