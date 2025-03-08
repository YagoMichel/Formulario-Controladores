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
    public String form_actualizarMascota() {
        return "mascotas/mascotas-actualizar";
    }
    
    @GetMapping("/mascotas/eliminar")
    public String form_eliminarMascota() {
        return "mascotas/mascotas-eliminar";
    }

    @GetMapping("/mascotas/agregar")
    public String Mascota() {
        return "mascotas/mascotas-agregar";
    }

    //Controladores post

    @PostMapping("/mascotas/guardar")
    public String agregarMascota() {

        return "redirect:/mascotas";
    }

    @PostMapping("/mascotas/eliminar")
    public String eliminarMascota() {

        return "redirect:/mascotas";
    }

    @PostMapping("/mascotas/actualizar")
    public String actualizarMascota() {

        return "redirect:/mascotas";
    }

    
    
}
