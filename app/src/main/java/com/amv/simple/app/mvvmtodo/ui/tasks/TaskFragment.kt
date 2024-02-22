package com.amv.simple.app.mvvmtodo.ui.tasks

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.amv.simple.app.mvvmtodo.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TaskFragment:Fragment(R.layout.fragment_tasks) {

    private val viewModel: TaskViewModel by viewModels()
}