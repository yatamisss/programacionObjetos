package com.clase2302.programacionobjetos;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clase2302.programacionobjetos.models.Animal;
import com.clase2302.programacionobjetos.models.Conejo;
import com.clase2302.programacionobjetos.models.Crayon;
import com.clase2302.programacionobjetos.models.Gato;
import com.clase2302.programacionobjetos.models.Lapiz;
import com.clase2302.programacionobjetos.models.Perro;
import com.clase2302.programacionobjetos.models.Plumon;
import com.clase2302.programacionobjetos.models.Portamina;

import java.util.Scanner;

@SpringBootApplication
public class programacionobjetos {

	public static void main(String[] args) {
		//crear un perro por defecto 
		Perro perroDefault = new Perro();
		//Crear un perro con todos sus atributos 
		Perro perroCompleto = new Perro("Salchicha", "cafe", 40.5, "pelo duro", 'F', 1235468);

		// por buenas practicas es mejor llamar al .toString
		System.out.print(perroDefault.toString());
		System.out.print(perroCompleto.toString());

	    perroDefault.setRaza("Quiltro");
		perroDefault.setColor("Blanco");

		System.out.print(perroDefault.toString());

		//la magia del get es traer el dato puro y duro, es para obtener el dato
		System.out.print(perroCompleto.getTamanio());

		Double tamanioPerroCompleto = perroCompleto.getTamanio();
		System.out.print(tamanioPerroCompleto);

		perroCompleto.setTamanio(50.8);
		System.out.print(perroCompleto.toString());

        //esto es un ejemplo de que se pueden usar las ArrayList aqui
		ArrayList <Perro> misPerros = new ArrayList<Perro>();
		misPerros.add(perroCompleto);
		misPerros.add(perroDefault);
		System.out.print("Desde aqui es el array");
		System.out.print("misPerros");
		misPerros.get(1).setTamanio(85.6);

		System.out.print("Desde aqui es el array modificado");
		System.out.print("misPerros");

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

	System.out.print("ingrese el sexo de su mascota (M:macho H:hembra): " );
	perroDefault.setSexo(dato.next().charAt(0));

	//perroDefault.setChip(Integer.ParseInt(dato.nextLine))
	System.out.print("Ingrese el número de chip de su perro: ");
	perroDefault.setChip(dato.nextInt());

	System.out.println(perroDefault.toString());
    System.out.println(perroCompleto.toString());

	

	/*Aqui comenzamos a hacer pruebas con herencia */

	/*creacion de un gato */

	    Gato michiVacio = new Gato();
		Gato michiGordito = new Gato("MichiGuaton", "Egipcio", "calvo",true, 12);

		System.out.println(michiVacio);
		System.out.println(michiGordito);

		Conejo seniorBigotes = new Conejo();
		Conejo badBunny = new Conejo("Bad Bunny", "Cabeza de leon", "peludito", false, 5.0);
		System.out.print("Desde aquí parten los conejos :D");
		System.out.print(seniorBigotes);
		System.out.print(badBunny);
		/*----------------------------------------------------------- */
		michiVacio.setNombre("Pelusa");
		seniorBigotes.setNombre("Señor Bigotes");
		System.out.print("**************************");
		System.out.print(michiVacio);
		System.out.print(seniorBigotes);
		/********************************************************** */
		//No puedes ingresar a los métodos de las clases hermanas
		michiGordito.maullar();
		badBunny.saltarAlto();
		//pero ambos pueden llamar al metodo de la clase padre :D
		michiGordito.caminar();
		badBunny.caminar();
		/******************************** */
		//definir solo un animal
		Animal animalSimple = new Animal();
		System.out.print(animalSimple);


		/*prueba para crear un lapiz */

		Plumon plumonDefault = new Plumon();
		Plumon plumonCompleto = new Plumon("plastico", "tinta negra", 12.5, "tiene tapa", true); 
		System.out.print(plumonDefault);
		System.out.print(plumonCompleto);

		Portamina portaminaDefault = new Portamina();
		Portamina portaminaCompleto = new Portamina("plastico", "tinta dura", 10.5, true, false);
		System.out.println(portaminaDefault);
		System.out.println(portaminaCompleto);
		portaminaCompleto.setMaterial("plastico");
		System.out.println(portaminaCompleto.toString());

		Crayon crayonVacio = new Crayon();
		Crayon crayonCompleto = new Crayon("cera", "aspera", 6.5, "papel", "se puede derretir");
		System.out.println(crayonVacio);
		System.out.println(crayonCompleto);

	}
}
