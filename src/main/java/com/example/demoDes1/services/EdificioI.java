package com.example.demoDes1.services;

import java.util.List;

import com.example.demoDes1.model.Edificio;

public interface EdificioI {

	public Edificio crearEdificio(Integer plantas, Integer apart);
	
	public void anadirPersona(String[][] edificio, String nombre, Integer plt, Integer aprt);
	
	public void mostrarPersonasEdificio(String[][] edificio);
	
	public void buscarEnEdificioPorNombre(String[][] edificio, String nombre);
	
}
