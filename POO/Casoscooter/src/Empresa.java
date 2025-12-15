package casoscooter;

import java.util.List;       // Interfaz de Java para listas
import java.util.ArrayList;  // Implementación concreta (lista por índice)

public class Empresa {

    // Atributos simples
    private String nombre;              // Nombre de la empresa
    private List<Empleado> empleados;   // Lista de empleados

    // Constructor: recibe el nombre de la empresa e inicia la lista vacía
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<Empleado>();
    }

    // Getter y Setter del nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Método: agregarEmpleado
     * Objetivo: agregar un empleado nuevo si es válido y no existe otro con el mismo RUT.
     * Retorna: true si lo agrega; false si es null, RUT null o duplicado.
     */
    public boolean agregarEmpleado(Empleado e) {
        // Validaciones básicas
        if (e == null) {
            return false;
        }
        if (e.getRut() == null) {
            return false;
        }
        // Evitar duplicados por RUT: si ya existe uno con mismo RUT, no agregar
        if (buscarEmpleado(e.getRut()) != null) {
            return false;
        }
        // Agregado correcto
        empleados.add(e);
        return true;
    }

    /*
     * Método: buscarEmpleado
     * Objetivo: devolver el Empleado cuyo RUT coincida (ignorando mayúsculas/minúsculas).
     * Retorna: el Empleado encontrado o null si no existe.
     */
    public Empleado buscarEmpleado(String rut) {
        if (rut == null) {
            return null;
        }
        // Recorrido clásico por la lista
        for (int i = 0; i < empleados.size(); i++) {
            Empleado e = empleados.get(i);
            // equalsIgnoreCase: compara Strings sin importar mayúsculas/minúsculas
            if (rut.equalsIgnoreCase(e.getRut())) {
                return e; // Si lo encuentra, termina y lo devuelve
            }
        }
        // Si se termina el ciclo sin encontrar, devolvemos null
        return null;
    }

    /*
     * Método: eliminarEmpleado
     * Objetivo: eliminar al Empleado cuyo RUT coincida.
     * Retorna: true si lo elimina; false si no lo encontró.
     */
    public boolean eliminarEmpleado(String rut) {
        if (rut == null) {
            return false;
        }
        // Recorremos por índice para poder eliminar por posición
        for (int i = 0; i < empleados.size(); i++) {
            Empleado e = empleados.get(i);
            if (rut.equalsIgnoreCase(e.getRut())) {
                empleados.remove(i); // elimina la posición i
                return true;
            }
        }
        return false;
    }

    /*
     * Método: listarEmpleados
     * Objetivo: mostrar por consola todos los empleados actuales.
     */
    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Empleados en " + nombre + ":");
            for (int i = 0; i < empleados.size(); i++) {
                Empleado e = empleados.get(i);
                System.out.println(" - " + e.toString());
            }
        }
    }

    /*
     * Método: cantidadEmpleados
     * Objetivo: retornar cuántos empleados hay actualmente en la lista.
     */
    public int cantidadEmpleados() {
        return empleados.size();
    }
}
