import java.util.ArrayList;
import java.util.List;

/*
    - estudiante con rut, nombre y edad
    - contiene una lista de asignaturas del estudiante
    - tambien expone metodos estáticos para el CRUD simple en memoria
 */
public class Estudiante {
    //campos privados: datos del estudiante
    String rut;           //Rut del estudiante
    String nombre;       //nombre del estudiante
    int edad;           //edad del estudiante
    // atributos del estudiante

    //lista de las asignaturas que tendrá
    private List<Asignatura> asignaturas = new ArrayList<>();

    //"base de datos" simple memoria, compartida por todos (lista estatica) lista de estudiantes
    private static List<Estudiante> lista = new ArrayList<>();

    //------------------------Constructor----------------------------
    public Estudiante(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }
    //----------------------------
    // Getters and Setters basicos
    //----------------------------
    public String getRut() {return rut;}

    public void setRut(String rut) {this.rut = rut;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public List<Asignatura> getAsignaturas() {return asignaturas;}

    //------------------REGISTRAR ESTUDIANTES-----------------

    public static boolean registrarEstudiante(String rut, String nombre, int edad){
        if (rut == null || rut.trim().isEmpty()) return false;
        if (nombre == null || nombre.trim().isEmpty()) return false;
        if (edad < 15) return false;
        //Para evitar Duplicados
        if (consultarEstudiante(rut) != null) return false;
        //agregar a lista "base de datos" a los estudiantes
        lista.add(new Estudiante(rut.trim(),nombre.trim(),edad));
        return true;
    }
    //consultar estudiantes: busca por rut en la lista estatica
    public static Estudiante consultarEstudiante(String rut){
        if (rut == null) return null;

        for (Estudiante e: lista){
            if (e.getRut() != null && e.getRut().equals(rut)){
                return e;
            }
        }
        return null;
    }
    public static boolean eliminarEstudiante(String rut){
        if (rut == null) return false;
        for (int i = 0; i < lista.size(); i++){
            Estudiante e = lista.get(i);
            if (e.getRut() != null && e.getRut().equals(rut)){
                lista.remove(i),
                return true;
            }
        }
        return false;
    }
    public static List<Estudiante> listarEstudiantes(){
        return lista;
    }
    public boolean agregarAsignatura(Asignatura a){
        if(a == null || a.getCodigo() == null ) return false;
    }


}

