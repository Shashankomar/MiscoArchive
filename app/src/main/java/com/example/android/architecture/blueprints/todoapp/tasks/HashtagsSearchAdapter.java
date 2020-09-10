package com.example.android.architecture.blueprints.todoapp.tasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class HashtagsSearchAdapter extends RecyclerView.Adapter<HashtagsSearchAdapter.HashtagsViewHolder> {
    private Context mContext;

    public HashtagsSearchAdapter(Context context) {
        mContext = context;
    }


    @NonNull
    @Override
    public HashtagsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hashtags_search, parent, false);
        return new HashtagsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HashtagsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class HashtagsViewHolder extends RecyclerView.ViewHolder {
        public HashtagsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
