package com.sulway.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sulway on 2017-03-05.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;


    public class More{
        @SerializedName("txt")
        public String info;
    }
}
