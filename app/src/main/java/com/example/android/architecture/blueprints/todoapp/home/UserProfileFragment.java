package com.example.android.architecture.blueprints.todoapp.home;

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
import com.example.android.architecture.blueprints.todoapp.discoversearch.TopSearchAdapter;

public class UserProfileFragment extends Fragment {

    private UserProfileViewModel mViewModel;
    private RecyclerView mRvUserProfile;

    public static UserProfileFragment newInstance() {
        return new UserProfileFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_profile, container, false);
        mViewModel = UserProfileActivity.obtainViewModel(getActivity());
        initView(view);
        setRecyclerview();
        return view;
    }

    private void setRecyclerview() {
        UserProfileAdapter adapter = new UserProfileAdapter(getContext());
        GridLayoutManager manager = new GridLayoutManager(getContext(), 3, GridLayoutManager.VERTICAL, false);
        mRvUserProfile.setLayoutManager(manager);
        mRvUserProfile.setAdapter(adapter);
    }

    private void initView(View view) {
        mRvUserProfile = view.findViewById(R.id.rv_user_profile);
    }
}
