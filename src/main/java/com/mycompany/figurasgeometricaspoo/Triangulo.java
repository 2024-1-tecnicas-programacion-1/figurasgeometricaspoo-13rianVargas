package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura){
        super (nombre, color);
        this.base = base;
        this.altura = altura;
    }//cierra constructor

    public double getBase(){
        return this.base;
    }//cierra getBase

    public void setBase(double base){
        this.base = base;
    }//cierra setBase

    public double getAltura(){
        return this.altura;
    }//cierra getAltura

    public void setAltura(double altura){
        this.altura = altura;
    }//cierra setAltura

    // Métodos //

    public double obtenerArea(){
        return (getBase() * getAltura())/2;
    }//cierra obtenerArea

    public double obtenerPerimetro(){
        double hip = Math.sqrt(getBase()/2) + Math.sqrt(getAltura());

        double rec = getBase() + getAltura()+ hip;

        /*double iso = base + hip + hip;
        
        String msg = "Isósceles: " + String.valueOf(iso) + " Rectángulo: " + String.valueOf(rec);*/

        return rec;
    }//cierra obtenerPerimetro

}//cierra class
