/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.repository;

import com.Porfolio2.App.model.Usuario;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Cristian
 */
public interface UserRepository extends JpaRepository <Usuario , Serializable> {
    public abstract Usuario findByUsuario(String usuario);
}
