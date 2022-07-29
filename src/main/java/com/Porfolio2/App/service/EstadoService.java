/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Estado_carrera;
import com.Porfolio2.App.repository.EstadoCarreraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristian
 */
@Service
public class EstadoService implements IEstadoService {
    @Autowired 
    public EstadoCarreraRepository EstadoRepo;
    
    @Override
    public List<Estado_carrera> VerEstados() {
        return EstadoRepo.findAll();
    }

    @Override
    public void CrearEstado(Estado_carrera estado) {
        
        EstadoRepo.save(estado);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarEstado(Long id) {
        EstadoRepo.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estado_carrera buscarEstado(Long id) {
        
        return EstadoRepo.findById(id).orElse(null);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
