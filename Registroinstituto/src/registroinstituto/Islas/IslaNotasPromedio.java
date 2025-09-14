package registroinstituto.Islas;
import java.util.Scanner;
public class IslaNotasPromedio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //do while hasta que esté en rango
        
        //nota 1
        double nota;
        do
        {
            System.out.println("Ingrese Nota 1 (1.0 - 7.0)");
            nota = sc.nextDouble(); //limpia salto de linea
            sc.nextLine();
        } while (nota < 1.0 || nota > 7.0);
        
        //nota 2
        double nota2;
        do
        {
            System.out.println("Ingrese Nota 1 (1.0 - 7.0)");
            nota2 = sc.nextDouble(); //limpia salto de linea
            sc.nextLine();
        } while (nota2 < 1.0 || nota2 > 7.0);
        
        //ntoa3
        double nota3;
        do
        {
            System.out.println("Ingrese Nota 1 (1.0 - 7.0)");
            nota3 = sc.nextDouble(); //limpia salto de linea
            sc.nextLine();
        } while (nota3 < 1.0 || nota3 > 7.0);
        
        //promedio
        double promedio = (nota + nota2 +nota3) / 3.0;
        System.out.println("Notas ingredas: " + nota + nota2 + nota3);
        System.out.println("Promedio: "+ promedio); 
    }
}