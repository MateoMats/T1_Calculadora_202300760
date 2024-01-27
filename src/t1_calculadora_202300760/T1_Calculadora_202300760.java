package t1_calculadora_202300760;
import java.util.Scanner;

public class T1_Calculadora_202300760 {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        //Menu de seleccion al usuario
        System.out.println("Seleccione la operacion a realizar");
        System.out.println(" 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division \n 5.Tablas de multiplicar \n 6.Salir \n" );
        byte opcion = scanner.nextByte();
        
        //Leer los digitos para las operaciones
        System.out.println("Ingrese dos digitos para realizar la operacion \nIngrese el primer digito");
        double d1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo digito");
        double d2 = scanner.nextDouble();
        
        //Declaracion de operadores 
        double suma, resta, multiplicacion, division;
        
        //Generacion de operaciones}
        suma = (d1+d2);
        resta = (d1-d2);
        multiplicacion = (d1*d2);
        division = (d1/d2);
        
        
        switch (opcion){
            case 1:
            System.out.println("El total de la suma es: "+suma);
            case 2:
                System.out.println("La diferencia de la resta es: "+resta);
            case 3:
                System.out.println("El producto de la multiplicacion es: "+multiplicacion);
            case 4:
                System.out.println("EL cociente de la resta es: "+division);
        }
    }
}
