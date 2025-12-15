package airbnbpet;

public abstract class Mascota {
    private String nombre;
    private int peso, edad, dias_aloj;

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getPeso() {return peso;}
    public void setPeso(int peso) {this.peso = peso;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public int getDias_aloj() {return dias_aloj;}
    public void setDias_aloj(int dias_aloj) {this.dias_aloj = dias_aloj;}

    @Override
    public String toString() {
        return "Mascota" + " nombre = " + nombre + ", peso = " + peso + ", edad = " + edad + ", dias_aloj = " + dias_aloj;
    }
    
    
    
}
