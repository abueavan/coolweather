package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eavan on 2018/7/19.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
