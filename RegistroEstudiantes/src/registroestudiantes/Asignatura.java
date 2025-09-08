package registroestudiantes;

/*
 Clase Asignatura
 - Representa una asignatura con codigo, nombre y 3 notas
 - Incluye metodos estaticos para operar sobre las asignaturas de un estudiante
*/
public class Asignatura {
    // Campos privados de la asignatura
    private String codigo;     // codigo unico de la asignatura
    private String nombre;     // nombre de la asignatura

    // Notas (Double para permitir "sin nota" con valor null)
    private Double nota1;
    private Double nota2;
    private Double nota3;

    // Constructor: crea una asignatura con su codigo y nombre
    public Asignatura(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters y setters basicos
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getNota1() { return nota1; }
    public Double getNota2() { return nota2; }
    public Double getNota3() { return nota3; }

    // setNotas: asigna las 3 notas de una vez
    public void setNotas(double n1, double n2, double n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    // promedio: calcula el promedio simple de las 3 notas
    // Si falta alguna nota (null), retorna NaN para indicar que no hay promedio valido
    public double promedio() {
        if (nota1 == null || nota2 == null || nota3 == null) return Double.NaN;
        return (nota1 + nota2 + nota3) / 3.0;
    }

    // ------------------------------
    // Metodos estaticos requeridos
    // ------------------------------

    // registrarAsignatura: registra una asignatura en un estudiante (usando el rut del estudiante)
    public static boolean registrarAsignatura(String rutEstudiante, String codigo, String nombre) {
        // buscamos el estudiante por rut
        Estudiante e = Estudiante.consultarEstudiante(rutEstudiante);
        if (e == null) return false;                    // si no existe el estudiante, no se puede
        if (codigo == null || codigo.trim().isEmpty()) return false;
        if (nombre == null || nombre.trim().isEmpty()) return false;

        // evitar duplicados por codigo dentro del mismo estudiante
        if (e.buscarAsignatura(codigo) != null) return false;

        // agregar al estudiante
        return e.agregarAsignatura(new Asignatura(codigo.trim(), nombre.trim()));
    }

    // consultarAsignatura: obtiene la asignatura de un estudiante por codigo
    public static Asignatura consultarAsignatura(String rutEstudiante, String codigo) {
        Estudiante e = Estudiante.consultarEstudiante(rutEstudiante);
        if (e == null) return null;                     // estudiante no existe
        return e.buscarAsignatura(codigo);              // retorna la asignatura o null
    }

    // eliminarAsignatura: elimina la asignatura de un estudiante por codigo
    public static boolean eliminarAsignatura(String rutEstudiante, String codigo) {
        Estudiante e = Estudiante.consultarEstudiante(rutEstudiante);
        if (e == null) return false;                    // estudiante no existe
        return e.eliminarAsignatura(codigo);            // intenta eliminar y retorna true/false
    }

    // ingresarNotas: asigna notas a la asignatura de un estudiante
    public static boolean ingresarNotas(String rutEstudiante, String codigo, double n1, double n2, double n3) {
        Estudiante e = Estudiante.consultarEstudiante(rutEstudiante);
        if (e == null) return false;                    // estudiante no existe
        Asignatura a = e.buscarAsignatura(codigo);
        if (a == null) return false;                    // asignatura no existe
        a.setNotas(n1, n2, n3);                         // seteamos las notas
        return true;
    }

    // toString: representacion simple de una asignatura
    @Override
    public String toString() {
        return "[" + codigo + "] " + nombre;
    }
}
