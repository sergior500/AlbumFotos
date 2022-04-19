package com.jacaranda.foto;

import java.util.Comparator;

public class ComparadorFotoFechaCreacion implements Comparator<Foto> {

	public ComparadorFotoFechaCreacion() {
		
	}

	@Override
	public int compare(Foto o1, Foto o2) {
		return o1.getFechaCreacion().compareTo(o2.getFechaCreacion());
	}

}
