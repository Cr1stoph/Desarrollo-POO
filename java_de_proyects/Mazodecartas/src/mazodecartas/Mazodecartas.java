package mazodecartas;

public class Mazodecartas {
    public static void main(String[] args) {
        Cartas[] mazo = new Cartas[3];
/*      Se crea lista llamada mazo con 3 espacio
        lista para ir guardando las cartas en memoria de esa forma 
        puede ser llamada despues para mostrarlas
        Creamos un objeto de tipo habilidad con nombre b
----------------------------------------------------------------------*/      
        DeHabilidad h = new DeHabilidad();
//-----Ahora llenamos manualmente los datos de esta carta "h"----
        h.setCodigo("H-01");
        h.setNombre("Bola de fuego");
        h.setAtaque(50);
        h.setDefensa(10);
        h.setRareza("rara");
        h.setEfectoEspecial("Quemar");
        h.setCostoMana(3);
        //Asignamos la carta "h" a una posicion de la lista
        mazo[0] = h;
//-------------------------------------------------------------------
        DeCriaturas c = new DeCriaturas();
//------LLenamos manualmente los datos de esta carta------------------
        c.setCodigo("C-01");
        c.setNombre("Smaug");
        c.setAtaque(80);
        c.setDefensa(70);
        c.setRareza("Legendaria");
        c.setTipoCriatura("Dragon");
        c.setHabilidadPasiva("Volar");
        mazo[1] = c;
//--------------Aplicamos el bono Legendario-------------------------
        boolean aplicado1 = c.bonoLegendario();
        System.out.println("Caso 1 aplicado: " + aplicado1);
        
//--------------------------------------------------------------------
//-------Recorrer la lista con los objetos Carta
//-------Cada carta irá mostrando sus datos heredados y los suyos propios
        for (int i = 0; i < mazo.length; i++) {//Recorre lña lista hasta llegar a su maximo
            System.out.println(mazo[i]); //Mostramos por pantalla
        }
    }
}
