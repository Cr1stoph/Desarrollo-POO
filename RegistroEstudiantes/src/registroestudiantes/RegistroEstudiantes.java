package registroestudiantes;

// Importamos lista para mostrar estudiantes cuando sea necesario
import java.util.List;

/*
 Clase principal con menu
 - Todo el menu usa while, if y for simples
 - Llama a los metodos estaticos de Estudiante y Asignatura
*/
public class RegistroEstudiantes {
    // Scanner para leer entradas desde teclado
    private final java.util.Scanner sc = new java.util.Scanner(System.in);

    // Metodo main: punto de entrada del programa
    public static void main(String[] args) {
        new RegistroEstudiantes().run(); // creamos la app y ejecutamos el menu
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
            else if (op == 4) opcionRegistrarAsignatura();
            else if (op == 5) opcionIngresarNotas();
            else if (op == 6) opcionConsultarAsignatura();
            else if (op == 7) opcionListarAsignaturasDeEstudiante();
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
        boolean ok = Estudiante.registrarEstudiante(rut, nombre, edad); // llamamos al CRUD
        if (ok) System.out.println("OK: Estudiante registrado.");
        else System.out.println("No se pudo registrar (RUT duplicado o datos invalidos).");
    }

    // Consultar estudiante mostrando sus datos basicos
    private void opcionConsultarEstudiante() {
        System.out.println("--- Consultar estudiante ---");
        String rut = leerNoVacio("RUT: ");
        Estudiante e = Estudiante.consultarEstudiante(rut);           // buscamos por rut
        if (e == null) {
            System.out.println("No encontrado.");
            return;
        }
        System.out.println("Datos: " + e.toString());                 // imprimimos toString
        if (e.getAsignaturas().isEmpty()) System.out.println("Sin asignaturas todavia.");
    }

    // Eliminar estudiante por rut
    private void opcionEliminarEstudiante() {
        System.out.println("--- Eliminar estudiante ---");
        String rut = leerNoVacio("RUT: ");
        boolean ok = Estudiante.eliminarEstudiante(rut);              // intentamos eliminar
        System.out.println(ok ? "Eliminado." : "No encontrado.");
    }

    // Registrar una asignatura para un estudiante
    private void opcionRegistrarAsignatura() {
        System.out.println("--- Registrar asignatura a estudiante ---");
        String rut = leerNoVacio("RUT del estudiante: ");
        String codigo = leerNoVacio("Codigo de la asignatura: ");
        String nombre = leerNoVacio("Nombre de la asignatura: ");
        boolean ok = Asignatura.registrarAsignatura(rut, codigo, nombre); // llamamos al CRUD de Asignatura
        System.out.println(ok ? "Asignatura registrada." : "No se pudo registrar (verifique RUT o codigo).");
    }

    // Ingresar o editar notas para una asignatura
    private void opcionIngresarNotas() {
        System.out.println("--- Ingresar o editar notas ---");
        String rut = leerNoVacio("RUT del estudiante: ");
        String codigo = leerNoVacio("Codigo de la asignatura: ");
        double n1 = leerNota("Nota 1 (1.0 - 7.0): ");
        double n2 = leerNota("Nota 2 (1.0 - 7.0): ");
        double n3 = leerNota("Nota 3 (1.0 - 7.0): ");
        boolean ok = Asignatura.ingresarNotas(rut, codigo, n1, n2, n3);  // asignamos las notas
        System.out.println(ok ? "Notas actualizadas." : "No se pudo actualizar (verifique RUT o codigo).");
    }

    // Consultar una asignatura de un estudiante
    private void opcionConsultarAsignatura() {
        System.out.println("--- Consultar asignatura ---");
        String rut = leerNoVacio("RUT del estudiante: ");
        String codigo = leerNoVacio("Codigo de la asignatura: ");
        Asignatura a = Asignatura.consultarAsignatura(rut, codigo);   // buscamos la asignatura
        if (a == null) {
            System.out.println("No encontrada.");
            return;
        }
        // Mostramos datos y notas si existen
        System.out.print(a.toString());
        if (a.getNota1() != null) System.out.printf(" | N1: %.2f", a.getNota1());
        if (a.getNota2() != null) System.out.printf(" | N2: %.2f", a.getNota2());
        if (a.getNota3() != null) System.out.printf(" | N3: %.2f", a.getNota3());
        double p = a.promedio();
        if (!Double.isNaN(p)) System.out.printf(" | Prom: %.2f", p);
        System.out.println();
    }

    // Listar asignaturas de un estudiante
    private void opcionListarAsignaturasDeEstudiante() {
        System.out.println("--- Listar asignaturas de un estudiante ---");
        String rut = leerNoVacio("RUT del estudiante: ");
        Estudiante e = Estudiante.consultarEstudiante(rut);           // obtenemos el estudiante
        if (e == null) { System.out.println("Estudiante no encontrado."); return; }
        if (e.getAsignaturas().isEmpty()) {
            System.out.println("El estudiante no tiene asignaturas registradas.");
            return;
        }
        // Recorremos con un for mejorado y mostramos
        for (Asignatura a : e.getAsignaturas()) {
            System.out.print(a.toString());
            if (a.getNota1() != null) System.out.printf(" | N1: %.2f", a.getNota1());
            if (a.getNota2() != null) System.out.printf(" | N2: %.2f", a.getNota2());
            if (a.getNota3() != null) System.out.printf(" | N3: %.2f", a.getNota3());
            double p = a.promedio();
            if (!Double.isNaN(p)) System.out.printf(" | Prom: %.2f", p);
            System.out.println();
        }
    }

    // Listar todos los estudiantes registrados
    private void opcionListarEstudiantes() {
        System.out.println("--- Listado de estudiantes ---");
        List<Estudiante> lista = Estudiante.listarEstudiantes();      // obtenemos la lista estatica
        if (lista.isEmpty()) { System.out.println("Sin estudiantes."); return; }
        // Recorremos y mostramos cada estudiante
        for (Estudiante e : lista) {
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

    // leerNota: pide una nota double entre 1.0 y 7.0 (acepta coma y punto)
    private double leerNota(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim().replace(',', '.'); // reemplazamos coma por punto
            try {
                double n = Double.parseDouble(s);     // convertimos a double
                if (n < 1.0 || n > 7.0) {            // validamos rango
                    System.out.println("La nota debe estar entre 1.0 y 7.0.");
                } else {
                    return n;                         // valido
                }
            } catch (NumberFormatException e) {       // si no es numero
                System.out.println("Ingrese un numero valido (ej: 4.5).");
            }
        }
    }
}
