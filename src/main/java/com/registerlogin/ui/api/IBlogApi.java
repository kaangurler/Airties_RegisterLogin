package com.registerlogin.ui.api;

import com.google.gson.JsonElement;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBlogApi {

    ResponseEntity<?> createBlog(JsonElement jsonElement);
    ResponseEntity<?> getBlog(int id);
    ResponseEntity<List<?>> getAllBlogs();
    ResponseEntity<?> updateBlog(int id, JsonElement jsonElement);
    ResponseEntity<?> updateBlogHeader(int id, JsonElement jsonElement);
    ResponseEntity<?> updateBlogContent(int id, JsonElement jsonElement);
    ResponseEntity<?> updateBlogImage(int id, JsonElement jsonElement);
    ResponseEntity<?> deleteBlog(int id);

}
