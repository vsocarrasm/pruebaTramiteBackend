package com.vs.co.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vs.co.dao.TramiteRepositoryInt;
import com.vs.co.entity.Tramites;

@RestController
@RequestMapping("/api/tramite")
@CrossOrigin({"http://localhost:4200"})
public class TramiteService {
	
	@Autowired
	private TramiteRepositoryInt tramiteRepository;
	
	@GetMapping
	public List<Tramites> getTramites() {
		List<Tramites> tramitesLista =tramiteRepository.findAll();
		return tramitesLista;
	}
	
	@PostMapping
	public ResponseEntity<Void> crearTramite(@RequestBody Tramites tramite) {
		
		tramite.setId(null);
				
		Tramites tramitecre = tramiteRepository.save(tramite);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/").buildAndExpand().toUri();

		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable Integer id) {
		tramiteRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	
	

}
