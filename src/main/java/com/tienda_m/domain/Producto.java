
package com.tienda_m.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author badmd
 */
@Data //Esto es una anotacion
@Entity
@Table(name="producto") //va tal cual como esta escrito en la BD
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
}

