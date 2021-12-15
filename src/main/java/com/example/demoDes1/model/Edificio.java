package com.example.demoDes1.model;

public class Edificio {

	private String[][] edificioViviendas;

	public Edificio(Integer plantas, Integer apart) {
		this.edificioViviendas = new String[plantas][apart];
	}

	public String[][] getEdificioViviendas() {
		return edificioViviendas;
	}

	public void setEdificioViviendas(String[][] edificioViviendas) {
		this.edificioViviendas = edificioViviendas;
	}
	
}
