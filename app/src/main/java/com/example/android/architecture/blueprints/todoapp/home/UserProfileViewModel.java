package com.example.android.architecture.blueprints.todoapp.home;

import androidx.lifecycle.ViewModel;

import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;

public class UserProfileViewModel extends ViewModel {

    private TasksRepository mTasksRepository;

    public UserProfileViewModel(TasksRepository tasksRepository) {
        mTasksRepository = tasksRepository;
    }
}
