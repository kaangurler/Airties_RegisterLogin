package com.registerlogin.ui.api.impl;

import com.google.gson.JsonElement;
import com.registerlogin.business.services.IBlogService;
import com.registerlogin.ui.api.IBlogApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("gateway/blog")
public class BlogApiImpl implements IBlogApi {

    private final IBlogService blogService;


    @Override
    @PostMapping("/create")
    public ResponseEntity<?> createBlog(@RequestBody JsonElement jsonElement) {
        return ResponseEntity.ok(blogService.createBlog(jsonElement));
    }

    @Override
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getBlog(@PathVariable int id) {
        return ResponseEntity.ok(blogService.getBlogByBlogId(id));
    }

    @Override
    @GetMapping("/get-all")
    public ResponseEntity<List<?>> getAllBlogs() {
        return ResponseEntity.ok(blogService.getAllBlogs());
    }

    @Override
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateBlog(@PathVariable int id, @RequestBody JsonElement jsonElement) {
        return ResponseEntity.ok(blogService.updateBlog(id, jsonElement));
    }

    @Override
    @PutMapping("/update-header/{id}")
    public ResponseEntity<?> updateBlogHeader(@PathVariable int id, @RequestBody JsonElement jsonElement) {
        return ResponseEntity.ok(blogService.updateBlogHeader(id, jsonElement));
    }

    @Override
    @PutMapping("/update-content/{id}")
    public ResponseEntity<?> updateBlogContent(@PathVariable int id, @RequestBody JsonElement jsonElement) {
        return ResponseEntity.ok(blogService.updateBlogContent(id, jsonElement));
    }

    @Override
    @PutMapping("/update-image/{id}")
    public ResponseEntity<?> updateBlogImage(@PathVariable int id, @RequestBody JsonElement jsonElement) {
        return ResponseEntity.ok(blogService.updateBlogImage(id, jsonElement));
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable int id) {
        blogService.deleteBlog(id);
        return ResponseEntity.ok("Deleted");
    }
}
