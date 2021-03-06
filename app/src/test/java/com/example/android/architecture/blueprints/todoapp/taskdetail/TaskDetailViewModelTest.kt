package com.example.android.architecture.blueprints.todoapp.taskdetail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.android.architecture.blueprints.todoapp.data.Task
import com.example.android.architecture.blueprints.todoapp.data.source.FakeTestRepository
import com.example.android.architecture.blueprints.todoapp.tasks.TasksFilterType
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TaskDetailViewModelTest {

    // Use a fake repository to be injected into the viewmodel
    private lateinit var tasksRepository: FakeTestRepository

    // Subject under test
    private lateinit var taskDetailViewModel: TaskDetailViewModel

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setupViewModel() {
        // We initialise the tasks to 3, with one active and two completed
        tasksRepository = FakeTestRepository()
        val task1 = Task("Title1", "Description1")
        val task2 = Task("Title2", "Description2", true)
        val task3 = Task("Title3", "Description3", true)
        tasksRepository.addTasks(task1, task2, task3)

        taskDetailViewModel = TaskDetailViewModel(tasksRepository)
    }

    @Test
    fun addNewTask_setsNewTaskEvent() {
//        // When adding a new task
//        taskDetailViewModel.
//
//        // Then the new task event is triggered
//        val value = taskDetailViewModel.newTaskEvent.getOrAwaitValue()
//        assertThat(value.getContentIfNotHandled(), not(nullValue()))
    }
}