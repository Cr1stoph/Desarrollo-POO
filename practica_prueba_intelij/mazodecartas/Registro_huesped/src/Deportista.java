public class Deportista extends Huesped implements Costo_alojamiento{
    private String disciplina;

    public Deportista() {
    }





    public Deportista(String id, String nombre, int edad, int dias_estadia, int peso_equipaje, boolean servicio_habitacion_noche, String disciplina) {
        super(id, nombre, edad, dias_estadia, peso_equipaje, servicio_habitacion_noche);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public double valorFinal(int dias){
        double valor_dia = VALOR_FINAL_DIAS - (VALOR_FINAL_DIAS * 0.06) * dias;
        return valor_dia;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Huesped: Deportista : " + getId() + " Nombre: " + getNombre() + " Disciplina: "+getDisciplina() + " Valor total: "+ valorFinal(getDias_estadia()));
    }

    @Override
    public double valorTotal() {
        return valorFinal(getDias_estadia());
    }

}
