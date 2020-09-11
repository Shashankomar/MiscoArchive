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

public class TopSearchFragment extends Fragment {

    private RecyclerView mRvTop;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        TopSearchFragment fragment = new TopSearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top_search, container, false);
        initView(view);
        setRecyclerView();
        return view;
    }

    private void initView(View view) {
        mRvTop = view.findViewById(R.id.rv_top);
    }

    private void setRecyclerView() {
        TopSearchAdapter adapter = new TopSearchAdapter(getContext());
        GridLayoutManager manager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
        mRvTop.setLayoutManager(manager);
        mRvTop.setAdapter(adapter);
    }
}
