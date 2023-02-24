package com.clase2302.programacionobjetos;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


import com.clase2302.programacionobjetos.models.Perro;

@SpringBootApplication
public class programacionobjetos {

	public static void main(String[] args) {
		//crear un perro por defecto 
		Perro perroDefault = new Perro();
		//Crear un perro con todos sus atributos 
		Perro perroCompleto = new Perro("Salchicha", "cafe", 40.5, "pelo duro", 'F', 1235468);

		// por buenas practicas es mejor llamar al .toString
		System.out.println(perroDefault.toString());
		System.out.println(perroCompleto.toString());

	    perroDefault.setRaza("Quiltro");
		perroDefault.setColor("Blanco");

		System.out.println(perroDefault.toString());

		//la magia del get es traer el dato puro y duro, es para obtener el dato
		System.out.println(perroCompleto.getTamanio());

		Double tamanioPerroCompleto = perroCompleto.getTamanio();
		System.out.println(tamanioPerroCompleto);

		perroCompleto.setTamanio(50.8);
		System.out.println(perroCompleto.toString());

        //esto es un ejemplo de que se pueden usar las ArrayList aqui
		ArrayList <Perro> misPerros = new ArrayList<Perro>();
		misPerros.add(perroCompleto);
		misPerros.add(perroDefault);
		System.out.println("Desde aqui es el array");
		System.out.println("misPerros");
		misPerros.get(1).setTamanio(85.6);

		System.out.println("Desde aqui es el array modificado");
		System.out.println("misPerros");

		// tarea: como ingresar los datos por la consola.
        // hacer un perro con datos ingresados por el usuario
			
    Scanner dato = new Scanner(System.in);

	System.out.print("ingrese la raza de su perro: ");
	perroDefault.setRaza(dato.nextLine());

	System.out.print("ingrese el color de su perro: ");
	perroDefault.setColor(dato.nextLine());

	//perroDefault.setTamanio(Double.ParseDouble(dato.nextLine))
	System.out.print("ingrese el tamaño de su perro en cm: ");
	perroDefault.setTamanio(dato.nextDouble());

	dato.nextLine();
	System.out.print("ingrese el tipo de pelaje de su perro: ");
    perroDefault.setPelaje(dato.nextLine());

	System.out.print("ingrese el sexo de su mascota (M:macho H:hembra)" );
	perroDefault.setSexo(dato.next().charAt(0));

	//perroDefault.setChip(Integer.ParseInt(dato.nextLine))
	System.out.print("Ingrese el número de chip de su perro");
	perroDefault.setChip(dato.nextInt());

	System.out.println(perroDefault.toString());
    //System.out.println(perroCompleto.toString());

	}
}
