package com.br0ke.retrofitjava.service;

import com.br0ke.retrofitjava.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=43d7ec341cdacaa68ed75c4b9f9ece780813a6cd")
    Call<List<CryptoModel>> getData();
}
