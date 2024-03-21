
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
@Table(name="rol") //va tal cual como esta escrito en la BD
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_rol")
    private Long idRol;
    private String nombre;

    
    @Column(name="id_usuario")
    private Long idUsuario;
}

