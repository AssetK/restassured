package com.bee1st.controller

import com.bee1st.dto.TaskDto
import com.bee1st.model.Task
import com.bee1st.service.TaskService
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.persistence.Id


@RestController
@RequestMapping("/tasks")
class TaskController (
    private val taskService: TaskService,
        ) {

        @GetMapping
        fun getTasks(): List<Task> = taskService.getTasks()

        @GetMapping("/{id}")
        fun getTaskById(@PathVariable id: Int): Optional<Task> = taskService.getTaskById(id)


        @PostMapping
        fun createTask(@RequestBody dto: TaskDto) {
            taskService.createTask(dto)
        }

        @PutMapping("/{id}")
        fun updateTask(@PathVariable id: Int, @RequestBody dto: TaskDto) {
            taskService.updateTask(id, dto)
        }

}
