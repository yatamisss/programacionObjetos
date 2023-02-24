package com.clase2302.programacionobjetos.models;

    //todo lo que tenga que ver con perro tiene que ir dentro de las llaves, nada afuera 

public class Perro {
    //cuando nosotros creamos atributos de objetos, en este caso un perro, 
    //podemos determinar si el atributo es privado o publico 
    //esto va a depender de la sensibilidad de datos

    /***********************Inicio atributos**********************/
    public String raza;
    public String color;
    public Double tamanio;
    public String pelaje;
    public char sexo; // 'F'
    private Integer chip; // Integer es el objeto de int


// atributos - constructores -(entre estos dos van los Getter y Setter)- funcionalidades del objeto
// (las funcionalidades yo se las doy)(se espera este orden por buenas practicas)

    /**********************Inicio Constructores******************/
    //constructor por defecto 
    //este tipo de constructor debe estar si o si en TODAS las clases
    public Perro() {
    }

    //constructor de objeto completo
    //Este tambien debe estar en Todas las clases que crearemos
    public Perro(String raza, String color, Double tamanio, String pelaje, char sexo, Integer chip) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
    }
    /*************************Fin constructores**************************/


    /************************Inicio Getter y Setter***********************/

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    }

    /*************************Inicio Funcionalidades***********************/

    public void ladrar(){
        System.out.println("Guau!!");
    }


    public String romperCosas(boolean meRetaron){
        if(meRetaron == true){
            return "Destrozo";
        }else{
            return "No destrozo";
        }
    }

    public String cavar(){
        return "El perro cavo un hoyo en el patio";
    }

    // podemos modificar esta estructura en caso de que queramos o no cierto dato
    // puedo tener mas de un toString, siempre es bueno tener un toString en los objetos 
     
    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", pelaje=" + pelaje + ", sexo="
                + sexo + ", chip=" + chip + "]";
    }

    
}
