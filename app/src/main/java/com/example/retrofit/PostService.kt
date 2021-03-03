package com.example.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface PostService {

    //url
    @GET("posts")
    fun list(): Call<List<PostModel>>



}