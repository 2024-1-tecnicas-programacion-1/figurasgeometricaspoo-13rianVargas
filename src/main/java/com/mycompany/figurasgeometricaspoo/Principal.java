package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su figura:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el color de su figura:");
        String color = sc.nextLine();

        boolean validación = false;
        String figura = "";
        double radio, lado1, lado2, base, altura;
        
        while(validación == false){
            
            System.out.println("Ingrese el número del tipo de figura que desea usar:");
            System.out.println("    (1) : Círculo.");
            System.out.println("    (2) : Rectángulo.");
            System.out.println("    (3) : Triángulo.");

            int fig = sc.nextInt();
            
            switch (fig) {
                case 1:
                    figura = "Círculo";

                    System.out.println("Ingrese el radio del círculo.");
                    radio = sc.nextDouble();

                    Circulo circulo1 = new Circulo(nombre, color, radio);

                    System.out.println("El area del " + figura + " es: " + circulo1.obtenerArea());
                    System.out.println("El perimetro del " + figura + " es: " + circulo1.obtenerPerimetro());

                    validación = true;
                    break;

                case 2:
                    figura = "Rectángulo";

                    System.out.println("Ingrese el valor del lado 1 del rectángulo.");
                    lado1 = sc.nextDouble();
                    System.out.println("Ingrese el valor del lado 2 del rectángulo.");
                    lado2 = sc.nextDouble();

                    Rectangulo rectangulo1 = new Rectangulo(nombre, color, lado1, lado2);

                    System.out.println("El area del " + figura + " es: " + rectangulo1.obtenerArea());
                    System.out.println("El perimetro del " + figura + " es: " + rectangulo1.obtenerPerimetro());

                    validación = true;
                    break;

                case 3:
                    figura = "Triángulo";

                    System.out.println("Ingrese el valor de la base del triángulo.");
                    base = sc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del triángulo.");
                    altura = sc.nextDouble();

                    Triangulo triangulo1 = new Triangulo(nombre, color, base, altura);

                    System.out.println("El area del " + figura + " Rectangulo es: " + triangulo1.obtenerArea());
                    System.out.println("El perimetro del " + figura + " Rectangulo es: " + triangulo1.obtenerPerimetro());

                    validación = true;
                    break;
            
                default:
                System.out.println("No ingresó un número válido.");
                    break;
            }//cierra switch
        }//cierra while
        System.out.println("> > > FIN < < <");
        sc.close();
    }//cierra main
}//cierra class