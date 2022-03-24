package com.bee1st.dataaccessobject

import com.bee1st.model.Task
import org.springframework.data.repository.CrudRepository
import org.springframework.web.bind.annotation.RestController

//import org.springframework.data.rest.core.annotation.RepositoryRestResource
//import org.springframework.stereotype.Repository

//@RepositoryRestResource(path = "tasks")
//interface TaskDao: CrudRepository<Task, Int>

@RestController
interface TaskDao: CrudRepository<Task, Int>
