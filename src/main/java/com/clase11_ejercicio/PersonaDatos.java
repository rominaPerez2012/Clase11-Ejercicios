package com.clase11_ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.clase11_ejercicio.models.Persona;

public class PersonaDatos {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		List<Persona> listaDePersonas = new ArrayList<Persona>();
		
		String continuar = "S";
		
		while (continuar.equals("S")) {
			
			Persona unaPersona = new Persona();
			
			System.out.println("Por favor ingrese el nombre: ");
			unaPersona.setNombre(scn.nextLine());
			
			System.out.println("Ingrese el apellido: ");
			unaPersona.setApellido(scn.nextLine());
			
			System.out.println("Ingrese la fecha de nacimiento: ");
			unaPersona.setFechaNacimiento(scn.nextLine());
			
			listaDePersonas.add(unaPersona);
			
			System.out.println("Si desea ingresar los datos de otra persona, presione S sino N:");
			continuar = scn.nextLine();
			
		}
		
		System.out.println("¿Desea visualizar los datos de todas las personas ingresadas? S o N.");
		
		if (scn.nextLine().equals("S")) {
			
			for (Persona persona : listaDePersonas) {
		        System.out.println(persona.getNombre() + " " + persona.getApellido() + " - " + persona.getFechaNacimiento());
		    }
		
		}
		

		System.out.println("Gracias!");

	}
	

}
