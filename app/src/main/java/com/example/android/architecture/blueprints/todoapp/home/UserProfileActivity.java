package com.example.android.architecture.blueprints.todoapp.home;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.architecture.blueprints.todoapp.R;
import com.example.android.architecture.blueprints.todoapp.ViewModelFactory;
import com.example.android.architecture.blueprints.todoapp.util.ActivityUtils;

public class UserProfileActivity extends AppCompatActivity {
    private UserProfileViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        mViewModel = obtainViewModel(this);

        setupViewFragment();


    }


    private void setupViewFragment() {
        UserProfileFragment userProfileFragment =
                (UserProfileFragment) getSupportFragmentManager().findFragmentById(R.id.fl_user_profile);
        if (userProfileFragment == null) {
            // Create the fragment
            userProfileFragment = UserProfileFragment.newInstance();
            ActivityUtils.replaceFragmentInActivity(
                    getSupportFragmentManager(), userProfileFragment, R.id.fl_user_profile);
        }
    }

    public static UserProfileViewModel obtainViewModel(FragmentActivity activity) {
        // Use a Factory to inject dependencies into the ViewModel
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication());

        UserProfileViewModel viewModel =
                ViewModelProviders.of(activity, factory).get(UserProfileViewModel.class);

        return viewModel;
    }
}
