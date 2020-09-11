package com.example.android.architecture.blueprints.todoapp.discoversearch;

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

public class UsersSearchFragment extends Fragment {
    private RecyclerView mRvUsers;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        UsersSearchFragment fragment = new UsersSearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_users_search, container, false);
        initView(view);
        setRecyclerView();

        return view;
    }
    private void initView(View view) {
        mRvUsers = view.findViewById(R.id.rv_users);
    }

    private void setRecyclerView() {
        UsersSearchAdapter adapter = new UsersSearchAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRvUsers.setLayoutManager(layoutManager);
        mRvUsers.setAdapter(adapter);
    }}