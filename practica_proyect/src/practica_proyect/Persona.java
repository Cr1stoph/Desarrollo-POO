package practica_proyect;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    public int fono;
    //constructores
    public Persona(String nombre, String apellido, int edad, int fono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fono = fono;
    }
    //getter and setter
    public void getNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public void getApellido() {
        System.out.println("Apellido:" + apellido);
    }

    public void getEdad() {
        System.out.println("Edad: " + edad);
    }

    public void getFono() {
        System.out.println("Fono: "+fono);
    }


    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", fono=" + fono + '}';
    }
    
    
    
}
