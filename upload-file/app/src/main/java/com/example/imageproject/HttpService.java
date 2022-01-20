package com.example.imageproject;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface HttpService {

    @Multipart
    @POST("/RestApiUploadAndroid/upload_api.php")
    Call<FileModel> callUploadApi(@Part MultipartBody.Part image);

    @Multipart
    @POST("/RestApiUploadAndroid/multi_upload.php")
    Call<FileModel> callMultipleUploadApi(@Part List<MultipartBody.Part> image);
}
