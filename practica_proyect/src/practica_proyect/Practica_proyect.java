package practica_proyect;

 //@author roame
public class Practica_proyect {

    public static void main(String[] args) {
        //logic
        Persona p1 = new Persona("Juan","vera",23,111111111);
        Persona p2 = new Persona("Ana","Flan",24,222222222);
        
        
        p1.getApellido();
        p2.getEdad();
        
        if (p1.edad > 24) {
            System.out.println("eres mayor a 12 bro");
            
        } else{
            System.out.println(" eres menor bro");
        } if (p1.nombre.equals("Juan")) {
            System.out.println("Claro bro, eres Juan xd");
            
        } else {
            System.out.println("Bro, no eres juan");
        } if () {
            
        }
    }
}
