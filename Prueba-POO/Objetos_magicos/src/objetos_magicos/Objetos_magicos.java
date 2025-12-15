package objetos_magicos;
import java.util.Scanner;

public class Objetos_magicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inv = new Inventario();
        
        int opcion = 0;
        while  (opcion != 5){
            System.out.println("==Objetos magicos en la tierra media==");
            System.out.println("[1] - Ingresar objeto");
            System.out.println("[2] - Mostrar informacion");
            System.out.println("[3] - Aplicar ajuste de poder");
            System.out.println("[4] - Infundir energia a mithril");
            System.out.println("[5] - Salir");
            opcion = Integer.parseInt(sc.nextLine());
        
            
        
        if(opcion == 1){
            System.out.println("a) Arma Legendaria");
            System.out.println("b) Joya Legendaria");
            System.out.println("Tipo (a/b)");
            String t = sc.nextLine();
            
            if (t.equalsIgnoreCase("a")) {
                ArmasLegendarias a = new ArmasLegendarias();
                System.out.println("Codigo: ");
                a.setCodigo(sc.nextLine());
                System.out.println("Nombre: ");
                a.setNombre(sc.nextLine());
                System.out.println("Tipo (arma/armadura/joya): ");
                a.setTipo(sc.nextLine());
                System.out.println("Valor de poder magico: ");
                a.setValorDePoderMagico(Integer.parseInt(sc.nextLine()));
                System.out.println("Peso en kilos: ");
                a.setPeso(Double.parseDouble(sc.nextLine()));
                System.out.println("Material: ");
                a.setMaterial(sc.nextLine());
                System.out.println("Encantamiento Especial: ");
                a.setEncantamientEspecial(sc.nextLine());
                inv.agregarObjeto(a);
                
                
            } else if(t.equalsIgnoreCase("b")){
                JoyasLegendarias b = new JoyasLegendarias();
                System.out.println("Codigo: ");
                b.setCodigo(sc.nextLine());
                System.out.println("Nombre: ");
                b.setNombre(sc.nextLine());
                System.out.println("Tipo (arma/armadura/joya): ");
                b.setTipo(sc.nextLine());
                System.out.println("Valor de poder magico: ");
                b.setValorDePoderMagico(Integer.parseInt(sc.nextLine()));
                System.out.println("Peso en kilos: ");
                b.setPeso(Double.parseDouble(sc.nextLine()));
                System.out.println("Metal Precioso (oro/plata/platino) : ");
                b.setMetalPrecioso(sc.nextLine());
                System.out.println("Gema Incrustada (Diamante/ Rubi/ Esmeralda): ");
                b.setGemaIncrustada(sc.nextLine());
                inv.agregarObjeto(b);
            }
        }else if(opcion == 2){
            System.out.println("Ingresa el codigo");
            String codigo = sc.nextLine();
            inv.BuscarObjeto(codigo);
            
        }else if (opcion == 3){
            inv.aplicarAjusteaTodos();
        }else if(opcion == 4){  
            System.out.println("Ingresa el porcentaje para aumentar a mithril (1.22): ");
            inv.infundirEnergia(Integer.parseInt(sc.nextLine()));
        }else if (opcion == 5){System.out.println("Saliendooo...");}
        
        }
    }

}
