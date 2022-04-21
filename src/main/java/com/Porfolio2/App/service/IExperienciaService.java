
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Experiencia;

import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> VerExperiencias();
    public void CrearExperiencia(Experiencia expe);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
    
    
}
