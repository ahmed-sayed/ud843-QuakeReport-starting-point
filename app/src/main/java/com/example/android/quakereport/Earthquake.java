package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by Ahmed Sayed on 4/4/2018.
 */

public class Earthquake {

    private double mMagnitiude;
    private String mLocation;
    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url                is the url path for the eartquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitiude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getmMagnitiude() {
        return mMagnitiude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }

}
