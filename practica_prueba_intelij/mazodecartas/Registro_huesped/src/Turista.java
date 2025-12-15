public class Turista extends Huesped implements Costo_alojamiento{
    private boolean excursiones;

    public Turista() {
    }

    public Turista(String id, String nombre, int edad, int dias_estadia, int peso_equipaje, boolean servicio_habitacion_noche, boolean excursiones) {
        super(id, nombre, edad, dias_estadia, peso_equipaje, servicio_habitacion_noche);
        this.excursiones = excursiones;
    }

    public boolean isExcursiones() {
        return excursiones;
    }

    public void setExcursiones(boolean excursiones) {
        this.excursiones = excursiones;
    }

    @Override
    public double valorFinal(int dias){
        if (excursiones){
            double valor_dia = (VALOR_FINAL_DIAS * 1.08) * dias;
            return valor_dia;
        }
        return VALOR_FINAL_DIAS * dias;
    }
    public String excursion(boolean excursiones) {
        if (excursiones) {
            return "si";
        }
        return "no";
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Huesped: Deportista: " + getId() + " Nombre: " + getNombre() + " excursiones: " + excursion(isExcursiones()) + " Valor total: $"+ valorFinal(getDias_estadia()));

    }

    @Override
    public double valorTotal() {
        return valorFinal(getDias_estadia());

    }

}
