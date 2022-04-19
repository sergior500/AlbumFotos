package com.jacaranda.foto;

import java.time.LocalDateTime;

public class Foto {
	
	private String nombre;
	private LocalDateTime fechaCreacion;
	
	public Foto(String nombre) {
		this.nombre = nombre;
		this.fechaCreacion = LocalDateTime.now();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	@Override
	public String toString() {
		return "Foto con nombre: " + nombre + " y fechaCreacion " + fechaCreacion;
	}



}
