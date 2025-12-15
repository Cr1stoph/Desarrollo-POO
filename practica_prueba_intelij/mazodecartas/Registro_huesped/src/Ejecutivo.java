public class Ejecutivo extends  Huesped implements Costo_alojamiento {
    private int cantidad_reuniones;

    public Ejecutivo() {
    }

    public Ejecutivo(String id, String nombre, int edad, int dias_estadia, int peso_equipaje, boolean servicio_habitacion_noche, int cantidad_reuniones) {
        super(id, nombre, edad, dias_estadia, peso_equipaje, servicio_habitacion_noche);
        this.cantidad_reuniones = cantidad_reuniones;
    }

    public int getCantidad_reuniones() {
        return cantidad_reuniones;
    }

    public void setCantidad_reuniones(int cantidad_reuniones) {
        this.cantidad_reuniones = cantidad_reuniones;
    }
    @Override
    public double valorFinal(int dias){
            double valor_dia = (VALOR_FINAL_DIAS * 1.10) * dias;
            return Math.round(valor_dia);
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Huesped: Ejecutivo " + getId() + " Nombre: " + getNombre() + " Reuniones: " + getCantidad_reuniones() + " Valor total: "+ valorFinal(getDias_estadia()));

    }

    @Override
    public double valorTotal() {
        return valorFinal(getDias_estadia());
    }

}
