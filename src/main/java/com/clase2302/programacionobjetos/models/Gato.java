package com.clase2302.programacionobjetos.models;

//clase 24-02-2023
//aqui yo estoy indicando que Gato hereda los atributos y metodos de animal
public class Gato extends Animal {
    public Integer cantBigotes;
    //el constructor por defecto de una clase hija, debe tener la funcion super()
    //para asi obtener los atributos de animal 
    public Gato (){
    super();
 }

public Gato(String nombre, String raza, String pelaje, Boolean vacunado, Integer cantBigotes) {
    super(nombre, raza, pelaje, vacunado);
    this.cantBigotes = cantBigotes;
}
//como animal ya tiene los getters y setter, gato ya los tiene internamente heredados 
//asi que por eso no los pone nuevamente aqui 
public Integer getCantBigotes() {
    return cantBigotes;
}

public void setCantBigotes(Integer cantBigotes) {
    this.cantBigotes = cantBigotes;
}

public void maullar(){
    System.out.println("miauu");
}

@Override
public String toString() {
    //concatenamos el toString desde Animal
    //esto hay que hacerlo a mano 
    //con el super llamamos a la clase padre
    return super.toString() + "Gato [cantBigotes=" + cantBigotes + "]";
}


 
}
