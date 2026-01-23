package com.nikhilsable.repository;

import com.nikhilsable.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity,Long> {

}
