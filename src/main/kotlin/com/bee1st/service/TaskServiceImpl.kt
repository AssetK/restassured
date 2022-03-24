package com.bee1st.service

import org.springframework.stereotype.Service
import com.bee1st.dataaccessobject.TaskDao
import com.bee1st.dto.TaskDto
import com.bee1st.model.Task
import java.util.*


@Service
class TaskServiceImpl(
    private val taskDao: TaskDao,
        ): TaskService {

    override fun getTasks(): List<Task> =
        taskDao.findAll().toList()

    override fun getTaskById(id: Int): Optional<Task> =
        taskDao.findById(id)

    override fun createTask(task: TaskDto) {
        val task = Task(
            name = task.name
        )
        taskDao.save(task)
    }

    override fun updateTask(id: Int, task: TaskDto) {
        taskDao.findById(id).ifPresent { oldTask ->
            val newTask = oldTask.copy(
            name = task.name,
        )
            taskDao.save(newTask)
        }
    }
}