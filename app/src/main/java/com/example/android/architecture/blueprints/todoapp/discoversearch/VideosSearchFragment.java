package com.example.android.architecture.blueprints.todoapp.discoversearch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.architecture.blueprints.todoapp.R;

public class VideosSearchFragment extends Fragment {
    private RecyclerView mRvVideos;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        VideosSearchFragment fragment = new VideosSearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_videos_search, container, false);

        initView(view);
        setRecyclerView();

        return view;
    }

    private void initView(View view) {
        mRvVideos = view.findViewById(R.id.rv_videos);
    }

    private void setRecyclerView() {
        VideosSearchAdapter adapter = new VideosSearchAdapter(getContext());
        GridLayoutManager manager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
        mRvVideos.setLayoutManager(manager);
        mRvVideos.setAdapter(adapter);
    }
}
