
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
@Table(name = "curso")
public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String establecimiento;
    private String certificacion;
    private Date fecha_inicio;
    private Date fecha_final;
    private String url_logo;
    
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona; 
     
   @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado_carrera estado;
}
