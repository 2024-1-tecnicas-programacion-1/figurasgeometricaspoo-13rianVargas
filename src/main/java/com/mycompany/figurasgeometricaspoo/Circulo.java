package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }//cierra constructor

    public double obtenerArea(){
        return Math.PI * (radio*radio);
    }//cierra obtenerArea

    public double obtenerPerimetro(){
        return 2*Math.PI*radio;
    }//cierra obtenerPerimetro

}//cierra class
