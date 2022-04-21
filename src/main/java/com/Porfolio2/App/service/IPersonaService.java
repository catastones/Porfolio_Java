
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> VerPersonas();
    public void CrearPersona(Persona perso);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}
