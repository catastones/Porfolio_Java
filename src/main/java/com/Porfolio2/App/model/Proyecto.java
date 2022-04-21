
package com.Porfolio2.App.model;

import java.util.Date;
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
@Table(name = "proyectos")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre_proyecto;
    private String descripcion;
    private Date fecha;
    private String link_proyecto;
    private String url_img;
    
      
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;  
}
