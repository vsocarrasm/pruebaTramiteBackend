package com.vs.co.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vs.co.entity.Empleados;


@Repository
public interface EmpleadoRepositoryInt extends JpaRepository<Empleados, Integer>{

}
