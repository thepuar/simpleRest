package es.thepuar.simpleRest.service.api;

import java.util.ArrayList;
import java.util.List;

import es.thepuar.simpleRest.model.Persona;

public interface PersonaService {
	
	public List<Persona> findAll();
	
	public Persona save(Persona persona);
	
	public void initialize();
	
	
	
	

}
