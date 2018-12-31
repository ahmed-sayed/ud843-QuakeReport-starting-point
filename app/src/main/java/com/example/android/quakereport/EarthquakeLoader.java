package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.android.quakereport.Earthquake;
import com.example.android.quakereport.QueryUtils;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String urls;

    public EarthquakeLoader(Context context, String urls) {
        super(context);
        this.urls = urls;
    }


    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // Don't perform the request if there are no URLs, or the first URL is null.
        if ( urls == null) {
            return null;
        }
        List<Earthquake> earthquake_result = QueryUtils.fetchEarthquakesData(urls);
        return earthquake_result;
    }

}
