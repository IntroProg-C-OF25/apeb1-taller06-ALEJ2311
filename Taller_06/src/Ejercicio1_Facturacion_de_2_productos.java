
import java.util.Scanner;
public class Ejercicio1_Facturacion_de_2_productos {
    public static void main(String[] args) {
        double pr1, pr2, costEnvio, iva, desc = 0, subTotal, costFinal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el costo de los dos productos + el costo del envio: ");
        pr1 = tcl.nextDouble();
        pr2 = tcl.nextDouble();
        costEnvio = tcl.nextDouble();
        iva = (pr1 + pr2) * 0.10;
        subTotal = iva + (pr1 + pr2);
        if(subTotal == 1000){
            desc = 0.05;
        }else{
            if(subTotal > 1000){
                desc = 0.20;
            }
        }
        desc *= subTotal;
        if(subTotal >= 5000){
            costEnvio = 0;
        }
        costFinal = subTotal - desc + costEnvio;
        System.out.println("SUBTOTAL: " + subTotal);
        System.out.println("IVA: " + iva);
        System.out.println("DESCUENTO: " + desc);
        System.out.println("COSTO FINAL: " + costFinal);
        
    }
   
}
/***
 * run:
Ingrese el costo de los dos productos + el costo del envio: 4990 10 50
SUBTOTAL: 5500.0
IVA: 500.0
DESCUENTO: 1100.0
COSTO FINAL: 4400.0
 */