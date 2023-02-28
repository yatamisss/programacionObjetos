package com.clase2302.programacionobjetos.models;

public class Plumon extends Lapiz{
    public String tapa;
    public Boolean puntaGruesa;
    
    public Plumon() {
    }


    public Plumon(String material, String tinta, Double tamanio, String tapa, Boolean puntaGruesa) {
        super(material, tinta, tamanio);
        this.tapa = tapa;
        this.puntaGruesa = puntaGruesa;
    }


    public String getTapa() {
        return tapa;
    }


    public void setTapa(String tapa) {
        this.tapa = tapa;
    }


    public Boolean getPuntaGruesa() {
        return puntaGruesa;
    }


    public void setPuntaGruesa(Boolean puntaGruesa) {
        this.puntaGruesa = puntaGruesa;
    }

    public void tapa(){
            System.out.println("tu plumon tiene tapita");
    }

    public void puntaGruesa (Boolean punta){
        if (punta == true){
            System.out.println("tu plumon tiene la punta gruesa");
        }else{
            System.out.println("tu plumon tiene la punta fina");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Plumon [tapa=" + tapa + ", puntaGruesa=" + puntaGruesa + "]";
    } 

    

    
}
