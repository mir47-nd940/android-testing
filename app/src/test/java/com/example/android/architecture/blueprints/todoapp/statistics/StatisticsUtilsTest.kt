package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.junit.Assert.assertEquals
import org.junit.Test

class StatisticsUtilsTest {

    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsZeroHundred() {
        val tasks = listOf(
            Task("title", "description", isCompleted = false)
        )

        val result = getActiveAndCompletedStats(tasks)

        assertEquals(0f, result.completedTasksPercent)
        assertEquals(100f, result.activeTasksPercent)
    }

    @Test
    fun getActiveAndCompletedStats_both_returnsFortySixty() {
        val tasks = listOf(
            Task("title", "description", isCompleted = true),
            Task("title", "description", isCompleted = true),
            Task("title", "description", isCompleted = false),
            Task("title", "description", isCompleted = false),
            Task("title", "description", isCompleted = false)
        )

        val result = getActiveAndCompletedStats(tasks)

        assertEquals(40f, result.completedTasksPercent)
        assertEquals(60f, result.activeTasksPercent)
    }
}