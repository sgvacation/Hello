package com.p.zw;

import android.util.Log;		// Testing purpose

/**
 * Created by Administrator on 8/19/15.
 */
public class LogDisplay {

    private String tag;

    public LogDisplay () {
        // constructor
    }

    public void setTag (String value) {
        tag = value;
    }

    public String getTag () {
        return tag;
    }

    public void displayLog (String value) {
        //Log.i (tag, value);
        displayLog(tag, value);
    }

    public void displayLog (String tagv, String value) {
        Log.i (tagv, value);
    }

}
