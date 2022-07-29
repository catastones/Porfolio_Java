
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Estado_carrera;
import com.Porfolio2.App.model.Tipos_empleo;
import com.Porfolio2.App.repository.TiposEmpleoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristian
 */
@Service
public class TiposService implements ITiposService{
    @Autowired 
    public TiposEmpleoRepository tiposRepository;

    @Override
    public List<Tipos_empleo> VerTipos() {
        
        return tiposRepository.findAll();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrearTipo(Tipos_empleo Tipo) {
        tiposRepository.save(Tipo);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarTipo(Long id) {
        
        tiposRepository.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipos_empleo buscarTipo(Long id) {
        
       return tiposRepository.findById(id).orElse(null);
  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
