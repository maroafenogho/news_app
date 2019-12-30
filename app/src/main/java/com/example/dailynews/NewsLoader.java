package com.example.dailynews;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

class NewsLoader extends AsyncTaskLoader<List<News>> {

    /**
     * Query URL
     */
    private String mUrl;

    public NewsLoader(Context context, String url) {

        super(context);
        mUrl=url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<News> newsUpdate = QueryUtils.fetchNewsData(mUrl);
        return newsUpdate;
    }
}
