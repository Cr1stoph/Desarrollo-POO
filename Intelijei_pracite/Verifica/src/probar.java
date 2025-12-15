import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class probar {
    public void calcular() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int num1 = sc.nextInt();

        int num2;
        do {
            System.out.println("ingresa numero 2");
            num2 = sc.nextInt();
            if (num2 == 0){
                System.out.println("Error, El numero no debe ser 0");
            }
        } while (num2 == 0);
    }


}
