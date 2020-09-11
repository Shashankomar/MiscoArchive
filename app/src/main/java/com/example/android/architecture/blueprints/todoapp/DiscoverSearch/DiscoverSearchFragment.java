package com.example.android.architecture.blueprints.todoapp.DiscoverSearch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.android.architecture.blueprints.todoapp.R;
import com.google.android.material.tabs.TabLayout;

public class DiscoverSearchFragment extends androidx.fragment.app.Fragment {
    private ViewPager mVpSearch;
    private TabLayout mTabsSearch;
    private DiscoverSearchViewModel mViewModel;

    public static DiscoverSearchFragment newInstance() {
        return new DiscoverSearchFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover_search, container, false);

        mViewModel = DiscoverSearchActivity.obtainViewModel(getActivity());

        initView(view);
        return view;
    }


    private void initView(View view) {
        mVpSearch = view.findViewById(R.id.vp_search);
        mTabsSearch = view.findViewById(R.id.tabs_search);
        SearchFragmentAdapter searchFragmentAdapter = new SearchFragmentAdapter(getContext(), getChildFragmentManager());
        mVpSearch.setAdapter(searchFragmentAdapter);
        mTabsSearch.setupWithViewPager(mVpSearch);
    }
}
