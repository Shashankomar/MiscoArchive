package com.example.android.architecture.blueprints.todoapp.discoversearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class TopSearchAdapter extends RecyclerView.Adapter<TopSearchAdapter.TopViewHolder> {
    private Context mContext;

    public TopSearchAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public TopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_top_search, parent, false);
        return new TopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class TopViewHolder extends RecyclerView.ViewHolder {
        public TopViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
