package com.clase2302.programacionobjetos.models;

public class Lapiz {
    public String material;
    public String tinta;
    public Double tamanio;

    public Lapiz() {
    }

    public Lapiz(String material, String tinta, Double tamanio) {
        this.material = material;
        this.tinta = tinta;
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTinta() {
        return tinta;
    }

    public void setTinta(String tinta) {
        this.tinta = tinta;
    }

    public Double gettamanio() {
        return tamanio;
    }

    public void settamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Lapiz [material=" + material + ", tinta=" + tinta + ", tamanio=" + tamanio + "]";
    }

    
    
}
