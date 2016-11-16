package com.wimso.android_uploadimage.network;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Wim on 10/6/16.
 */
public interface UploadInterface {

    @Multipart
    @POST(Config.API_UPLOAD)
    Call<BaseResponse> uploadPhotoMultipart(
            @Part("action") RequestBody action,
            @Part MultipartBody.Part photo);

    @FormUrlEncoded
    @POST(Config.API_UPLOAD)
    Call<BaseResponse> uploadPhotoBase64(
            @Field("action") String action,
            @Field("photo") String photo);

}
