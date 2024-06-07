package com.prudhvi.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prudhvi.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
