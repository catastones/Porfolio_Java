
package com.Porfolio2.App.repository;

import com.Porfolio2.App.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface PersonaRepository extends JpaRepository <Persona , Long> {
    
}
