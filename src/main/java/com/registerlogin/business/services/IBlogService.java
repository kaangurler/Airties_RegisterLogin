package com.registerlogin.business.services;

import com.google.gson.JsonElement;

import java.util.List;

public interface IBlogService {

    JsonElement createBlog(JsonElement jsonElement);
    List<JsonElement> getAllBlogs();
    JsonElement getBlogByBlogId(int blogId);
    JsonElement updateBlog(int blogId, JsonElement jsonElement);
    JsonElement updateBlogHeader(int blogId, JsonElement jsonElement);
    JsonElement updateBlogContent(int blogId, JsonElement jsonElement);
    JsonElement updateBlogImage(int blogId, JsonElement jsonElement);
    void deleteBlog(int blogId);

}
