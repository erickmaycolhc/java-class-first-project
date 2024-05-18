import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaManejoNombres {
    public static void main(String[] args){
     /*   String nombre1 = "Carmen";
        String nombre2 = "Josue";
        String nombre3 = "Antony";

        System.out.println( nombre1.replace("Carmen","A.en") + "_" + nombre2.replace("Josue", "O.ue") + "_" + nombre3.replace("Antony","N.ny"));
      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de un familiar: ");

        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese nombre del segundo familiar");

        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese nombre del tercer familiar");

        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println("resultado = " + resultado);

    }
}
