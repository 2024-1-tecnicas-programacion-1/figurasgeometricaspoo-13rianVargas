package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {
    private String nombre;
    private String color;

    FiguraGeometrica (String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }//cierra constructor

    public double obtenerArea(){
        
        return 0;
    }//cierra obtenerArea

    public double obtenerPerimetro(){
        
        return 0;
    }//cierra obtenerPerimetro

    public String getNombre(){
        return this.nombre;
    }//cierra getNombre

    public String getColor(){
        return this.color;
    }//cierra getColor

    public void setNombre(String nombre){
        this.nombre = nombre;
    }//cierra setNombre

    public void setColor(String color){
        this.color = color;
    }//cierra setColor

}//cierra class
