package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio = radio;
    }//cierra constructor

    public double getRadio(){
        return this.radio;
    }//cierra getRadio

    public void setRadio(double radio){
        this.radio = radio;
    }//cierra setRadio

    public double obtenerArea(){
        return Math.PI * (getRadio()*getRadio());
    }//cierra obtenerArea

    public double obtenerPerimetro(){
        return 2*Math.PI*getRadio();
    }//cierra obtenerPerimetro

}//cierra class
