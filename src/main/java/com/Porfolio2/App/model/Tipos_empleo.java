
package com.Porfolio2.App.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "tipos_empleo")
public class Tipos_empleo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private String type_empleo;
    
     @JsonIgnore
    @OneToMany(mappedBy = "typejob")
    private Set<Experiencia> experiencias = new HashSet<>();
}
