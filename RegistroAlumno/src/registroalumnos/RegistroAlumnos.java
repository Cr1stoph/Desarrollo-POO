/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroalumnos;

import java.util.List;

/**
 *
 * @author Erwin
 */
public class RegistroAlumnos {
    // Scanner para leer entradas desde teclado
    private final java.util.Scanner sc = new java.util.Scanner(System.in);

    // Metodo main: punto de entrada del programa
    public static void main(String[] args) {
        new RegistroAlumnos().run(); // creamos la app y ejecutamos el menu
    }

    // run: ciclo principal del menu
    private void run() {
        while (true) { // ciclo infinito, se sale con opcion 0
            System.out.println();
            System.out.println("=== REGISTRO DE ESTUDIANTES (simple) ===");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Consultar estudiante por RUT");
            System.out.println("3. Eliminar estudiante por RUT");
            System.out.println("4. Registrar asignatura a estudiante");
            System.out.println("5. Ingresar o editar notas de una asignatura");
            System.out.println("6. Consultar asignatura de un estudiante");
            System.out.println("7. Listar asignaturas de un estudiante");
            System.out.println("8. Listar todos los estudiantes");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");               // pedimos opcion
            int op = leerEnteroLibre();                 // leemos entero sin rango
            if (op == 0) {                              // si es 0, terminar
                System.out.println("Adios!");
                return;
            }

            // segun la opcion, llamamos a un metodo
            if (op == 1) opcionRegistrarEstudiante();
            else if (op == 2) opcionConsultarEstudiante();
            else if (op == 3) opcionEliminarEstudiante();
            //else if (op == 4) opcionRegistrarAsignatura();
            //else if (op == 5) opcionIngresarNotas();
            //else if (op == 6) opcionConsultarAsignatura();
            //else if (op == 7) opcionListarAsignaturasDeEstudiante();
            else if (op == 8) opcionListarEstudiantes();
            else System.out.println("Opcion invalida.");
        }
    }

    // --- Opciones del menu ---

    // Registrar un estudiante usando el metodo estatico de Estudiante
    private void opcionRegistrarEstudiante() {
        System.out.println("--- Registrar estudiante ---");
        String rut = leerNoVacio("RUT: ");                            // pedimos rut
        String nombre = leerNoVacio("Nombre: ");                      // pedimos nombre
        int edad = leerEntero("Edad (>= 10 y < 120): ", 10, 119);     // pedimos edad en rango
        boolean ok = Alumno.registrarAlumno(rut, nombre, edad); // llamamos al CRUD
        if (ok) System.out.println("OK: Estudiante registrado.");
        else System.out.println("No se pudo registrar (RUT duplicado o datos invalidos).");
    }

    // Consultar estudiante mostrando sus datos basicos
    private void opcionConsultarEstudiante() {
        System.out.println("--- Consultar estudiante ---");
        String rut = leerNoVacio("RUT: ");
        Alumno e = Alumno.consultarAlumno(rut);           // buscamos por rut
        if (e == null) {
            System.out.println("No encontrado.");
            return;
        }
        System.out.println("Datos: " + e.toString());                 // imprimimos toString
       // if (e.getAsignaturas().isEmpty()) System.out.println("Sin asignaturas todavia.");
    }

    // Eliminar estudiante por rut
    private void opcionEliminarEstudiante() {
        System.out.println("--- Eliminar estudiante ---");
        String rut = leerNoVacio("RUT: ");
        boolean ok = Alumno.eliminarAlumno(rut);              // intentamos eliminar
        System.out.println(ok ? "Eliminado." : "No encontrado.");
    }

   
    // Listar todos los estudiantes registrados
    private void opcionListarEstudiantes() {
        System.out.println("--- Listado de estudiantes ---");
        List<Alumno> lista = Alumno.listarAlumnos();      // obtenemos la lista estatica
        if (lista.isEmpty()) { System.out.println("Sin estudiantes."); return; }
        // Recorremos y mostramos cada estudiante
        for (Alumno e : lista) {
            System.out.println(e.toString());
        }
    }

    // ---------------------------------
    // Lecturas y validaciones simples
    // ---------------------------------

    // leerNoVacio: pide una linea de texto que no sea vacia
    private String leerNoVacio(String prompt) {
        while (true) {                                // repetimos hasta que sea valido
            System.out.print(prompt);                 // mostramos el mensaje
            String s = sc.nextLine();                 // leemos una linea del teclado
            if (s != null) s = s.trim();              // quitamos espacios
            if (s != null && !s.isEmpty()) return s;  // si no esta vacio, devolvemos
            System.out.println("El valor no puede estar vacio.");
        }
    }

    // leerEntero: pide un entero dentro de un rango [minIncl, maxIncl]
    private int leerEntero(String prompt, int minIncl, int maxIncl) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();          // leemos texto
            try {
                int v = Integer.parseInt(s);          // convertimos a entero
                if (v < minIncl || v > maxIncl) {     // validamos rango
                    System.out.println("Fuera de rango (" + minIncl + " - " + maxIncl + ").");
                } else {
                    return v;                         // valido, devolvemos
                }
            } catch (NumberFormatException e) {       // si no se puede convertir
                System.out.println("Ingrese un numero entero valido.");
            }
        }
    } 

    // leerEnteroLibre: pide un entero sin rango, reintenta si hay error
    private int leerEnteroLibre() {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);           // intentamos convertir
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero entero valido: ");
            }
        }
    } 
    
}
