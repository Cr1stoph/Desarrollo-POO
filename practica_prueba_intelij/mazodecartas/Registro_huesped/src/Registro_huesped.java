public class Registro_huesped{
    public static void main(String[] args) {
        Hotel lista = new Hotel();
        lista.agregarHuesped(new Turista("T-01", "Laura", 21, 2, 4,true,true));
        lista.agregarHuesped(new Turista("T-02", "José", 32, 3, 4,false,true));
        lista.agregarHuesped(new Turista("T-03", "Benjamin", 24, 1, 4,true,true));
//--------------------------------------------------------------------------------------------------------------------------------------------------------
        lista.agregarHuesped(new Ejecutivo("E-01", "David", 12, 2, 4,true,4));
        lista.agregarHuesped(new Ejecutivo("T-01", "Laura", 21, 2, 4,true,2));
//--------------------------------------------------------------------------------------------------------------------------------------------------------
        lista.agregarHuesped(new Deportista("T-01", "Laura", 21, 2, 4,false,"Golf"));
        lista.agregarHuesped(new Deportista("T-01", "Laura", 21, 2, 4,true,"Sky"));
        lista.listarHuesped();
        System.out.println("---------------------------------------------------");
        System.out.println("Cantidad de huespedes: " + lista.contarHuesped());
        System.out.println("Costo toal de alojamiento: "+lista.valorTotal());
    }
}