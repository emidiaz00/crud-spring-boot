package com.development.springboot.web.crud;

import com.development.springboot.web.crud.entidad.Estudiante;
import com.development.springboot.web.crud.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;
	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiante estudiante1 = new Estudiante("Emiliano", "Diaz", "emildsn003@gmail.com");
		repositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("Valentin", "Diaz", "valendsn@gmail.com");
		repositorio.save(estudiante2);

		 */
	}
}
