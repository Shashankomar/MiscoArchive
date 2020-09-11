package com.example.android.architecture.blueprints.todoapp.inbox;

import androidx.lifecycle.ViewModel;

import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;

public class InboxViewModel extends ViewModel {

    private TasksRepository mTasksRepository;

    public InboxViewModel(TasksRepository mTasksRepository) {

        this.mTasksRepository = mTasksRepository;
    }
}
