public abstract class Huesped {
    private String id; //Alfanumerico y unico
    private String nombre;
    private int edad;
    private int dias_estadia;
    private int peso_equipaje;
    private boolean servicio_habitacion_noche;

    public Huesped() {
    }

    public Huesped(String id, String nombre, int edad, int dias_estadia, int peso_equipaje, boolean servicio_habitacion_noche) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dias_estadia = dias_estadia;
        this.peso_equipaje = peso_equipaje;
        this.servicio_habitacion_noche = servicio_habitacion_noche;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public int getDias_estadia() {return dias_estadia;}
    public void setDias_estadia(int dias_estadia) {this.dias_estadia = dias_estadia;}

    public int getPeso_equipaje() {return peso_equipaje;}
    public void setPeso_equipaje(int peso_equipaje) {this.peso_equipaje = peso_equipaje;}

    public boolean isServicio_habitacion_noche() {return servicio_habitacion_noche;}
    public void setServicio_habitacion_noche(boolean servicio_habitacion_noche) {this.servicio_habitacion_noche = servicio_habitacion_noche;}
    public abstract void mostrarDatos();
    public abstract double valorTotal();
}
