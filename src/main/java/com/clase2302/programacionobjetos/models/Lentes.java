package com.clase2302.programacionobjetos.models;

public class Lentes {
    public String tipoMarco;
    public String ColorMarco;
    public String TipoCristal;
    private Double GraduacionCristal;
    public String material;

    public Lentes() {
    }

    public Lentes(String tipoMarco, String colorMarco, String tipoCristal, Double graduacionCristal, String material) {
        this.tipoMarco = tipoMarco;
        ColorMarco = colorMarco;
        TipoCristal = tipoCristal;
        GraduacionCristal = graduacionCristal;
        this.material = material;
    }




    public String getTipoMarco() {
        return tipoMarco;
    }

    public void setTipoMarco(String tipoMarco) {
        this.tipoMarco = tipoMarco;
    }

    public String getColorMarco() {
        return ColorMarco;
    }

    public void setColorMarco(String colorMarco) {
        ColorMarco = colorMarco;
    }

    public String getTipoCristal() {
        return TipoCristal;
    }

    public void setTipoCristal(String tipoCristal) {
        TipoCristal = tipoCristal;
    }

    public Double getGraduacionCristal() {
        return GraduacionCristal;
    }

    public void setGraduacionCristal(Double graduacionCristal) {
        GraduacionCristal = graduacionCristal;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }



    public void verDeLejos (){
        System.out.println("con estos lentes puedes ver de lejos");
    }

    public void verDeCerca (){
        System.out.println("Con estos lentes puedes ver de cerca");
    }

    public String proteccionSolar ( boolean protSolar){
        if (protSolar == true){
            return ("sus lentes brindan proteccion solar");
        }else{
            return ("sus lentes no brindan proteccion solar");
        }
    }

    public void proteccionOcular(){
        System.out.println("Estos lentes/gafas brindan proteccion ocular");
    }

    public String correcciones (boolean corrije){
        if (corrije == true){
            return ("Sus lentes corrigen el estravismo");
        }else{
            return ("sus lentes corrigen el daltonismo");
        }
    }

}
