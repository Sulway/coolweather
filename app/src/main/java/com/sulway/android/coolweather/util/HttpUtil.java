package com.sulway.android.coolweather.util;

import android.app.DownloadManager;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import static android.R.string.ok;

/**
 * Created by Sulway on 2017-03-03.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
