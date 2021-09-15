package com.vs.co.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.co.dao.PersonaRepositoryInt;
import com.vs.co.entity.Personas;


@RestController
@RequestMapping("/api/persona")
public class PersonaService {

	
	@Autowired
	private PersonaRepositoryInt personaRepositoryInt;
	
	@GetMapping
	public List<Personas> getTramites() {
		List<Personas> personasLista =personaRepositoryInt.findAll();
		return personasLista;
	}

}
