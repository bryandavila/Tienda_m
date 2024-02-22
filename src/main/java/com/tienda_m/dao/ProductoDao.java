
package com.tienda_m.dao;

import com.tienda_m.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author badmd
 */
public interface ProductoDao extends JpaRepository<Producto,Long>{
    
}
