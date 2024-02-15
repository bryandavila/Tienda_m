package com.tienda_m.service;

import com.tienda_m.domain.Categoria;
import java.util.List;

/**
 *
 * @author badmd
 */
public interface CategoriaService {
    //Se define la firma del metodo para obtener los registros de categoria, en forma de lista
    public List<Categoria> getCategorias(boolean activo);
}
