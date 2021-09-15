package com.vs.co.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vs.co.entity.Tramites;

@Repository
public interface TramiteRepositoryInt extends JpaRepository<Tramites, Integer>{

}
