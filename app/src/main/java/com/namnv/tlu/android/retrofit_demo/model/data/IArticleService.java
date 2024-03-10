package com.namnv.tlu.android.retrofit_demo.model.data;

import com.namnv.tlu.android.retrofit_demo.model.article.Answer;
import com.namnv.tlu.android.retrofit_demo.model.article.ArticleList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IArticleService {
    @GET("/2.3/answers?order=desc&sort=activity&site=stackoverflow")
    Call<ArticleList> doGetArticleList(@Query("page") String page);
}
