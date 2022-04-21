/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.controller;

import com.Porfolio2.App.model.Experiencia;
import com.Porfolio2.App.model.Persona;
import com.Porfolio2.App.service.IExperienciaService;
import com.Porfolio2.App.service.IPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cristian
 */
@RestController
public class Controller {
    
  
   @Autowired   
    public IPersonaService  persoServ;
   
   @Autowired   
   public IExperienciaService expeServ;
    
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/addpersona")
    public void addPersona(@RequestBody Persona perso){
        persoServ.CrearPersona(perso);

    }
    
    
    
    @GetMapping ("/listPerso")
    @ResponseBody
    public List<Persona> ListPerso(){
        return persoServ.VerPersonas();
        
    }
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
    
     /* @param expe-*/
    @PostMapping ("/addexperiencia")
    public void addExperiencia(@RequestBody Experiencia expe){
        
        expeServ.CrearExperiencia(expe);
    }
    
    @GetMapping ("/verexperiencia/{id}")
    @ResponseBody
    public Experiencia VerExperiencia(@PathVariable Long id){
        return expeServ.buscarExperiencia(id);
        
    }
   
}
