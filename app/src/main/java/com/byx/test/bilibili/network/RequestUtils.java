package com.byx.test.bilibili.network;


import com.byx.test.bilibili.base.BaseResponse;
import com.trello.rxlifecycle2.components.support.RxFragment;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;


/**
 * Created by bob
 * Date : 21-11-9
 * Describe :
 */
public class RequestUtils {

    /**
     * 上传图片
     * @param context
     * @param observer
     */
    public static void upImagView(RxFragment context, String access_token, String str, Observer<BaseResponse>  observer){
        File file = new File(str);
//        File file = new File(imgPath);
        Map<String, String> header = new HashMap<String, String>();
        header.put("Accept","application/json");
        header.put("Authorization",access_token);
//        File file =new File(filePath);
        RequestBody reqFile = RequestBody.create(MediaType.parse("image/*"), file);
//        RequestBody requestFile =
//                RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part body =
                MultipartBody.Part.createFormData("file", file.getName(), reqFile);
//        RetrofitUtils.getApiUrl().uploadImage(header,body).compose(RxHelper.observableIO2Main(context))
//                .subscribe(observer);
    }

//    public void uploadPic(File file, String kdID, OnRequest request){
//        RequestBody image = RequestBody.create(MediaType.parse("application/octet-stream"), file);
//        RequestBody requestBody = new MultipartBody.Builder()
//                .setType(MultipartBody.FORM)
//                .addFormDataPart("kdId", kdID)
//                .addFormDataPart("images", file.getName(), image)
//                .build();
//        client.newCall(builder.post(requestBody).build()).enqueue(new Callback() {
//            @Override
//            public void onFailure(okhttp3.Call call, IOException e) {
//                request.onFailure(e);
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                int code = response.code();
//                if (response.isSuccessful()){
//                    String body = response.body().string();
//                    request.onResponse(code, gson.fromJson(body, ModifyRemark.class));
//                }else {
//                    request.onFailure(code);
//                }
//            }
//        });
//    }

//    /**
//     * 上传多张图片
//     * @param files
//     */
//    public static void upLoadImg(RxFragment context,String access_token,List<File> files, Observer<BaseResponse>  observer1){
//        Map<String,String> header = new HashMap<String, String>();
//        header.put("Accept","application/json");
//        header.put("Authorization",access_token);
//        MultipartBody.Builder builder = new MultipartBody.Builder()
//                .setType(MultipartBody.FORM);//表单类型
//        for (int i = 0; i < files.size(); i++) {
//            File file = files.get(i);
//            RequestBody photoRequestBody = RequestBody.create(MediaType.parse("image/*"), file);
//            builder.addFormDataPart("file", file.getName(), photoRequestBody);
//        }
//        List<MultipartBody.Part> parts = builder.build().parts();
//        RetrofitUtils.getApiUrl().uploadImage1(header,parts).compose(RxHelper.observableIO2Main(context))
//                .subscribe(observer1);
//    }



}
