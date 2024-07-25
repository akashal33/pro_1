package com.mapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapp.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{

}
