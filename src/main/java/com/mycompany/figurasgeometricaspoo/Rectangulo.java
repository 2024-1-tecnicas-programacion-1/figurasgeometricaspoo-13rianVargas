package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color, double lado1, double lado2){
        super(nombre,color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }//cierra constructor

    public double getLado1(){
        return this.lado1;
    }//cierra getLado1

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }//cierra setLado1

    public double getLado2(){
        return this.lado2;
    }//cierra getLado2

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }//cierra setLado2

    public double obtenerArea(){
        return getLado1() * getLado2();
    }//cierra obtenerArea

    public double obtenerPerimetro(){
        return (getLado1()*2)+(getLado2()*2);
    }//cierra obtenerPerimetro

}//cierra class
