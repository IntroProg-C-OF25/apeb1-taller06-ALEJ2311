
import java.util.Scanner;


public class Resolucion_Examen_Parcial1 {
    public static void main(String[] args) {
        double acd1, acd2, ape1, ape2, aa1, aa2, bim1, bim2, totalFinal, acu, recu=0, nFinal;
        String estado;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME 6 NOTAS: ");
        acd1 = tcl.nextDouble();
        ape1 = tcl.nextDouble();
        aa1 = tcl.nextDouble();
        acd2 = tcl.nextDouble();
        ape2 = tcl.nextDouble();
        aa2 = tcl.nextDouble();
        bim1 = (acd1 + ape1 + aa1);
        bim2 = (acd2 + ape2 + aa2);
        acu = (aa1 + aa2)/2;
        totalFinal = (bim1 + bim2) / 2;
        nFinal = totalFinal;
        if (totalFinal < 6.5) {
            System.out.print("Esta en suple, dame tu nota: ");
            recu = tcl.nextDouble();
            nFinal = (acu + recu);
            
        }
        estado =(nFinal < 6.5 ) ? "REPRBADO" : "APROBADO";
        System.out.printf("%s\t%s\t%s\t%s\t%s"
                + "\t%s\t%s\t%s\t%s"
                + "\t%s\t%s\t%s\t%s\t%s\n",
                "NOMBRES","ACDB1","APB1","AAB1","BIM1",
                "ACDB2","APB2","AAB2","BIM2",
                "TOTALFIN","ACU30","RECU","FINAL","ESTADO");
        System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f"
                + "\t%.2f\t%.2f\t%.2f\t%.2f"
                + "\t%.2f\t%.2f\t%.2f\t%.2f\t%s\n",
                "Cris",acd1,ape1,aa1,bim1,
                acd2,ape2,aa2,bim2,
                totalFinal,acu,recu,nFinal,estado);
    }
    
}
