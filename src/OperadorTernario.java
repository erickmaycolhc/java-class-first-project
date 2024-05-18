import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args){
        String variable = 7 == 5 ? "Es verdadero" : "Es falso";
        //System.out.println("variable => " + variable);

        String estado = "";
        double promedio = 0.0;

        //inicializamos las notas en 0
        double matematica = 0.0;
        double ciencias   = 0.0;
        double historia   = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematica entre 2,0 - 7.0:");
        matematica = scanner.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2,0 - 7.0:");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2,0 - 7.0:");
        historia = scanner.nextDouble();

        //calculamos el promedio
        promedio = (matematica + ciencias + historia) / 3;

            estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";

        System.out.println("------------------------------------------------");
        System.out.println("Estado => "+ estado );
        System.out.println("Nota general => " + promedio);
        System.out.println("------------------------------------------------");
    }
}
