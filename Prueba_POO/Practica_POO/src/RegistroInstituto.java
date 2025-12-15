import java.time.LocalTime;
import  java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RegistroInstituto {
    private java.util.Scanner sc = new Scanner(System.in);

    private Estudiante estudiante_var;
    private Asignatura asignatura_var;
    private Docente docente_var;
    private  Sede sede_var;

    public static void main(String[] args) {
        //logica de la "app"
        RegistroInstituto menuPrincipal = new RegistroInstituto();
        menuPrincipal.ejecutar();
    }

    private void ejecutar(){
        int opcionMenu;
        do {
            System.out.println(" ");
            System.out.println("======Menu=====");
            System.out.println("[1] - Registrar Sede");
            System.out.println("[2] -  Registrar Estudiante");
            System.out.println("[3] - Registra docente");
            System.out.println("4. Registrar Asignatura (asociar estudiante y docente)");
            System.out.println("5. Ingresar/Actualizar Notas (N1, N2, N3)");
            System.out.println("6. Calcular Nota de Presentacion");
            System.out.println("7. Registrar Examen y Calcular Nota Final");
            System.out.println("8. Ver Asignatura con detalle");
            System.out.println("0. Salir");
            System.out.println("Seleccione opcion:");
            opcionMenu = leerEnteroLibre();//Hacer despues al igual que la opcion ejecutar la hicimos antes

            if (opcionMenu == 1) registrarSede();
            //else if (opcionMenu == 2) registrarEstudiante();
            //else if (opcionMenu == 3) registrarDocente();
            //else if (opcionMenu == 4) registrarAsignatura();
            //else if (opcionMenu == 5) ingresarNotas();
            //else if (opcionMenu == 6) calcularPresentacion();
            //else if (opcionMenu == 7) registrarExamenYCalcular();
            //else if (opcionMenu == 8) verAsignatura();
        }while (opcionMenu !=0);
        System.out.println("Hasta luego");
    }

    private int leerEnteroLibre(){
        System.out.println("Ingrese numero entero");
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public String leerNoVacio(String prompt){
        String textoIngresado;
        do {
            System.out.println(prompt);
            textoIngresado = sc.nextLine();
            if (textoIngresado != null)
                textoIngresado = textoIngresado.trim();
        }while (textoIngresado == null || textoIngresado.isEmpty());
        return textoIngresado;
    }

    private void registrarSede(){
        System.out.println("---Registrar Sede---");
        System.out.println("Numero de sede (entero)");
        int numeroSedeIngresado = leerEnteroLibre();
        String nombreSedeIngresasdo = leerNoVacio("Nombre de sede");
        String comunaIngresada = leerNoVacio("Comuna: ");
        sede_var = new Sede(numeroSedeIngresado, nombreSedeIngresasdo, comunaIngresada);
        System.out.println("OK: "+ sede_var);
    }

}