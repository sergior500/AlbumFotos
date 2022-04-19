package com.jacaranda.foto;

import java.util.Comparator;

public class ComparadorFotoNombre implements Comparator<Foto> {

	public ComparadorFotoNombre() {
	}

	@Override
	public int compare(Foto o1, Foto o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
