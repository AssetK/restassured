package com.bee1st.service

import com.bee1st.dto.TaskDto
import com.bee1st.model.Task
import java.util.*
import javax.persistence.Id

interface TaskService {
    fun getTasks(): List<Task>
    fun getTaskById(id: Int): Optional<Task>
    fun createTask(task: TaskDto)
    fun updateTask(id: Int, task: TaskDto)

}