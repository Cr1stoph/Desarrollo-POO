package tallermecanico;

public class Vehiculo {
    //atributos
    public String patente;
    public String marca;
    public int anio;
    public int kilometraje;
    
    //constructor
    public Vehiculo(String patente, String marca, int anio, int kilometraje) {
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public void getPatente() {
        System.out.println("Patente: " + patente);
    }

    public void getMarca() {
        System.out.println("Marca: "+marca);
    }

    public void getAnio() {
        System.out.println("Anio: " + anio);
    }

    public void getKilometraje() {
        System.out.println("Kilometraje: " + kilometraje);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", anio=" + anio + ", kilometraje=" + kilometraje + '}';
    }
    
    
    
}
