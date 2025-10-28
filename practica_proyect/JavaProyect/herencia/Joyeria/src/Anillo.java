public class Anillo extends Joya{
    //Atributos diferente que teine con joya
    private int medida;

    public Anillo(String codigo, String nombre, String material, int medida) {
        super(codigo, nombre, material);
        this.medida = medida;
    }
}
