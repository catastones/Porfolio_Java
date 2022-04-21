
package com.Porfolio2.App.repository;


import com.Porfolio2.App.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion , Long> {
    
}
