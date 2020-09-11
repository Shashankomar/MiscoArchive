package com.example.android.architecture.blueprints.todoapp.DiscoverSearch;

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

public class HashtagsSearchFragment extends Fragment {
    private RecyclerView mRvHashtags;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        HashtagsSearchFragment fragment = new HashtagsSearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hashtags_search, container, false);

        initView(view);
        setRecyclerView();

        return view;
    }

    private void initView(View view) {
        mRvHashtags = view.findViewById(R.id.rv_hashtags);
    }

    private void setRecyclerView() {
        HashtagsSearchAdapter adapter = new HashtagsSearchAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRvHashtags.setLayoutManager(layoutManager);
        mRvHashtags.setAdapter(adapter);
    }
}
