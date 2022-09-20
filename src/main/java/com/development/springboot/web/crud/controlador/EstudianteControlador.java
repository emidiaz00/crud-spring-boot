package com.development.springboot.web.crud.controlador;

import com.development.springboot.web.crud.repositorio.EstudianteRepositorio;
import com.development.springboot.web.crud.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio servicio;

    @GetMapping("/estudiantes")
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", servicio.listarTodos());
        return "estudiantes";
    }
}
