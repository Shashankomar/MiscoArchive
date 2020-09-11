package com.example.android.architecture.blueprints.todoapp.inbox;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.architecture.blueprints.todoapp.R;
import com.example.android.architecture.blueprints.todoapp.ViewModelFactory;
import com.example.android.architecture.blueprints.todoapp.discoversearch.DiscoverSearchFragment;
import com.example.android.architecture.blueprints.todoapp.discoversearch.DiscoverSearchViewModel;
import com.example.android.architecture.blueprints.todoapp.util.ActivityUtils;

public class InboxActivity extends AppCompatActivity {
    private InboxViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);

        mViewModel = obtainViewModel(this);

        setupViewFragment();

    }

    private void setupViewFragment() {
        InboxFragment inboxFragment =
                (InboxFragment) getSupportFragmentManager().findFragmentById(R.id.frameLayout);
        if (inboxFragment == null) {
            // Create the fragment
            inboxFragment = InboxFragment.newInstance();
            ActivityUtils.replaceFragmentInActivity(
                    getSupportFragmentManager(), inboxFragment, R.id.fl_inbox);
        }
    }

    public static InboxViewModel obtainViewModel(FragmentActivity activity) {
        // Use a Factory to inject dependencies into the ViewModel
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication());

        InboxViewModel viewModel =
                ViewModelProviders.of(activity, factory).get(InboxViewModel.class);

        return viewModel;
    }
}
