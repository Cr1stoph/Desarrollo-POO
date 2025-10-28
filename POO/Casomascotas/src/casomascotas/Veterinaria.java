package casomascotas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Veterinaria {
    private final Scanner sc = new Scanner(System.in);
    private static List<Mascota> nombres = new ArrayList<>();

    public static void main(String[] args) {
        Veterinaria menu = new Veterinaria();
        menu.ejecutar();
        
    }
    private void ejecutar(){
    int opcion;
        do {
            System.out.println("-------Menu Veterinaria--------");
            System.out.println("1 - Inigresar mascota");
            System.out.println("2 - Mostrar Mascota");
            System.out.println("3 - Eliminar Mascotas");
            System.out.println("4 - Mostrar todas las mascotas");
            System.out.println("0 - Salir");
            System.out.println("Elige una opcion");
            opcion = leerEnteroLibre();
            
            if (opcion == 1) ingresarMascota();
            else if (opcion == 2) mostrarMascota();
            else if (opcion ==3) eliminarMascota();
            else if(opcion ==4) mostrarTodasMascotas();
            
        } while (opcion != 0);
        System.out.println("Saliendo....");
    }
    private void ingresarMascota(){
        
    }
    
    
    
    private int leerEnteroLibre(){
        System.out.println("Ingrese un numero entero:");
        int numero = sc.nextInt();
        return numero;
    }

}
