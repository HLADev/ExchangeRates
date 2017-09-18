package com.hlcsdev.x.exchangerates;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;


public class App extends Application {

    private static CbAPI cbAPI;

    @Override
    public void onCreate() {
        super.onCreate();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.cbr.ru/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        cbAPI = retrofit.create(CbAPI.class);
    }

    public static CbAPI getApi() {
        return cbAPI;
    }
}