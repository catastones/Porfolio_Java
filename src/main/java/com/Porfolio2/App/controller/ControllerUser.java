/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.controller;

import com.Porfolio2.App.model.Users;

import com.Porfolio2.App.service.IUsersServise;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cristian
 */
@RestController
@RequestMapping("api")
public class ControllerUser {
    //
    @Autowired   
    public IUsersServise userService;
    
    /**
     *
     * @param usuario
     * @param Pass
     * @return
     */
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/login")
    public Users getUser(@RequestParam("usuario") String usuario, @RequestParam("Pass") String Pass ){
        
        Users user = userService.buscarUsuario(usuario);
        
        if (user != null) {
            if (user.getPass().equals(Pass)) {
                String token = getJWTToken(usuario);
                user.setPass("");
                user.setUsuario(usuario);
                user.setToken(token); 
                user.setAut(true);
                user.setStatus("Ok");
                
            }
        } 
        return user;

    }
    private String getJWTToken(String usuario) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("id")
                .setSubject(usuario)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000)) //Tiempo de expiración
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }
    
}
