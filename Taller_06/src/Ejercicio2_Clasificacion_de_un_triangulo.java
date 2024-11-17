
import java.util.Scanner;

public class Ejercicio2_Clasificacion_de_un_triangulo {

    public static void main(String[] args) {
        int la_trian1, la_trian2, la_trian3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE TRES LADOS DE UN TRIANGULO: ");
        la_trian1 = tcl.nextInt();
        la_trian2 = tcl.nextInt();
        la_trian3 = tcl.nextInt();
        if ((la_trian1 + la_trian2) > la_trian3 && (la_trian1 + la_trian3) > la_trian2 && (la_trian2 + la_trian3) > la_trian1) {
            if (la_trian1 == la_trian2 && la_trian2 == la_trian3) {
                System.out.println("TRIANGULO EQUILATERO");
            } else {
                if (la_trian1 == la_trian2 || la_trian1 == la_trian3 || la_trian2 == la_trian3) {
                    System.out.println("TRIANFULO ISOSCELES");
                } else {
                    System.out.println("TRIANGULO ESCALENO");
                }
            }
        } else {
            System.out.println("NO ES UN TRIANGULO!!");
        }

    }
}
/***
 * run:
INGRESE TRES LADOS DE UN TRIANGULO: 3 3 1
TRIANFULO ISOSCELES
 */