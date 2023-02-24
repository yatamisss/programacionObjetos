package com.clase2302.programacionobjetos.models;

public class Cuaderno {
    public Double tamanio;
    public Integer cantidadHojas;
    public String disenio;
    public String lomo;
    public String tipoHoja;


    public Cuaderno() {
    }


    public Cuaderno(Double tamanio, Integer cantidadHojas, String diseño, String lomo, String tipoHoja) {
        this.tamanio = tamanio;
        this.cantidadHojas = cantidadHojas;
        this.disenio = diseño;
        this.lomo = lomo;
        this.tipoHoja = tipoHoja;
    }

    

public Double getTamanio() {
        return tamanio;
    }


    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }


    public Integer getCantidadHojas() {
        return cantidadHojas;
    }


    public void setCantidadHojas(Integer cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }


    public String getDisenio() {
        return disenio;
    }


    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }


    public String getLomo() {
        return lomo;
    }


    public void setLomo(String lomo) {
        this.lomo = lomo;
    }


    public String getTipoHoja() {
        return tipoHoja;
    }


    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }


public void rayar(){
    System.out.println("tu cuaderno es apto para rayar");
}

public String pintar(boolean pintable){
    if (pintable == true){
        return ("tu cuaderno es apto para pintar");
    }else{
        return ("tu cuaderno no es para pintar");
    }
}


public void guardarInfo(){
    System.out.println("Estas agregando mas informacion a este cuaderno");
 
}

public void hacerAvioncitos(){
    System.out.println("tienes muchas hojas, asi que vo dale, haz un avioncito");
}

public String dibujar(boolean dibujo){
    if (dibujo == true){
        return ("Dibuja con confianza");
    }else{
        return ("No dibujes, este cuaderno no es para eso");
    }

}
}
