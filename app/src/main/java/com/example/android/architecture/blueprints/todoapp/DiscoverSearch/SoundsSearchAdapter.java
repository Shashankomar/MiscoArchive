package com.example.android.architecture.blueprints.todoapp.DiscoverSearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class SoundsSearchAdapter extends RecyclerView.Adapter<SoundsSearchAdapter.SoundsViewHolder> {
    private Context mContext;

    public SoundsSearchAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public SoundsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sounds_search, parent, false);
        return new SoundsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class SoundsViewHolder extends RecyclerView.ViewHolder {
        public SoundsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
