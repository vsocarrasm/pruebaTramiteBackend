package com.vs.co.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vs.co.entity.Tipoidentificaciones;

@Repository
public interface TipoIdentificacionRepositoryInt extends JpaRepository<Tipoidentificaciones, Integer> {

}
