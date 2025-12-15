
package airbnbpet;


public class Conejo extends Mascota implements Valores{
    private String tipoComida;

    public Conejo() {
    }
    

    public Conejo(String tipoComida, String id, String nombre, double peso, int edad, int diasAlojamiento, boolean SupervisionVeterinario) {
    super(id, nombre, peso, edad, diasAlojamiento, SupervisionVeterinario);
    this.tipoComida = tipoComida;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public double valorFinal(int dia) {
        double valor = VALOR_DIA_ALOJAMIENTO * 0.93;
        return valor *dia;
    }

@Override
    public void mostrarDatos(){
        System.out.println("Id perro: "+ getId()+" Nombre: " +getNombre()+" Valor total: "+valorFinal(getDiasAlojamiento()));
        }
}
