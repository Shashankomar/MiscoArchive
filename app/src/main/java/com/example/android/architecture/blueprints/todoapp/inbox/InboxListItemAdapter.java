package com.example.android.architecture.blueprints.todoapp.inbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class InboxListItemAdapter extends RecyclerView.Adapter<InboxListItemAdapter.InboxListItemViewHolder> {
    private Context mContext;

    public InboxListItemAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public InboxListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inbox_list_item, parent, false);
        return new InboxListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InboxListItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public static class InboxListItemViewHolder extends RecyclerView.ViewHolder {
        public InboxListItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
