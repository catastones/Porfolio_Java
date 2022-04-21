
package com.Porfolio2.App.repository;

import com.Porfolio2.App.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona , Long> {
    
}
