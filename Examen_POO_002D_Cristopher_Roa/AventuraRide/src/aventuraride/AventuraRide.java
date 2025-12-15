package aventuraride;
import controlador.GestionVehiculos;
import datos.Inventario;
import vista.Pantalla;
public class AventuraRide {

    public static void main(String[] args) {
                        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventario inventario = new Inventario();
                GestionVehiculos gestor = new GestionVehiculos(inventario);
                new Pantalla(gestor).setVisible(true);
            }
        });
    }
    
}
