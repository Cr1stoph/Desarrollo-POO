public class Joya {
    //Atributos
    private String codigo;
    private String nombre;
    private String material;

    //Constructores
    public Joya(String codigo, String nombre, String material) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.material = material;
    }
    // geters para consultar datos

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    // Creamos tipo para mostrar que tipo de clase es
    public  String getTipo(){return "Joya";}

    @Override
    public String toString() {
        return "Joya{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
