import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;
import java.util.Scanner;

public class Joyeria {
    //Scanner para leer del teclado
    private final Scanner sc = new Scanner(System.in);

    //Almacen para joyas (Cadenas y anillos)
    private final ArrayList<Joya> inventario = new ArrayList<>();

    public static void main(String[] args) {
        //applicaciones para ejecutar

        new Joyeria.run();
    }

    private void run() {
        while (true) {
            System.out.println("=== Sistema Joyerias Glamour");
            System.out.println("1 - Registrar Joyas");
            System.out.println("2 - Consultar Joyas");
            System.out.println("3 - Listar todas Joyas");
            System.out.println("0 - Salir");
            System.out.println("Seleccione una opcion");
            int op = leerEnteroLibre();
            if (op == 0) {
                System.out.println("Hasta luego....");
            }
        }
        //comienza comparacion
        if (op == 1) registrarJoya();
        else if (op == 2) consultarJoya();
        else if (op == 3) listarJoyas();
        else System.out.println("Opcion no valida");
    }
    private void registrarJoya(){
        System.out.println("\n----- Registrar Joya -----");
        System.out.println("Seleccione tipo de joya");
        System.out.println("1 - Cadena");
        System.out.println("2 - Anillo");
        System.out.println("Seleccione una opcion");
        int tipo = leerEnteroLibre();

        //datps comunes de joya
        System.out.println("Codigos: ");
        String codigo = sc.nextLine().trim();

        System.out.println("Nombre: ");
        String nombre = sc.nextLine().trim();

        System.out.println("Material");
        String Material = sc.nextLine().trim();

        //segun la eleccion pedimos los datos especificos

        if (tipo == 1){

        }else if (tipo == 2){

        }else {

        }

    }



}