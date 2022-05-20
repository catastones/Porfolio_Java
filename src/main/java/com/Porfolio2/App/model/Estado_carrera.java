
package com.Porfolio2.App.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "estadocarrera")
public class Estado_carrera {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Estado;
    
    //@JoinColumn(name = "estado_id")
    //@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    //private Set<Educacion> educacion = new HashSet<>(); 
    
    @JsonIgnore
    @OneToMany(mappedBy = "estado")
    private Set<Educacion> educacion = new HashSet<>(); 
    
     @JsonIgnore
    @OneToMany(mappedBy = "estado")
    private Set<Curso> cursos = new HashSet<>();

   
}
