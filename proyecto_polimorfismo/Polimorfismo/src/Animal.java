//superClase base de herencia y polimorfismo

public abstract class Animal implements Sonoro {
    @Override
    public void  hacerSonido(){ //metodo (Funcion de clase)
        System.out.println("Sonido generico de animal");
        //public: cualquiera puede llamar
        //void: no devuelve valor
        //hacerSoindo: nombre del metodo
    }
}

//Aunque no tiene atributos ni contructores la clase igual es válida
//Aunque no tiene constructor definido JAVA le asigna uno (new Animal) funciona

