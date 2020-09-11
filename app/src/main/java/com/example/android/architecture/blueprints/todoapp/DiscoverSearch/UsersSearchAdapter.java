package com.example.android.architecture.blueprints.todoapp.DiscoverSearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class UsersSearchAdapter extends RecyclerView.Adapter<UsersSearchAdapter.UsersViewHolder> {
    private Context mContext;

    public UsersSearchAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_users_search, parent, false);
        return new UsersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class UsersViewHolder extends RecyclerView.ViewHolder {
        public UsersViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
