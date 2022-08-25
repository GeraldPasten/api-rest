package com.pruebas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.dao.PersonaDAO;
import com.pruebas.model.Persona;

@RestController
@RequestMapping("personas")
public class PersonaRest {

	@Autowired
	private PersonaDAO personaDAO;
	
	//METODOS HTTP - SOLICITUD AL SERVIDOR
	
	@PostMapping("/insert")
	public void guardar(@RequestBody Persona persona) 
	{
		personaDAO.save(persona);
	}
	
	@GetMapping("/listar")
	public List<Persona> getList ()
	{
		return personaDAO.findAll();
	}
}
