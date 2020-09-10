package com.example.android.architecture.blueprints.todoapp.tasks;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.architecture.blueprints.todoapp.R;

public class SearchFragmentAdapter extends FragmentPagerAdapter {
    private static final int[] TAB_TITLES = new int[]{R.string.top, R.string.users,R.string.videos,R.string.sounds,R.string.hashtags}; //,R.string.tab_text_11
    private Context mContext;
    private FragmentManager mChildFragmentManager;

    public SearchFragmentAdapter(Context context, FragmentManager childFragmentManager) {
        super(childFragmentManager);
        mContext = context;
        mChildFragmentManager = childFragmentManager;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return TopSearchFragment.newInstance(1);
            case 1:
                return UsersSearchFragment.newInstance(1);
            case 2:
                return VideosSearchFragment.newInstance(1);
            case 3:
                return SoundsSearchFragment.newInstance(1);
            case 4:
                return HashtagsSearchFragment.newInstance(1);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

}
