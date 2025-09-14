package registroinstituto.Islas;
import java.util.Scanner;

public class IslasMenuWhile {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //lector de teclado
        int opcion = -1; //comienza cicclo while distinto de 0
        
        while (opcion!=0 ){
            System.out.println("MENU SIMPLE");
            System.out.println("1. Opcion A");
            System.out.println("2. Opcion B");
            System.out.println("0. Salir");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 1){
                System.out.println("Elegiste opcion A");
            }else if (opcion == 2){
                System.out.println("Elegiste opcion B");
                
            }else if(opcion == 3){
                System.out.println("Saliendo del Menu....");
            } else{
                System.out.println("Opciion no valida");
            }
            System.out.println(); //linea en blanco
        }
        System.out.println("Fin del programa");
    }   
}