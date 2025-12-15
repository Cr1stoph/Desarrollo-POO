
package airbnbpet;


public class Gato extends Mascota implements Valores{
    
    private int pedigri;

    public Gato() {
    }

    public Gato(int pedigri, String id, String nombre, double peso, int edad, int diasAlojamiento, boolean SupervisionVeterinario) {
        super(id, nombre, peso, edad, diasAlojamiento, SupervisionVeterinario);
        this.pedigri = pedigri;
    }

    public int getPedigri() {
        return pedigri;
    }

    public void setPedigri(int pedigri) {
        this.pedigri = pedigri;
    }

    @Override
    public double valorFinal(int dia) {
        double valor = VALOR_DIA_ALOJAMIENTO *1.05;
        return valor*dia;
        
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Id Gato: "+ getId()+" Nombre: " +getNombre()+" Valor total: "+valorFinal(getDiasAlojamiento()));
        }
}
