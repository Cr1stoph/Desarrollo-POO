package mazodecartas4;
import java.util.Scanner;

public class Mazodecartas4 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        GestorDeMazo gestor = new GestorDeMazo(); 
        int opcion = -1; 
        while(opcion != 6){ 
            System.out.println("\n== MAZO DE CARTAS =="); 
            System.out.println("1) Ingresar Carta (Habilidad o Criatura)"); 
            System.out.println("2) Aplicar Ajuste (10% a rareza 'rara')"); 
            System.out.println("3) Bonificar Leyenda (+20% legendaria+dragon)"); 
            System.out.println("4) Contar Habilidades por Mana"); 
            System.out.println("5) Mostrartodas las cartas");
            System.out.println("6) Salir"); 
            System.out.print("Opcion: "); 
            opcion = Integer.parseInt(sc.nextLine()); 
            
            if(opcion == 1){ 
                System.out.println("  a) Habilidad"); 
                System.out.println("  b) Criatura"); 
                System.out.print("Tipo (a/b): "); 
                String t = sc.nextLine();
                
                if(t.equalsIgnoreCase("a")){ 
                    DeHabilidad h = new DeHabilidad(); 
                    System.out.print("Codigo: "); 
                    h.setCodigo(sc.nextLine()); 
                    System.out.print("Nombre: "); 
                    h.setNombre(sc.nextLine()); 
                    System.out.print("Ataque: "); 
                    h.setAtaque(Integer.parseInt(sc.nextLine())); 
                    System.out.print("Defensa: "); 
                    h.setDefensa(Integer.parseInt(sc.nextLine())); 
                    System.out.print("Rareza (comun/rara/legendaria): "); 
                    h.setRareza(sc.nextLine()); 
                    System.out.print("Efecto: "); 
                    h.setEfectoEspecial(sc.nextLine()); 
                    System.out.print("Costo de mana (entero): "); 
                    h.setCostoMana(Integer.parseInt(sc.nextLine())); 
                    gestor.agregarCarta(h);
                    
                } else if(t.equalsIgnoreCase("b")){ 
                    DeCriaturas c = new DeCriaturas(); 
                    System.out.print("Codigo: "); 
                    c.setCodigo(sc.nextLine()); 
                    System.out.print("Nombre: "); 
                    c.setNombre(sc.nextLine()); 
                    System.out.print("Ataque: "); 
                    c.setAtaque(Integer.parseInt(sc.nextLine())); 
                    System.out.print("Defensa: "); 
                    c.setDefensa(Integer.parseInt(sc.nextLine())); 
                    System.out.print("Rareza (comun/rara/legendaria): "); 
                    c.setRareza(sc.nextLine()); 
                    System.out.print("Tipo de criatura (dragon/elfo/guerrero/...): "); 
                    c.setTipoCriatura(sc.nextLine()); 
                    System.out.print("Habilidad pasiva: "); 
                    c.setHabilidadPasiva(sc.nextLine()); 
                    gestor.agregarCarta(c); 
                }
                
                gestor.listar(); 
            
            } else if(opcion==2){ 
                gestor.aplicarAumentoMazo(); 
                gestor.listar(); 
            
            } else if(opcion==3){ 
                gestor.bonificarCartas(); 
                gestor.listar(); 
            
            } else if(opcion==4){ 
                System.out.print("Mana a contar (entero): "); 
                int m = Integer.parseInt(sc.nextLine()); 
                int total=gestor.contarHabilidadesPorMana(m); 
                System.out.println("Habilidades con mana " + m + ": "+total); 
            
            } else if(opcion==5){
                gestor.listar(); 
                
            } else if (opcion == 6){
                System.out.println("Saliendoo...");
            }
        } 
        sc.close(); 
    } 
}