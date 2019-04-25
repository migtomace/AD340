package com.miguelacevedo.hw3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";
    public static final String TITLE = "title";
    public static final String YEAR = "year";
    public static final String NAME = "name";
    public static final String URL = "url";
    public static final String DESCRIPTION = "description";


    String[][] array;
    Context context;

    public RecyclerViewAdapter(String[][] array, Context context) {
        this.array = array;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.i(TAG, "onCreateViewHolder: called.");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.tv_title.setText(array[i][0]); //movies[i][0]
        viewHolder.tv_year.setText(array[i][1]); //movies[i][1]
        final int n = i;
        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = array[n][0];
                String year = array[n][1];
                String name = array[n][2];
                String url = array[n][3];
                String description = array[n][4];

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(YEAR, year);
                intent.putExtra(NAME, name);
                intent.putExtra(URL, url);
                intent.putExtra(DESCRIPTION, description);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return array.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title, tv_year;
        LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            tv_year = itemView.findViewById(R.id.tv_year);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}
