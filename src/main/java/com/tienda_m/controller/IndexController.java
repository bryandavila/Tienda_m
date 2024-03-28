package com.tienda_m.controller;

import com.tienda_m.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author badmd
 */
@Controller
public class IndexController {
    
    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String listado(Model model){
        var lista = productoService.getProductos(false);
        model.addAttribute("productos",lista);
        return "index";
    }
}
