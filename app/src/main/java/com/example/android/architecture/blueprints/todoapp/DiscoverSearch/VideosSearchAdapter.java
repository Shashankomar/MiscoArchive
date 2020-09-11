package com.example.android.architecture.blueprints.todoapp.DiscoverSearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class VideosSearchAdapter extends RecyclerView.Adapter<VideosSearchAdapter.VideosViewHolder> {
    private Context mContext;

    public VideosSearchAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public VideosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_videos_search, parent, false);
        return new VideosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class VideosViewHolder extends RecyclerView.ViewHolder {
        public VideosViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
