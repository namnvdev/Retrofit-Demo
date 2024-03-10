package com.namnv.tlu.android.retrofit_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.namnv.tlu.android.retrofit_demo.model.article.Answer;
import com.namnv.tlu.android.retrofit_demo.model.article.ArticleList;
import com.namnv.tlu.android.retrofit_demo.model.data.IArticleService;
import com.namnv.tlu.android.retrofit_demo.network.APIClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private final String TAG="MainActivity";
    IArticleService mArticleService;
    ArticleList mArticleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //retrofit2 here
        mArticleService  = APIClient.getClient().create(IArticleService.class);
        Call<ArticleList> call = mArticleService.doGetArticleList("1");
        call.enqueue(new Callback<ArticleList>() {
            @Override
            public void onResponse(Call<ArticleList> call, Response<ArticleList> response) {
                Log.d(TAG, "onResponse: " + response.code());
               mArticleList = response.body();
                for (Answer a : mArticleList.getItems()) {
                    Log.d(TAG, a.getContent_license() + a.getAnswer_id());
                }
            }
            @Override
            public void onFailure(Call<ArticleList> call, Throwable t) {
                Log.d(TAG,"failed" + t.getMessage());
            }
        });

        ((TextView)findViewById(R.id.tvHello)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity","Article list:" + mArticleList.getItems().size());
            }
        });

    }
}