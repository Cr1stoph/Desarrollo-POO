/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroalumnos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erwin
 */
public class Alumno {
   // Campos privados: datos del estudiante
    private String rut;                 // rut del estudiante
    private String nombre;              // nombre del estudiante
    private int edad;                   // edad del estudiante

    // "Base de datos" simple en memoria, compartida por todos (lista estatica)
    private static List<Alumno> lista_alumnos = new ArrayList<>();


    // Constructor: crea un estudiante con sus datos basicos
    public Alumno(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    // ------------------------
    // Getters y setters basicos
    // ------------------------
    
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

     public static List<Alumno> getLista_alumnos() {
        return lista_alumnos;
    }

   
    public static void setLista_alumnos(List<Alumno> lista_alumnos) {
        Alumno.lista_alumnos = lista_alumnos;
    }

    // ------------------------------------------------------
    // Metodos requeridos (estaticos) para CRUD de estudiantes
    // ------------------------------------------------------
    // registrarEstudiante: crea y guarda un estudiante en la lista estatica si el rut no se repite
    public static boolean registrarAlumno(String rut, String nombre, int edad) {
        // Validaciones simples de entrada
        if (rut == null || rut.trim().isEmpty()) return false;
        if (nombre == null || nombre.trim().isEmpty()) return false;
        if (edad < 1) return false;

        // Evitar duplicados por rut
        if (consultarAlumno(rut) != null) return false;

        // Agregar a la "base de datos" en memoria
        lista_alumnos.add(new Alumno(rut.trim(), nombre.trim(), edad));
        return true;
    }

    // consultarEstudiante: busca por rut en la lista estatica
    public static Alumno consultarAlumno(String rut) {
        if (rut == null) return null;

        for (Alumno e : lista_alumnos) {                    // recorremos la lista con un for
            if (e.getRut() != null && e.getRut().equals(rut)) {
                return e;                               // si coincide el rut, retornamos
            }
        }
        return null;                                    // si no se encuentra, retornamos null
    }

    // eliminarEstudiante: elimina por rut en la lista estatica
    public static boolean eliminarAlumno(String rut) {
        if (rut == null) return false;

        for (int i = 0; i < lista_alumnos.size(); i++) {        // for clasico por indice
            Alumno e = lista_alumnos.get(i);

            if (e.getRut() != null && e.getRut().equals(rut)) {

                lista_alumnos.remove(i);                        // eliminamos por posicion
                return true;                            // exito
            }
        }
        return false;                                    // no se encontro
    }

    // listarEstudiantes: devuelve la lista completa (solo referencia, simple para este ejemplo)
    public static List<Alumno> listarAlumnos() {
        return lista_alumnos;
    }

    
    // toString: representacion simple de un estudiante al imprimirlo
    @Override
    public String toString() {
        return rut + " - " + nombre + " (edad " + edad + ")";
    }
}
