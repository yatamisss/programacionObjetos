package com.clase2302.programacionobjetos.models;

public class Crayon extends Lapiz{
    public String envoltorio;
    public String derretir;

    public Crayon() {
        super();
    }

    public Crayon(String material, String tinta, Double tamaño, String envoltorio, String derretir) {
        super(material, tinta, tamaño);
        this.envoltorio = envoltorio;
        this.derretir = derretir;
    }

    public String getEnvoltorio() {
        return envoltorio;
    }

    public void setEnvoltorio(String envoltorio) {
        this.envoltorio = envoltorio;
    }

    public String getDerretir() {
        return derretir;
    }

    public void setDerretir(String derretir) {
        this.derretir = derretir;
    }

    public void envoltorio(){
        System.out.println("tu crayon tiene envoltorio asi que pinta con confianza");
    }

    public void derretir(){
        System.out.println("tu crayon se puede derretir, asi que mantenlo lejos del fuego");
    }
    @Override
    public String toString() {
        return super.toString() + "Crayon [envoltorio=" + envoltorio + ", derretir=" + derretir + "]";
    }

    

   
    

    
}

