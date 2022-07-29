/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Cristian
 */
@Getter @Setter
@Entity
@Table(name = "redes")
public class Redes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 500)
    private String link_github;
    @Column(length = 500)
    private String link_linkedin;
    @Column(length = 500)
    private String link_yuotube;
    @Column(length = 500)
    private String link_twitter;
    @Column(length = 500)
    private String link_facebook;
    @Column(length = 500)
    private String link_instagram;
    
//    @JsonIgnore
//    @OneToMany(mappedBy = "redes")
//    private Set<Persona> persona = new HashSet<>();
}
