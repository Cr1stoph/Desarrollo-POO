public class Dog {
    String nombre;
    int edad;

    public Dog(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
