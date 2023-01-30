package com.byx.test.bilibili.widget.followlist;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

import com.byx.test.bilibili.R;
import com.byx.test.bilibili.network.MyObserver;
import com.byx.test.bilibili.network.RequesInterface;
import com.byx.test.bilibili.network.RetrofitUtils;
import com.byx.test.bilibili.network.RxHelper;
import com.byx.test.bilibili.utils.SpCommonUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bob
 * Date : 21-9-1
 * Describe :
 */
public class FollowListImpl extends AppWidgetProvider {

    private static final String TAG = "FollowListImpl";
    private Retrofit retrofit = null;

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        Log.i(TAG,"onUpdate");

        // 获取AppWidget对应的视图
        RemoteViews rv = new RemoteViews(context.getPackageName(), R.layout.widget_followlist);

        Intent serviceIntent = new Intent(context,FollowListService.class);
        rv.setRemoteAdapter(R.id.follow_list_gv,serviceIntent);

        appWidgetManager.updateAppWidget(appWidgetIds[0], rv);

//        if (retrofit == null){
//            retrofit = new Retrofit.Builder()
//                    .baseUrl("http://api.bilibili.com/x/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//        RequesInterface request = retrofit.create(RequesInterface.class);
//
//        Call<FollowListEntity> call = request.getFollowListById("SESSDATA="+SpCommonUtils.getSessdata(),SpCommonUtils.getVmid());
//        call.enqueue(new Callback<FollowListEntity>() {
//            @Override
//            public void onResponse(Call<FollowListEntity> call, Response<FollowListEntity> response) {
//                List<FollowListEntity.Data.list> list = response.body().getData().getList();
//            }
//
//            @Override
//            public void onFailure(Call<FollowListEntity> call, Throwable t) {
//
//            }
//        });
    }
}
