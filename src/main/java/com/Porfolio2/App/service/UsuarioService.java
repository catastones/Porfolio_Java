/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Usuario;
import com.Porfolio2.App.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Cristian
 */
@Service
public class UsuarioService implements IUsuarioService{
    @Autowired 
    public UserRepository UserRepo;
    
    @Override
    public Usuario buscarUsuario(String nombre_usu) {
        return UserRepo.findByUsuario(nombre_usu);
    }
}
