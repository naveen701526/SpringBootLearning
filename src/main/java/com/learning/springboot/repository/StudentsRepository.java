package com.learning.springboot.repository;

import com.learning.springboot.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
