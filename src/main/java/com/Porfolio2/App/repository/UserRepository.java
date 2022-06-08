
package com.Porfolio2.App.repository;

import com.Porfolio2.App.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristian
 */
@Repository
public interface UserRepository extends JpaRepository <Usuario , Long> {
    public Usuario findByUsuario(String usuario);
}
