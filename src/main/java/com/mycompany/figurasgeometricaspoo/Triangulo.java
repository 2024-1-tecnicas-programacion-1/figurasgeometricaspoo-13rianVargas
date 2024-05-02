package com.mycompany.figurasgeometricaspoo;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }//cierra constructor

    public double obtenerArea(){
        return (base * altura)/2;
    }//cierra obtenerArea

    public double obtenerPerimetro(){
        double hip = Math.sqrt(base/2) + Math.sqrt(altura);
        double iso = base + hip + hip;
        double rec = base + altura+ hip;

        return "Isósceles: " + iso + " Rectángulo: " + rec;
    }//cierra obtenerPerimetro

}//cierra class
