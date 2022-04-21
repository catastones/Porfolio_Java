
package com.Porfolio2.App.repository;

import com.Porfolio2.App.model.Tipos_empleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposEmpleoRepository extends JpaRepository <Tipos_empleo , Long> {
    
}
