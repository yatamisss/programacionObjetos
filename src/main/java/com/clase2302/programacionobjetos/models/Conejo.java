package com.clase2302.programacionobjetos.models;

public class Conejo extends Animal {

    public Double longitudOrejas;

    public Conejo() {
        super();
    }

    public Conejo(String nombre, String raza, String pelaje, Boolean vacunado, Double longitudOrejas) {
        super(nombre, raza, pelaje, vacunado);
        this.longitudOrejas = longitudOrejas;
    }

    public Double getlongitudOrejas() {
        return longitudOrejas;
    }

    public void setlongitudOrejas(Double longitudOrejas) {
        this.longitudOrejas = longitudOrejas;
    }

    public void saltarAlto(){
        System.out.println("Brinco Brinco");
    }

    @Override
    public String toString() {
        return super.toString() + "Conejo [longitudOrejas=" + longitudOrejas + "]";
    } 


    }

    

 
    
    
    

