
package com.Porfolio2.App.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter @Setter
@Entity
@Table(name = "personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String telefono;    
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date Fecha_nacimiento;    
    private String email;
    private String localidad;
    private String provincia;
    private String url_img_perfil;
    private String url_img_portada;
    private String link_github;
    private String link_linkedin;
    private String acerca;
    private String ocupacion;
    
    //@JsonIgnore 
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "persona_id")
    //private Set<Experiencia> experiencia = new HashSet<>();
    private List<Experiencia> experiencias;
   
    //@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "persona_id")
    //private Set<Educacion> educacion = new HashSet<>();   
    private List<Educacion> educacion;
    
    //@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "persona_id")
    //private Set<Curso> curso = new HashSet<>();    
    private List<Curso> cursos;
    
    //@JsonIgnore
    @JoinColumn(name = "persona_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)    
    //private Set<Skill> skill = new HashSet<>(); 
    private List<Skill> skills;
    
    //@JsonIgnore
    @JoinColumn(name = "persona_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    //private Set<Proyecto> proyecto = new HashSet<>(); 
    private List<Proyecto> proyectos;    
    
    @ManyToOne
    @JoinColumn(name = "redes_id")
    private Redes redes;

}
