package es.thepuar.simpleRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.thepuar.simpleRest.model.Persona;
import es.thepuar.simpleRest.service.api.PersonaService;

@RestController
@RequestMapping(path="/personas")
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Persona> getAll(){
		return personaService.findAll();
	}
}
