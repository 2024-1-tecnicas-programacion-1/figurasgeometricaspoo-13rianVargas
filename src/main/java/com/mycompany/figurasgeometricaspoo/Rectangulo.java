package com.mycompany.figurasgeometricaspoo;

public class Rectangulo {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }//cierra constructor

    public double obtenerArea(){
        return lado1 * lado2;
    }//cierra obtenerArea

    public double obtenerPerimetro(){
        return (lado1*2)+(lado2*2);
    }//cierra obtenerPerimetro

}//cierra class
