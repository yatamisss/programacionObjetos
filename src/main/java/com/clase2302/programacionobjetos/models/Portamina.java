package com.clase2302.programacionobjetos.models;

public class Portamina extends Lapiz {

    public Boolean boton;
    public Boolean goma;

    public Portamina() {
        super();
    }

    public Portamina(String material, String tinta, Double tamaño, Boolean boton, Boolean goma) {
        super(material, tinta, tamaño);
        this.boton = boton;
        this.goma = goma;
    }

    public Boolean getBoton() {
        return boton;
    }

    public void setBoton(Boolean boton) {
        this.boton = boton;
    }

    public Boolean getGoma() {
        return goma;
    }

    public void setGoma(Boolean goma) {
        this.goma = goma;
    }


    public void boton (boolean botoncito){
        if(botoncito == true){
            System.out.println("presiona el boton para sacar mas mina");
        }else{
            System.out.println("no tiene boton, asi que no se que lapiz mina tienes xd");
        }
    }

    public void goma (boolean gomita){
        if (gomita == true){
            System.out.println("borra todo lo que quieras");
        }else{
            System.out.println("no incluyo goma :( )");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "Portamina [boton=" + boton + ", goma=" + goma + "]";
    }

  
    }

    

    

   


    

