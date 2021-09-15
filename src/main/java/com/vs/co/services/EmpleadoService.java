package com.vs.co.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.co.dao.EmpleadoRepositoryInt;
import com.vs.co.dao.TramiteRepositoryInt;
import com.vs.co.entity.Empleados;
import com.vs.co.entity.Tramites;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoService {
	@Autowired
	private EmpleadoRepositoryInt empleadoRepositoryInt;
	
	@GetMapping
	public List<Empleados> getTramites() {
		List<Empleados> empleados =empleadoRepositoryInt.findAll();
		return empleados;
	}
}
