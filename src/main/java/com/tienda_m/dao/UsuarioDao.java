
package com.tienda_m.dao;

import com.tienda_m.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author badmd
 */
public interface UsuarioDao extends JpaRepository<Usuario,Long>{
    
    public Usuario findByUsername(String username);
    
}
