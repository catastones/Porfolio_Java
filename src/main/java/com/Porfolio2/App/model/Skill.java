
package com.Porfolio2.App.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "skills")
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String habilidad;
    private int porcentaje;
    
     //@ManyToOne
   // @JoinColumn(name = "persona_id")
   // private Persona persona; 
}
