package com.amv.simple.app.mvvmtodo.ui.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.amv.simple.app.mvvmtodo.data.TaskDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val taskDao: TaskDao
): ViewModel() {

    val tasks = taskDao.getTasks().asLiveData()
}