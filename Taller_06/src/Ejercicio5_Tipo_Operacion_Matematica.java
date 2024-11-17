
import java.util.Scanner;


public class Ejercicio5_Tipo_Operacion_Matematica {
    public static void main(String[] args) {
        int num_Operacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO DEL 1 AL 4 PARA UNA OPERACION MATEMATICA: ");
        num_Operacion = tcl.nextInt();
        switch(num_Operacion){
            case 1: System.out.println("LA OPERACION ES: SUMA");
                    break;
            case 2: System.out.println("LA OPERACION ES: RESTA");
                    break;
            case 3: System.out.println("LA OPERACION ES: MULTIPLICACION");
                    break;
            case 4: System.out.println("LA OPERACION ES:DIVISION");
                    break;
            default: System.out.println("NUMERO INCORRECTO!!");       
        }
    }
    
}
/***
 * run:
INGRESE UN NUMERO DEL 1 AL 4 PARA UNA OPERACION MATEMATICA: 3
LA OPERACION ES: MULTIPLICACION
 */