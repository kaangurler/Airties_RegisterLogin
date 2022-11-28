package com.registerlogin.retrofit.request;

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface IBlogServiceRequest {

    @POST("/blog/create")
    Call<JsonElement> createBlog(@Body JsonElement jsonElement);

    @GET("/blog/get-all")
    Call<List<JsonElement>> getAllBlogs();

    @GET("/blog/get/{id}")
    Call<JsonElement> getBlog(@Path("id") int id);

    @PUT("/blog/update/{id}")
    Call<JsonElement> updateBlog(@Path("id") int id, @Body JsonElement jsonElement);

    @PUT("/blog/update-header/{id}")
    Call<JsonElement> updateBlogHeader(@Path("id") int id, @Body JsonElement jsonElement);

    @PUT("/blog/update-content/{id}")
    Call<JsonElement> updateBlogContent(@Path("id") int id, @Body JsonElement jsonElement);

    @PUT("/blog/update-image/{id}")
    Call<JsonElement> updateBlogImage(@Path("id") int id, @Body JsonElement jsonElement);

    @DELETE("/blog/delete/{id}")
    Call<JsonElement> deleteBlog(@Path("id") int id);


}
