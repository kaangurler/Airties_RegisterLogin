package com.registerlogin.business.services.impl;

import com.google.gson.JsonElement;
import com.registerlogin.business.services.IBlogService;
import com.registerlogin.retrofit.RetrofitCommonGenerics;
import com.registerlogin.retrofit.request.IBlogServiceRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Log4j2
@Transactional

@Service
public class BlogServiceImpl implements IBlogService {

    private final IBlogServiceRequest blogServiceRequest;

    @Override
    public JsonElement createBlog(JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(blogServiceRequest.createBlog(jsonElement));
    }

    @Override
    public List<JsonElement> getAllBlogs() {
        return RetrofitCommonGenerics.retrofitGenerics(blogServiceRequest.getAllBlogs());
    }

    @Override
    public JsonElement getBlogByBlogId(int blogId) {
        return RetrofitCommonGenerics.retrofitGenerics(blogServiceRequest.getBlog(blogId));
    }

    @Override
    public JsonElement updateBlog(int blogId, JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(blogServiceRequest.updateBlog(blogId, jsonElement));
    }

    @Override
    public JsonElement updateBlogHeader(int blogId, JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(blogServiceRequest.updateBlogHeader(blogId, jsonElement));
    }

    @Override
    public JsonElement updateBlogContent(int blogId, JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(blogServiceRequest.updateBlogContent(blogId, jsonElement));
    }

    @Override
    public JsonElement updateBlogImage(int blogId, JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(blogServiceRequest.updateBlogImage(blogId, jsonElement));
    }

    @Override
    public void deleteBlog(int blogId) {
        RetrofitCommonGenerics.retrofitGenerics(blogServiceRequest.deleteBlog(blogId));
    }
}
