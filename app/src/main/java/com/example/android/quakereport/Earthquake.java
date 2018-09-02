package com.example.android.quakereport;

public class Earthquake {

    private double mMag;
    private String mPlace, mUrl;
    private long mTimeInMilliseconds;

    public Earthquake(double mag, String place, long timeInMilliseconds, String url) {
        mMag = mag;
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getmMag() {
        return mMag;
    }

    public String getmPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }
}
