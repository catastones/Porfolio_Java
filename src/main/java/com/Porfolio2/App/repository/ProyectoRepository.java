
package com.Porfolio2.App.repository;

import com.Porfolio2.App.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto , Long>{
    
}
