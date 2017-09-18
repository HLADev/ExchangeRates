package com.hlcsdev.x.exchangerates;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface CbAPI {

    @GET("scripts/XML_daily_eng.asp")
    Call<ValCurs> getData(@Query("date_req") String dateReg);

}
