
package com.Porfolio2.App.repository;

import com.Porfolio2.App.model.Estado_carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoCarreraRepository extends JpaRepository <Estado_carrera , Long>{
    
}
