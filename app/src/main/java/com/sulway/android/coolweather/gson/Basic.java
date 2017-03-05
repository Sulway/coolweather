package com.sulway.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sulway on 2017-03-05.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
