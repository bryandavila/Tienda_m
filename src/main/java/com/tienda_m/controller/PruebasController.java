package com.tienda_m.controller;

import com.tienda_m.domain.Producto;
import com.tienda_m.service.CategoriaService;
import com.tienda_m.service.ProductoService;
import com.tienda_m.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author badmd
 */
@Controller
@RequestMapping("/pruebas")
public class PruebasController {
    
    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listado(Model model){
        var lista = productoService.getProductos(false);
        model.addAttribute("productos",lista);
        
        //Para poder hacer las opciones de lista
        var categorias = categoriaService.getCategorias(true);
        model.addAttribute("categorias",categorias);
        return "/pruebas/listado";
    }
}