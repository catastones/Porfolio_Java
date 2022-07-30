/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.controller;


import com.Porfolio2.App.model.Estado_carrera;
import com.Porfolio2.App.model.Persona;
import com.Porfolio2.App.model.Tipos_empleo;
import com.Porfolio2.App.service.IEstadoService;

import com.Porfolio2.App.service.IPersonaService;
import com.Porfolio2.App.service.ITiposService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cristian
 */
@RestController
@RequestMapping("api")
public class Controller {
    
  
   @Autowired   
    public IPersonaService  persoServ; 
 
    
    
    @CrossOrigin(origins = "https://porfoliocristian-ed2f1.web.app/")
    @PostMapping ("/addpersona")
    public void addPersona(@RequestBody Persona perso){
        persoServ.CrearPersona(perso);

    } 
    
    
    @GetMapping ("/listPerso")
    @ResponseBody
    public List<Persona> ListPerso(){
        return persoServ.VerPersonas();
        
    }
    @CrossOrigin(origins = "https://porfoliocristian-ed2f1.web.app/")
    @GetMapping ("/verpersona/{id}")
    @ResponseBody
    public Persona VerPerso(@PathVariable Long id){
        return persoServ.buscarPersona(id);
        
    }
    /**-------------------------------*/
    @GetMapping ("/hola")
    public String Hola(){
        return "Hola mundo App Porfolio2";
    }
    
    /*--------------------*/
    
    @Autowired   
    public ITiposService  tipoServ;
    
    @CrossOrigin(origins = "https://porfoliocristian-ed2f1.web.app/")
    @GetMapping ("/tiposempleos")
    @ResponseBody
    public List<Tipos_empleo> ListTipos(){
        return tipoServ.VerTipos();
        
    }  
    
    @Autowired   
    public IEstadoService  estadoServ;
    
    @CrossOrigin(origins = "https://porfoliocristian-ed2f1.web.app/")
    @GetMapping ("/estadocarrera")
    @ResponseBody
    public List<Estado_carrera> ListEstados(){
        return estadoServ.VerEstados();
        
    } 
}
