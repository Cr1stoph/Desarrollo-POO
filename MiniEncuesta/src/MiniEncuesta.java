//Desde aqui se ejecuta la app
public class MiniEncuesta {//definimos la clase principal
    public static void main(String[] args) {//Metodo main que se ejecuta primero
        //Vamos a utilizar eventos Swing para crear y mostrar interfaaz grafica
        java.awt.EventQueue.invokeLater(new Runnable() {//Clase anonima de tipo runnable
            //Que se ejecuta en el hilo de eventos
        @Override //Sobreescribimos el metodo run() del Runnable
            public void run(){
                //Metodo que ejecutará la aplicacion cuando
                // el hilo de instrucciones se ponga en marcha
                new VentanaEncuesta().setVisible(true); //Creamos una instancia
                //de la clase Ventana y la mostramos en  pantalla

            }
        }); //Se cierra el paréntecis abierto de Runnable
    } //LLave que cierra el main (La aplicacion para ajecutar)
}//Llave que cierra la clase principal