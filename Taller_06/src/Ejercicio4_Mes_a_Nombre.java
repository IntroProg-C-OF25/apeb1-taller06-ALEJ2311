
import java.util.Scanner;


public class Ejercicio4_Mes_a_Nombre {
    public static void main(String[] args) {
        int num_mes;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO DEL 1 AL 12: ");
        num_mes = tcl.nextInt();
        switch(num_mes){
            case 1: System.out.println("ENERO");
                break;
            case 2: System.out.println("FEBRERO");   
                break;
            case 3: System.out.println("MARZO");    
                break;
            case 4: System.out.println("ABRIL");    
                break;
            case 5: System.out.println("MAYO");    
                break;
            case 6: System.out.println("JUNIO");
                break;
            case 7: System.out.println("JULIO");    
                break;
            case 8: System.out.println("AGOSTO");
                break;
            case 9: System.out.println("SEPTIEMBRE");    
                break;
            case 10: System.out.println("OCTUBRE");    
                break;
            case 11: System.out.println("NOVIEMBRE");    
                break;
            case 12: System.out.println("DICIEMBRE");
                break;
            default : System.out.println("NUMERO INCORRECTO!!");
        }   
    }
    
}
/***
 * run:
INGRESE UN NUMERO DEL 1 AL 12: 2
FEBRERO
 */