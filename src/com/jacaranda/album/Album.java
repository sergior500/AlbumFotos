package com.jacaranda.album;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jacaranda.foto.ComparadorFotoFechaCreacion;
import com.jacaranda.foto.ComparadorFotoNombre;
import com.jacaranda.foto.Foto;

public class Album {
	
	private List<Foto> listaFotos = new ArrayList<Foto>();
	private LocalDateTime fechaCreacion;
	
	public Album() {
		this.fechaCreacion = LocalDateTime.now();
	}

	public List<Foto> getListaFotos() {
		return listaFotos;
	}

	public void setListaFotos(List<Foto> listaFotos) {
		this.listaFotos = listaFotos;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public void addFoto(Foto nuevaFoto) {
		listaFotos.add(nuevaFoto);
	}
	private static void IterarAlbum(Album nuevoAlbum) {
		Iterator<Foto> iterador = nuevoAlbum.getListaFotos().iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
	}
	public void mostrarFotosPorFechaNombre(Album nuevoAlbum) {
		nuevoAlbum.getListaFotos().sort(new ComparadorFotoFechaCreacion().thenComparing(new ComparadorFotoNombre()));
		IterarAlbum(nuevoAlbum);
	}
	public void mostrarFotosPorNombreFecha(Album nuevoAlbum) {
		nuevoAlbum.getListaFotos().sort(new ComparadorFotoNombre().thenComparing(new ComparadorFotoFechaCreacion()));
		IterarAlbum(nuevoAlbum);
	}
}
