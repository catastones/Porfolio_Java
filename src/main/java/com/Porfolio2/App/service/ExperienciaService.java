
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Experiencia;
import com.Porfolio2.App.repository.ExperienciaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired 
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> VerExperiencias() {
       return expeRepo.findAll();
    }

    @Override
    public void CrearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
        
    }

    @Override
    public void borrarExperiencia(Long id) {
       expeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

    //@Override
   // public List<Experiencia> findExperienciaByPersona(Long persona_id) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

   

    

   
    
}
