package com.development.springboot.web.crud.servicio;

import com.development.springboot.web.crud.entidad.Estudiante;
import com.development.springboot.web.crud.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioImpl implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio repositorio;
    @Override
    public List<Estudiante> listarTodos() {
        return repositorio.findAll();
    }
}
