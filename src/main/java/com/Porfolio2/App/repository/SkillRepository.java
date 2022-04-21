
package com.Porfolio2.App.repository;

import com.Porfolio2.App.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill , Long>{
    
}
