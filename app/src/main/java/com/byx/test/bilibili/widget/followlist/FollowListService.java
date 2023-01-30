package com.byx.test.bilibili.widget.followlist;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

import com.byx.test.bilibili.R;
import com.byx.test.bilibili.network.MyObserver;
import com.byx.test.bilibili.network.RequesInterface;
import com.byx.test.bilibili.network.RetrofitUtils;
import com.byx.test.bilibili.network.RxHelper;
import com.byx.test.bilibili.utils.SpCommonUtils;
import com.byx.test.bilibili.widget.fans.FansImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bob
 * Date : 21-12-10
 * Describe :
 */
public class FollowListService extends RemoteViewsService {

    private static final String TAG = "FollowListService";

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        Log.d(TAG, "GridWidgetService");
        return new FollowlistFactory(this, intent);
    }

    private class FollowlistFactory implements RemoteViewsService.RemoteViewsFactory {

        private Context mContext;
        private int mAppWidgetId;
        private ArrayList<FollowListEntity.list> mList = new ArrayList<>();
        private Retrofit retrofit = null;
        private ArrayList<Bitmap> covers = new ArrayList<>();
        private Map<Integer,Bitmap> maps = new HashMap<>();
        private RequesInterface request;

        public FollowlistFactory(Context context, Intent intent) {
            mContext = context;
            mAppWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
                    AppWidgetManager.INVALID_APPWIDGET_ID);
            Log.d(TAG, "GridRemoteViewsFactory mAppWidgetId:" + mAppWidgetId);
        }

        @Override
        public void onCreate() {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl("http://api.bilibili.com/x/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            request = retrofit.create(RequesInterface.class);

            RetrofitUtils.getRequesInterfaceUrl()
                    .getFollowListById("SESSDATA=" + SpCommonUtils.getSessdata(), SpCommonUtils.getVmid())
                    .compose(RxHelper.observableIO2Main(mContext))
                    .subscribe(new MyObserver<FollowListEntity>(mContext, false) {

                        @Override
                        public void onSuccess(int code, FollowListEntity demo) {
                            mList.addAll(demo.getList());
                        }

                        @Override
                        public void onFailure(int code, String errorMsg) {

                        }
                    });
        }

        @Override
        public void onDataSetChanged() {

        }

        @Override
        public void onDestroy() {
            mList.clear();
        }

        @Override
        public int getCount() {
            Log.d(TAG, String.valueOf(mList != null ? Math.min(mList.size(),4) : 0));
            return mList != null ? Math.min(mList.size(),4) : 0;
        }

        @Override
        public RemoteViews getViewAt(int position) {
            Log.i(TAG, "getViewAt");

            // 获取 grid_view_item.xml 对应的RemoteViews
            RemoteViews rv = new RemoteViews(mContext.getPackageName(), R.layout.widget_followlist_item);

            rv.setTextViewText(R.id.badge_info,mList.get(position).getBadge());


            Call<ResponseBody> call1 = request.getPic(mList.get(position).getCover());
            call1.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    Log.i(TAG, "成功");
                    try {
                        InputStream byteStream = response.body().byteStream();
                        rv.setImageViewBitmap(R.id.follow_list_iv,FansImpl.toRoundBitmap(BitmapFactory.decodeStream(byteStream)));
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
            return rv;
        }

        @Override
        public RemoteViews getLoadingView() {
            return null;
        }

        @Override
        public int getViewTypeCount() {
            return 1;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }
    }
}
