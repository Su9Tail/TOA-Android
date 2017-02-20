package com.cdtxz.toa.apis;

import com.cdtxz.toa.beans.Authentication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Cals on 2017/2/14.
 */

public interface AuthenticationInterface {
    @POST("login")
    Call<String> login(@Body Authentication authentication);
}
