/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Users;
import com.Porfolio2.App.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristian
 */
@Service
public class UsersServise  implements IUsersServise{
    @Autowired 
    public UsersRepository UserRepository;
            
    @Override
    public Users buscarUsuario(String usuario) {
         return UserRepository.findByUsuario(usuario);
    }
    
}
