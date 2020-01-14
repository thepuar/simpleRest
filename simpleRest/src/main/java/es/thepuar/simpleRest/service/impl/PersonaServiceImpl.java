package es.thepuar.simpleRest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.thepuar.simpleRest.Repository.PersonaDAO;
import es.thepuar.simpleRest.model.Persona;
import es.thepuar.simpleRest.service.api.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	PersonaDAO personaDAO;

	@Override
	public List<Persona> findAll() {
		initialize();
		return personaDAO.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		
		return personaDAO.save(persona);
	}

	@Override
	public void initialize() {
		
		if(personaDAO.count()==0) {
			List<Persona> personas = new ArrayList<>();
			for(int i =0;i<10;i++) {
				Persona persona = new Persona();
				persona.setNombre("PERSONA_"+i);
				persona.setApellidos("APELLIDO_"+i);
				personas.add(persona);
			}
			personas.forEach(persona -> this.save(persona));
		}
		
		
	}
	
	

}
