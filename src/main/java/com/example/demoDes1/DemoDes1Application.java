package com.example.demoDes1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demoDes1.model.Edificio;
import com.example.demoDes1.services.EdificioI;

@SpringBootApplication
public class DemoDes1Application implements CommandLineRunner {

	@Autowired
	private EdificioI edificio1;	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoDes1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("La aplicación ha arrancado.");
		Edificio edificioViviendas = this.edificio1.crearEdificio(3, 3);
		
		String[][] arrayViviendas = edificioViviendas.getEdificioViviendas();
		edificio1.anadirPersona(arrayViviendas, "Juan", 0, 0);
		edificio1.anadirPersona(arrayViviendas, "Ana", 0, 1);
		edificio1.anadirPersona(arrayViviendas, "Manolo", 1, 0);
		edificio1.anadirPersona(arrayViviendas, "Pablo", 1, 2);
		edificio1.anadirPersona(arrayViviendas, "Manolo", 2, 2);
		
		edificio1.mostrarPersonasEdificio(arrayViviendas);
		
		edificio1.buscarEnEdificioPorNombre(arrayViviendas, "Pablo");
	}

}
