package com.sulway.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sulway on 2017-03-05.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
