/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Usuario;
import com.Porfolio2.App.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Cristian
 */
public class UsuarioService implements IUsuarioService{
    @Autowired 
    public UserRepository UserRepo;
    @Override
    public Usuario buscarUsuario(String usuario) {
        return UserRepo.findByUsuario(usuario);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
