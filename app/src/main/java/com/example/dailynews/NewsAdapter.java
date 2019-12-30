package com.example.dailynews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter (Context context, ArrayList<News> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            News currentNews = getItem(position);

            TextView sectionNameText = listView.findViewById(R.id.section_name);
            sectionNameText.setText(currentNews.getName());

            TextView newsTitle = listView.findViewById(R.id.news_title);
            newsTitle.setText(currentNews.getTitle());

            String newDate= currentNews.getDate().substring(0,10);

            String newTime= currentNews.getDate().substring(11,19);

            TextView dateView =  listView.findViewById(R.id.date);
            dateView.setText(newDate);

            TextView timeView = listView.findViewById(R.id.time);
           timeView.setText(newTime);

            TextView authorName = listView.findViewById(R.id.author);
            authorName.setText(currentNews.getAuthorName());
        }
        return listView;
    }

}
