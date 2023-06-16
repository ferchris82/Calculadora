
import java.util.Scanner;


public class Calculator {
    
    public static void main(String[] args) {
        
        int numUno = 0;
        int numDos = 0;
        int operacion = 0;
        
        System.out.println("Dame el primer valor:");
        Scanner sc1 = new Scanner(System.in);
        numUno = sc1.nextInt();
        
        System.out.println("Dame el segundo valor:");
        Scanner sc2 = new Scanner(System.in);
        numDos = sc2.nextInt();
        
        System.out.println("¿Que operación deseas realizar?. ");
        System.out.println("-----1. Para Suma----------------");
        System.out.println("-----2. Para Resta---------------");
        System.out.println("-----3. Para Multiplicación------");
        System.out.println("-----4. Para Division------------");
        
        Scanner sc3 = new Scanner(System.in);
        operacion = sc3.nextInt();
        
        if (operacion == 1) {
            System.out.println("La suma de los valores es: " + (numUno + numDos));
        }else if(operacion == 2){
            System.out.println("La resta de los valores es: " + (numUno - numDos));
        }else if(operacion == 3){
            System.out.println("La multiplicacion de los valores es: " + (numUno * numDos));
        }else if(operacion == 4){
            System.out.println("La division de los valores es: " + (numUno / numDos));
        }else{
            System.out.println("Lo siento, tu número para realizar la operacion no es valido");
        }
    }
}
