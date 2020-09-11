package com.example.android.architecture.blueprints.todoapp.DiscoverSearch;

import androidx.lifecycle.ViewModel;

import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;

public class DiscoverSearchViewModel extends ViewModel {
    private TasksRepository mTasksRepository;

    public DiscoverSearchViewModel(TasksRepository tasksRepository) {
        mTasksRepository = tasksRepository;
    }
}
