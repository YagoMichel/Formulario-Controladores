package com.yago.formulario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;







@Controller
public class MascotasController {
    @GetMapping("/mascotas")
    public String listadoMascota() {
        return "mascotas/mascotas-listado";
    }
    @GetMapping("/mascotas/actualizar")
    public String actualizarMascota() {
        return "mascotas/mascotas-actualizar";
    }
    
    @GetMapping("/mascotas/eliminar")
    public String eliminarMascota() {
        return "mascotas/mascotas-eliminar";
    }
    
    

    @GetMapping("/mascotas/agregar")
    public String Mascota() {
        return "mascotas/mascotas-agregar";
    }
    @PostMapping("/mascotas/guardar")
    public String agregarMascota() {
        return "mascotas/mascotas-agregar";
    }
    
    
}
