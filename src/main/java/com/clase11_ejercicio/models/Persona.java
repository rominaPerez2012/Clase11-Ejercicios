package com.clase11_ejercicio.models;

import lombok.Getter;
import lombok.Setter;

public class Persona {
	
	@Getter @Setter public String nombre;
	@Getter @Setter public String apellido;
	@Getter @Setter public String fechaNacimiento;
	
	public Persona() {
		
	}

}
