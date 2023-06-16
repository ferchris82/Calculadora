package calculadora;

import java.util.Scanner;

public class MainCalculadora {

    public static void main(String[] args) {

        //Instanciar objeto con constructor vacio
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Dame el valor numero uno");
        Scanner sc1 = new Scanner(System.in);
        calculadora.numUno = sc1.nextInt();

        System.out.println("Dame el valor numero dos");
        Scanner sc2 = new Scanner(System.in);
        calculadora.numDos = sc2.nextInt();

        System.out.println("¿Que operación deseas realizar?. ");
        System.out.println("-----1. Para Suma----------------");
        System.out.println("-----2. Para Resta---------------");
        System.out.println("-----3. Para Multiplicación------");
        System.out.println("-----4. Para Division------------");
        Scanner sc = new Scanner(System.in);
        calculadora.operacion = sc.nextInt();

        if (calculadora.operacion == 1) {
            System.out.println("La suma de los valores es: " + (calculadora.suma()));            
        } else if (calculadora.operacion == 2) {
            System.out.println("La resta de los valores es: " + (calculadora.resta()));
        } else if (calculadora.operacion == 3) {
            System.out.println("La multiplicacion de los valores es: " + (calculadora.multiplicacion()));
        } else if (calculadora.operacion == 4) {
            System.out.println("La division de los valores es: " + (calculadora.division()));
        } else {
            System.out.println("Lo siento, tu número para realizar la operacion no es valido");
        }

    }
}
