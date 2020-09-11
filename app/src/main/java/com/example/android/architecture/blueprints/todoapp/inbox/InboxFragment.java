package com.example.android.architecture.blueprints.todoapp.inbox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class InboxFragment extends Fragment {

    private InboxViewModel mViewModel;
    private RecyclerView mRvInbox;

    public static InboxFragment newInstance() {
        return new InboxFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inbox, container, false);
        mViewModel = InboxActivity.obtainViewModel(getActivity());
        initView(view);
        setRecyclerview();
        return view;
    }

    private void setRecyclerview() {
        InboxListAdapter adapter = new InboxListAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRvInbox.setLayoutManager(layoutManager);
        mRvInbox.setAdapter(adapter);
    }

    private void initView(View view) {
        mRvInbox = view.findViewById(R.id.rv_inbox);
    }
}
