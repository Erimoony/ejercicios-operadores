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
    


        //Conversión de euro a dolar
        // entrada
        System.out.println("4. Escribir un algoritmo que convierta euros a dólares");
        System.out.println("Ingrese el número a convertir: ");


        Scanner con= new Scanner(System.in);
        double e1 =src.nextDouble();


        //proceso 
        double conv =(e1 * 1.082);


        //salida
        System.out.println( "La conversión es: " + conv);

 //Área y perimetro de un cuadrado
        // entrada
        System.out.println("5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perimetro");
        System.out.println("Ingrese el valor: ");


        Scanner cua= new Scanner(System.in);
        int c1 =src.nextInt();


        //proceso 
        int peri =(c1 * 4);
        int are =(c1 * c1);


        //salida
        System.out.println( "El perimetro es : " + peri);
        System.out.println( "El área es : " + are);

        //Área y perimetro de un cuadrado
        // entrada
        System.out.println("6. Área y volumen de un cilindro");
        System.out.println("Ingrese el radio del cilindro: ");

        Scanner cil= new Scanner(System.in);
        int radio = src.nextInt();
        
        System.out.println("Ingrese la altura del cilindro: ");
        int alt = src.nextInt();
        //proceso 
        double total_area= 2 * Math.PI * radio * (radio + alt);
        double volume = Math.PI * Math.pow(radio, 2) * alt;

        //salida
        System.out.println("El área total es de: " + total_area + " y el volumen es de: " + volume);
//entrada
     System.out.println("7. Radio de una circunferencia");
       
        System.out.println("Ingrese el radio de la circunferencia: ");
        Scanner cir = new Scanner(System.in);
        int ra = src.nextInt();

        //proceso

        double length = 2 * Math.PI * radio;
        double area= Math.PI * Math.pow(ra, 2);

        //salida

        System.out.println("El radio de la circunferencia es de: " + ra + " la longitud es de " + length + " y el área es de " + area);
    
        //entrada
        System.out.println("8.Promedio de 3 números");

        System.out.println("Ingrese el primer número: ");
        Scanner pro = new Scanner(System.in);
        int num1 = src.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = src.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        int num3 = src.nextInt();

           //proceso

        int resulta = (num1 + num2 + num3)/3;

         //salida

        System.out.println("Sus 3 números fueron: " + num1 +", " + num2 +", " + num3 + " y el promedio es de: " + resulta);
    }  
}
