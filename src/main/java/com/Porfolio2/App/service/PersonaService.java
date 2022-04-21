
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Persona;
import com.Porfolio2.App.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PersonaService implements IPersonaService {
    
    @Autowired 
    public PersonaRepository personaRepo;
    
    @Override
    public List<Persona> VerPersonas() {
       return personaRepo.findAll();
    }

    @Override
    public void CrearPersona(Persona perso) {
        personaRepo.save(perso);
       
    }

    @Override
    public void borrarPersona(Long id) {
       personaRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
     return personaRepo.findById(id).orElse(null);
    }
    
}
