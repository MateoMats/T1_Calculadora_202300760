package t1_calculadora_202300760;
import java.util.Scanner;

public class T1_Calculadora_202300760 {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        byte opcion;
        
        //Menu de seleccion al usuario
        do{
            
        System.out.println("Seleccione la operacion a realizar");
        System.out.println(" 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division \n 5.Tablas de multiplicar \n 6.Salir \n" );
        opcion = scanner.nextByte();
    
        //Declaracion de operadores 
        double suma, resta, multiplicacion;
        
        switch (opcion){
            case 1:
                
            System.out.println("Ingrese el primer sumando: ");
            double suman1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo sumando: ");
            double suman2 = scanner.nextDouble();
            suma = (suman1+suman2);
            System.out.println("El total de la suma es: "+suma+"\n");
            break;
            
            case 2:
                
                System.out.println("Ingrese el minuendo: ");
                double min = scanner.nextDouble();
                System.out.println("Ingrese el sustraendo: ");
                double sust = scanner.nextDouble();
                resta = (min-sust);
                System.out.println("La diferencia de la resta es: "+resta+"\n");
                break;
                
            case 3:
                
                System.out.println("Ingrese el primer factor: ");
                double factor1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo factor: ");
                double factor2 = scanner.nextDouble();
                multiplicacion = (factor1*factor2);
                System.out.println("El producto de la multiplicacion es: "+multiplicacion+"\n");
                break;
                
            case 4:
                
                System.out.println("Ingrese el dividendo: ");
                long dividendo = scanner.nextLong();
                System.out.println("Ingrese el divisor: ");
                long divisor = scanner.nextLong();
                
                if (divisor != 0){
                long cociente = (dividendo/divisor);
                long residuo = (dividendo%divisor);
                System.out.println("EL cociente de la division es: "+cociente+"\n");
                System.out.println("El residuo de la division es: "+residuo+"\n");
                }
                else{
                    System.out.println("El divisor no puede ser ser 0");
                            
                    }
                break;
                
            case 5:
                
                System.out.println("Ingrese el digito de la tabla a imprimir: ");
                long tabla = scanner.nextLong();
                
                long inicio, fin;
                
                do{
                System.out.println("Ingrese el inicio: ");
                inicio = scanner.nextLong();
                System.out.println("Ingrese el fin: ");
                fin = scanner.nextLong();
                
                if(inicio>fin){
                    System.out.println("Error de rango, ingrese nuevamente los datos");
                    
                }
             }
                
                while(inicio>fin);
                System.out.println("Tabla de multiplicar del " + tabla + " desde " + inicio + " hasta " + fin + ":");
                for(long i = inicio; i <= fin; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i)+"\n");
                }
                break;
                
            case 6:
                System.out.println("El usuario ha finalizado el programa desarrollado por: \nNombre: Mathew Daniel Palomo Carrillo\nCarnet: 202300760");
                break;

                default:
                System.out.println("Opcion no valida");
                break;
                
        }
        }while(opcion !=6);                     
    }
}
