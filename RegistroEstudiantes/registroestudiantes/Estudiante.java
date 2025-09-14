package registroestudiantes;

// Importamos utilidades de lista
import java.util.ArrayList;
import java.util.List;

/*
 Clase Estudiante
 - Representa a un estudiante con rut, nombre y edad
 - Contiene una lista de asignaturas del propio estudiante
 - Tambien expone metodos estaticos para un CRUD simple en memoria
*/
public class Estudiante {
    // Campos privados: datos del estudiante
    private String rut;                 // rut del estudiante
    private String nombre;              // nombre del estudiante
    private int edad;                   // edad del estudiante

    // Lista de asignaturas que tiene este estudiante
    private List<Asignatura> asignaturas = new ArrayList<>();

    // "Base de datos" simple en memoria, compartida por todos (lista estatica)
    private static List<Estudiante> lista = new ArrayList<>();

    // Constructor: crea un estudiante con sus datos basicos
    public Estudiante(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    // ------------------------
    // Getters y setters basicos
    // ------------------------

    public String getRut() {            // devuelve el rut
        return rut;
    }

    public void setRut(String rut) {    // cambia el rut
        this.rut = rut;
    }

    public String getNombre() {         // devuelve el nombre
        return nombre;
    }

    public void setNombre(String nombre) {  // cambia el nombre
        this.nombre = nombre;
    }

    public int getEdad() {              // devuelve la edad
        return edad;
    }

    public void setEdad(int edad) {     // cambia la edad
        this.edad = edad;
    }

    public List<Asignatura> getAsignaturas() { // devuelve la lista de asignaturas del estudiante
        return asignaturas;
    }

    // ------------------------------------------------------
    // Metodos requeridos (estaticos) para CRUD de estudiantes
    // ------------------------------------------------------

    // registrarEstudiante: crea y guarda un estudiante en la lista estatica si el rut no se repite
    public static boolean registrarEstudiante(String rut, String nombre, int edad) {
        // Validaciones simples de entrada
        if (rut == null || rut.trim().isEmpty()) return false;
        if (nombre == null || nombre.trim().isEmpty()) return false;
        if (edad < 1) return false;

        // Evitar duplicados por rut
        if (consultarEstudiante(rut) != null) return false;

        // Agregar a la "base de datos" en memoria
        lista.add(new Estudiante(rut.trim(), nombre.trim(), edad));
        return true;
    }

    // consultarEstudiante: busca por rut en la lista estatica
    public static Estudiante consultarEstudiante(String rut) {
        if (rut == null) return null;
        for (Estudiante e : lista) {                    // recorremos la lista con un for
            if (e.getRut() != null && e.getRut().equals(rut)) {
                return e;                               // si coincide el rut, retornamos
            }
        }
        return null;                                    // si no se encuentra, retornamos null
    }

    // eliminarEstudiante: elimina por rut en la lista estatica
    public static boolean eliminarEstudiante(String rut) {
        if (rut == null) return false;
        for (int i = 0; i < lista.size(); i++) {        // for clasico por indice
            Estudiante e = lista.get(i);
            if (e.getRut() != null && e.getRut().equals(rut)) {
                lista.remove(i);                        // eliminamos por posicion
                return true;                            // exito
            }
        }
        return false;                                    // no se encontro
    }

    // listarEstudiantes: devuelve la lista completa (solo referencia, simple para este ejemplo)
    public static List<Estudiante> listarEstudiantes() {
        return lista;
    }

    // ------------------------------------------------------
    // Metodos de apoyo (de instancia) para asignaturas
    // ------------------------------------------------------

    // agregarAsignatura: agrega una asignatura al estudiante si el codigo no existe todavia
    public boolean agregarAsignatura(Asignatura a) {
        if (a == null || a.getCodigo() == null) return false;
        for (Asignatura x : asignaturas) {              // recorremos asignaturas actuales
            if (a.getCodigo().equals(x.getCodigo())) {  // si el codigo ya existe
                return false;                           // no agregar duplicado
            }
        }
        asignaturas.add(a);                             // si no existe, agregamos
        return true;
    }

    // buscarAsignatura: devuelve la asignatura con el codigo indicado (o null si no existe)
    public Asignatura buscarAsignatura(String codigo) {
        for (Asignatura a : asignaturas) {              // recorremos la lista
            if (a.getCodigo() != null && a.getCodigo().equals(codigo)) {
                return a;                               // encontramos y retornamos
            }
        }
        return null;                                    // no encontrada
    }

    // eliminarAsignatura: elimina la asignatura por codigo
    public boolean eliminarAsignatura(String codigo) {
        for (int i = 0; i < asignaturas.size(); i++) {  // for por indice
            Asignatura a = asignaturas.get(i);
            if (a.getCodigo() != null && a.getCodigo().equals(codigo)) {
                asignaturas.remove(i);                  // eliminamos por posicion
                return true;
            }
        }
        return false;
    }

    // toString: representacion simple de un estudiante al imprimirlo
    @Override
    public String toString() {
        return rut + " - " + nombre + " (edad " + edad + ")";
    }
}
