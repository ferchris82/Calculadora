package calculadora;

public class Calculadora {

    //Atributos de la clase
    int numUno;
    int numDos;
    int operacion;

    //Constructor vacio
    public Calculadora() {
        System.out.println("Ejecutando constructor vacío");
    }
    
    public Calculadora(int numUno, int numDos){
        this.numUno = numUno;
        this.numDos = numDos;
        System.out.println("Ejecutando constructor con parametros");
    }
    
    //Metodos
    public int suma(){
       return numUno + numDos;
    }
    public int resta(){
       return numUno - numDos;
    }
    public int multiplicacion(){
       return numUno * numDos;
    }
    public int division(){
       return numUno / numDos;
    }
    
    
}
