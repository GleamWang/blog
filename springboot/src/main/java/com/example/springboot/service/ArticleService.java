package com.example.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.Article;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ArticleService {

    void insert(Article article);

    String upload(MultipartFile file) throws IOException;

    void getFiles(String flag, HttpServletResponse response);

    Page<Article> findPage(Integer pageNum, Integer pageSize, String search);

    Article selectById(String id);

    Page<Article> findPageByTag(Integer pageNum, Integer pageSize, String tag);

    Page<Article> findPageByAuthor(Integer pageNum, Integer pageSize, String author);

    Page<Article> findPageByCategory(Integer pageNum, Integer pageSize, String category);
}
