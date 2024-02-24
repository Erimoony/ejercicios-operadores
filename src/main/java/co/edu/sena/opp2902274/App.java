package co.edu.sena.opp2902274;
import java.util.Scanner;
public class App 
{
    //Área de un triángulo"
    public static void main( String[] args )
    {
        // entrada
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("Ingrese la base del triángulo: ");


        Scanner src= new Scanner(System.in);
        double base =src.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo");
        double height = src.nextDouble();


        //proceso 
        double result =(base * height)/2;


        //salida
        System.out.println( "El área del triangulo es:" + result);

         //Suma de dos número
        // entrada
        System.out.println("2. Ingresar dos numeros por teclado y sumarlos");
        System.out.println("Ingrese el primer número: ");


        Scanner sum= new Scanner(System.in);
        int n1 =src.nextInt();
        
        System.out.println("Ingrese el segundo número");
        int n2 = src.nextInt();


        //proceso 
        int suma =(n1 + n2);


        //salida
        System.out.println( "La suma de estos numeros es: " + suma);

        //número elevado
        // entrada
        System.out.println("3. Ingresar un número y visualizar el número elevado al cuadrado");
        System.out.println("Ingrese el número: ");


        Scanner ele= new Scanner(System.in);
        int no1 =src.nextInt();
        
         //proceso 
        int elev =(no1 + no1);


        //salida
        System.out.println( "El número elevado al cuadrado es: " + elev);
    }




   
}
