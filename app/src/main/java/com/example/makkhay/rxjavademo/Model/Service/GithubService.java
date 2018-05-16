package com.example.makkhay.rxjavademo.Model.Service;

import com.example.makkhay.rxjavademo.Model.GithubRepos;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GithubService {
    @GET("users/{user}/starred")
    Observable<List<GithubRepos>> getStarredRepositories(@Path("user") String userName);
}
