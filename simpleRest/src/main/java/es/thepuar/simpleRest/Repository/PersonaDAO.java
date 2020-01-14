package es.thepuar.simpleRest.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.thepuar.simpleRest.model.Persona;

@Repository
public interface PersonaDAO extends JpaRepository<Persona, Long> {

	
}
