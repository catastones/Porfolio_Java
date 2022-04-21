
package com.Porfolio2.App.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "experiencias")
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String empresa;
    private String tareas;
    private Date fecha_inicio;
    private Date fecha_final;    
    private String url_img_logo;
    
    //@ManyToOne
    //@JsonIgnore
   // @JoinColumn(name = "persona_id")
    //private  Persona persona;
    
    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipos_empleo typejob; 
}
