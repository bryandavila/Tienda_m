
package com.tienda_m.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author badmd
 */
@Data //Esto es una anotacion
@Entity
@Table(name="categoria") //va tal cual como esta escrito en la BD
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_categoria",updatable = false)
    private List<Producto> productos;
}

