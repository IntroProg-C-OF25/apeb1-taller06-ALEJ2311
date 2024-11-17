
import java.util.Scanner;


public class Ejercicio3_Costo_envio_Paquetes {
    public static void main(String[] args) {
        int peso, cost;
        String region;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE EL PESO DE SU PAQUETE: ");
        peso = tcl.nextInt();
        System.out.print("INRESE SU REGION: ");
        region = tcl.next();
        if(peso < 5 && region.equalsIgnoreCase("local")){
            cost = 5;
        }else{
            if(peso >= 5 && peso <= 10 && region.equalsIgnoreCase("nacional")){
                cost = 10;
            }else{
                cost = 15;
            }
        }
        System.out.println("SU COSTO DE INVIO DE PAQUETE SERA DE: $" + cost);
    }
    
}
/**+
 * run:
INGRESE EL PESO DE SU PAQUETE: 6
INRESE SU REGION: NACIONAL
SU COSTO DE INVIO DE PAQUETE SERA DE: $10
 */