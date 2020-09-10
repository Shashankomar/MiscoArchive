package com.example.android.architecture.blueprints.todoapp.tasks;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.architecture.blueprints.todoapp.R;
import com.example.android.architecture.blueprints.todoapp.ViewModelFactory;
import com.example.android.architecture.blueprints.todoapp.util.ActivityUtils;

public class DiscoverSearchActivity extends AppCompatActivity {

    private DiscoverSearchViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_search);

        mViewModel = obtainViewModel(this);

        setupViewFragment();

       /* Fragment mFragment;
        mFragment = new DiscoverSearchFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.frameLayout, mFragment).commit();*/
    }

    private void setupViewFragment() {
        DiscoverSearchFragment discoverSearchFragment =
                (DiscoverSearchFragment) getSupportFragmentManager().findFragmentById(R.id.frameLayout);
        if (discoverSearchFragment == null) {
            // Create the fragment
            discoverSearchFragment = DiscoverSearchFragment.newInstance();
            ActivityUtils.replaceFragmentInActivity(
                    getSupportFragmentManager(), discoverSearchFragment, R.id.frameLayout);
        }
    }
    public static DiscoverSearchViewModel obtainViewModel(FragmentActivity activity) {
        // Use a Factory to inject dependencies into the ViewModel
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication());

        DiscoverSearchViewModel viewModel =
                ViewModelProviders.of(activity, factory).get(DiscoverSearchViewModel.class);

        return viewModel;
    }
}