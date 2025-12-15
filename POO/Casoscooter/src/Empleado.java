package casoscooter;

public class Empleado {

    // Atributos del empleado
    private String rut;
    private String nombreCompleto;
    private String genero;       // Ej.: "M", "F", "Otro"
    private int aniosServicio;   // Años que lleva en la empresa
    private int edad;            // Edad actual
    private Puesto puesto;       // Cargo del empleado

    // Constructor vacío (permite crear el objeto y luego completar con setters)
    public Empleado() {
    }

    // Constructor completo (opcional para cuando queramos crear todo de una vez)
    public Empleado(String rut, String nombreCompleto, String genero,
                    int aniosServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.aniosServicio = aniosServicio;
        this.edad = edad;
        this.puesto = puesto;
    }

    // Getters y Setters (acceso controlado a los atributos)
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    // toString: representación en texto del empleado (útil para imprimir rápido por consola)
    @Override
    public String toString() {
        String texto = "Empleado{rut='" + rut + "', nombreCompleto='" + nombreCompleto + "', genero='" + genero +
                       "', aniosServicio=" + aniosServicio + ", edad=" + edad + ", puesto=";
        if (puesto == null) {
            texto = texto + "N/A";  // si no tiene puesto asignado
        } else {
            texto = texto + puesto.getNombre();
        }
        texto = texto + "}";
        return texto;
    }
}
