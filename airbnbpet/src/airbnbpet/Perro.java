
package airbnbpet;


public class Perro extends Mascota implements Valores{
    //atributo
    private int Ejercicio;

    public Perro() {
    }
    

    public Perro(int Ejercicio, String id, String nombre, double peso, int edad, int diasAlojamiento, boolean SupervisionVeterinario) {
        super(id, nombre, peso, edad, diasAlojamiento, SupervisionVeterinario);
        this.Ejercicio = Ejercicio;
    }

    public int getEjercicio() {
        return Ejercicio;
    }

    public void setEjercicio(int Ejercicio) {
        this.Ejercicio = Ejercicio;
    }
    
    @Override
    public double valorFinal(int dia) {
        if(Ejercicio>3){double valor = VALOR_DIA_ALOJAMIENTO*1.07;
        return  valor*dia;}
        else{
        double valor = dia;
        return  valor*VALOR_DIA_ALOJAMIENTO;
        }
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Id perro: "+ getId()+" Nombre: " +getNombre()+" Dias de ejercicio: "+getEjercicio()+" Valor total: "+valorFinal(getDiasAlojamiento()));
        }
}
    

