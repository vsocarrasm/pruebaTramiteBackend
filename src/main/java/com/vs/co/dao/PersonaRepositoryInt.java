package com.vs.co.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vs.co.entity.Personas;

@Repository
public interface PersonaRepositoryInt extends JpaRepository<Personas, Integer> {

}
