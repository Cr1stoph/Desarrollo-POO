
package airbnbpet;


public abstract class Mascota {
    protected String id;
    protected String nombre;
    protected double peso;
    protected int edad;
    protected int diasAlojamiento;
    protected boolean SupervisionVeterinario;

    public Mascota() {
    }

    public Mascota(String id, String nombre, double peso, int edad, int diasAlojamiento, boolean SupervisionVeterinario) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.diasAlojamiento = diasAlojamiento;
        this.SupervisionVeterinario = SupervisionVeterinario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasAlojamiento() {
        return diasAlojamiento;
    }

    public void setDiasAlojamiento(int diasAlojamiento) {
        this.diasAlojamiento = diasAlojamiento;
    }

    public boolean isSupervisionVeterinario() {
        return SupervisionVeterinario;
    }

    public void setSupervisionVeterinario(boolean SupervisionVeterinario) {
        this.SupervisionVeterinario = SupervisionVeterinario;
    }


    public void mostrarDatos(){
    
    }
     
}
