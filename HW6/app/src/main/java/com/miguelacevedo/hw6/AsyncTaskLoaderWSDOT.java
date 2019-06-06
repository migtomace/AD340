package com.miguelacevedo.hw6;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

public class AsyncTaskLoaderWSDOT extends AsyncTaskLoader<String> {

    public AsyncTaskLoaderWSDOT(Context context) {
        super(context);

    }

    @Nullable
    @Override
    public String loadInBackground() {

        String url = "https://web6.seattle.gov/Travelers/api/Map/Data?zoomId=13&type=2";

        return NetworkConnection.getData(url);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
}