package com.byx.test.bilibili.network;

import com.byx.test.bilibili.base.BaseResponse;
import com.byx.test.bilibili.widget.fans.FansEntity;
import com.byx.test.bilibili.widget.fans.Myinfo;
import com.byx.test.bilibili.widget.followlist.FollowListEntity;


import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by bob
 * Date : 21-8-31
 * Describe :
 */
public interface RequesInterface {

    @GET(value = "relation/stat")
    Observable<BaseResponse<FansEntity>> getFansById(@Query(value = "vmid") String vmid);

    @GET(value = "space/acc/info")
    Observable<BaseResponse<Myinfo>> getImageById(@Header(value = "user-agent") String Cookie, @Query(value = "mid") String mid);

    @GET
    Call<ResponseBody> getPic(@Url String url);

    @GET
    Call<ResponseBody> getVipPic(@Url String url);

    @GET(value = "space/bangumi/follow/list?type=1&pn=1&ps=16")
    Observable<BaseResponse<FollowListEntity>> getFollowListById(@Header(value = "Cookie") String Cookie, @Query(value = "vmid") String vmid);
}
