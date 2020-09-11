package com.example.android.architecture.blueprints.todoapp.inbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class InboxListAdapter extends RecyclerView.Adapter<InboxListAdapter.InboxListViewHolder> {
    private Context mContext;

    public InboxListAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public InboxListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inbox_list, parent, false);
        return new InboxListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InboxListViewHolder holder, int position) {
        setRecyclerview(holder);
    }

    private void setRecyclerview(InboxListViewHolder holder) {
        InboxListItemAdapter adapter = new InboxListItemAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext);
        holder.rvInboxListItem.setLayoutManager(layoutManager);
        holder.rvInboxListItem.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class InboxListViewHolder extends RecyclerView.ViewHolder {
        private final RecyclerView rvInboxListItem;

        public InboxListViewHolder(@NonNull View itemView) {
            super(itemView);

            rvInboxListItem = itemView.findViewById(R.id.rv_inbox_list_item);
        }



    }
}
