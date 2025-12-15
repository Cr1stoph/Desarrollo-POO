//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //objeto scanner

        System.out.println("Ingresa un numero");
        int num1 = sc.nextInt();

        System.out.println("Ingresa un segundo numero");
        int num2 = sc.nextInt();
        if (num1 > 0) {
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            double division = (double)num1/num2;

            System.out.println("suma: " + suma);
            System.out.println("resta: " + resta);
            System.out.println("multiplicacion: " + multiplicacion);
            System.out.println("division: " + division);
        } else {System.out.println("El numero ingresado debe ser positivo");}
    }
}