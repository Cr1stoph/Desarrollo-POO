package tallermecanico;

public class Mecanico {
    //atributios
    public String nombre; //publico para acceso directo
    public String especialidad;//"motor", "frenos", "general"
    public int nivel;//1(junior), 2(semi-senior),3(senior)
    //constructor
    public Mecanico(String nombre, String especialidad, int nivel) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.nivel = nivel;
    }
    //geter and setter & mutadores
    //get simples sin return, solo muestra el dato
    public void getNombre() {
        System.out.println("Nombre: " + nombre);
    }


    public void getEspecialidad() {
        System.out.println("Especialidad: " + especialidad);
    }


    public void getNivel() {
        System.out.println("Nivel: " + nivel);
    }
     
    //to string
    
    @Override
    public String toString() {
        return "Mecanico{" + "nombre=" + nombre + ", especialidad=" + especialidad + ", nivel=" + nivel + '}';
    }
    
    
    
}
