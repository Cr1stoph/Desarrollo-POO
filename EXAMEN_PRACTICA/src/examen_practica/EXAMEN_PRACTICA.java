package examen_practica;

import controlador.GestorEquipos;
import datos.Inventario;
import vista.pantalla;

public class EXAMEN_PRACTICA {

    public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventario inventario = new Inventario();
                GestorEquipos gestor = new GestorEquipos(inventario);
                new pantalla(gestor).setVisible(true);
            }
        });
        
    }

}
