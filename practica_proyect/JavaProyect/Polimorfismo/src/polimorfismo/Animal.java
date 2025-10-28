package polimorfismo;

// Superclase: base para herencia y polimorfismo
public class Animal { //Es un método (técnicamente, una función miembro de la clase)
    public void hacerSonido() { //No recibe parámetros.
    //public: cualquiera puede llamarlo. 
    //void: no devuelve valor.
    //hacerSonido: nombre del método.
        System.out.println("Sonido generico de animal");
    }
}

//Otras consideraciones
//Es de instancia (no tiene static), por eso se invoca sobre un objeto:
//Animal a = new Animal(); a.hacerSonido();
//Aunque no definiste atributos ni constructores, la clase es válida. 
//Java te da un constructor por defecto (new Animal() funciona).
//Este método es el que sobrescriben las subclases (Perro, Gato) para demostrar polimorfismo: