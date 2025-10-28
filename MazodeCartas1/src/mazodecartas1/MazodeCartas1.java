package mazodecartas1;

public class MazodeCartas1 {
    public static void main(String[] args) {
        //Creamos el objeto h que es una carta tipo hablidad
        DeHabilidad h = new DeHabilidad();
        h.setCodigo("H-01");
        h.setNombre("Bola de Fuego");
        h.setAtaque(50);
        h.setDefensa(10);
        h.setRareza("rara");
        h.setEfectoEspecial("Quemar");
        h.setCostoMana(3);
        System.out.println(h);
       
        //Creamos el objeto c que es una carta tipó Criatura
        DeCriaturas c = new DeCriaturas();
        c.setCodigo("C-01");
        c.setNombre("Smaug");
        c.setAtaque(80);
        c.setDefensa(70);
        c.setRareza("Legendaria");
        c.setTipoCriatura("dragon");
        c.setHabilidadPasiva("volar");
        System.out.println(c);      
        
    }
    
}
