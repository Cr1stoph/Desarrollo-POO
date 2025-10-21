package mazodecartas2;

public class Mazodecartas2 {
    public static void main(String[] args) {
        Cartas[] mazo = new Cartas[2]; //Crea un array(lista) que no puede crecer, no es flexible
        DeHabilidad h = new DeHabilidad(); //Creando objeeto h
        //El objeto h es de tipo carta de habilidad uso la clase
        //DeHabilidad para constriuirse y usar ese tipo
//-------------------------------------------------------------------------------------------
        h.setCodigo("H-01");
        h.setNombre("Bola de Fuego");
        h.setAtaque(50);
        h.setDefensa(10);
        h.setRareza("rara");
        h.setEfectoEspecial("Quemar");
        h.setCostoMana(3);
        mazo[0] = h; //En el mazo el objeto es asignado a la posicion 0 de lista
//---------------------------------------------------------------------------------------
        
        DeCriaturas c = new DeCriaturas(); //Crea a objeto c con la clase DeCriaturas
        //Con el molde crea el objeto c de tipo carta de criatura
        c.setCodigo("C-01");
        c.setNombre("Smaug");
        c.setAtaque(80);
        c.setDefensa(70);
        c.setRareza("Comun");
        c.setTipoCriatura("Dragon");
        c.setHabilidadPasiva("Volar");
        mazo[1] = c; // se asigna objeto c a la posicion 1 de la lista
//-----------------------------------------------------------------------------------------
//------------Recorremos el MAZO (Lista) ----------------------------------------------
        for (int i = 0; i < mazo.length; i++) {System.out.println(mazo[i]);}
        
    }
    
}
