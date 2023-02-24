package com.clase2302.programacionobjetos.models;

public class macetero {
    public Double tamaño;
    public String color;
    public String material; 
    public Integer hoyitos;
    public String forma;


    public macetero() {
    }  
    
public macetero(Double tamaño, String color, String material, Integer hoyitos, String forma) {
        this.tamaño = tamaño;
        this.color = color;
        this.material = material;
        this.hoyitos = hoyitos;
        this.forma = forma;
    }


public Double getTamaño() {
    return tamaño;
}

public void setTamaño(Double tamaño) {
    this.tamaño = tamaño;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getMaterial() {
    return material;
}

public void setMaterial(String material) {
    this.material = material;
}

public Integer getHoyitos() {
    return hoyitos;
}

public void setHoyitos(Integer hoyitos) {
    this.hoyitos = hoyitos;
}

public String getForma() {
    return forma;
}

public void setForma(String forma) {
    this.forma = forma;
}



public void guardarTierra(){
     System.out.println("El macetero tiene tierra");
}

public String plantar(Boolean plantita){
    if(plantita == true){
        return ("El macetero ya tiene una plantita");
    }else{
        return ("El macetero no tiene una plantita");
    }
}

public String contenerAgua(Boolean agua){
    if(agua == true){
        return ("tu plantita ya fue regada");
    }else{
        return ("A tu plantita le falta agua, por favor riegala");
    }
}

public String ponerAdornos(boolean adornos){
    if(adornos == true){
        return ("tu plantita ya esta adornada");
    }else{
        return ("adorna tu plantita, para mas glamour");
    }
}

public String decorar(boolean decoracion){
    if (decoracion == true){
        return ("tu macetero forma parte de la decoracion de tu hogar");
    }else{
        return ("tu macetero esta guardado, saca a lucir tu plantita");
    }

}
}