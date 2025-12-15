import  java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lista5 {
    public static void main(String [] args) {
        //eliminar objeto que se repite
        String[] nombres = {"Bob", "Alice", "Charlie", "David", "Eva", "Frank", "Bob", "Liam"};
        List<String> estudiantes = new ArrayList<>(Arrays.asList(nombres));
        System.out.println("Está bob en la lista? " + estudiantes.contains("Bob"));
        System.out.println(estudiantes);

        while (estudiantes.contains("Bob")){
            estudiantes.remove("Bob");
        }
        System.out.println("Está bob en la lista? " + estudiantes.contains("Bob"));
        System.out.println(estudiantes);
    }
}
