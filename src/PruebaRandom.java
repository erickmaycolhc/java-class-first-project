import java.util.Scanner;

public class PruebaRandom {
    public static void main(String[] args){

        //Debo recibir nota del curso de matemática y historia  y mostrar el promedio total y si aprobe o no

        //inicializamos las notas
        double algoritmo = 0.0;
        double historia   = 0.0;

        //mandamos a la consola
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese nombre del estudiante: ");

        String estudiante = s.next();
        System.out.println("Ingresar nota de algoritmo : ");
        algoritmo = s.nextDouble();

        System.out.println("Ingresar nota de Historia : ");
        historia   = s.nextDouble();


        //hacemos las operaciones para sacar de el promedio y verificamos si aprueba o desaprueba
        double promedioTotal = (algoritmo + historia) / 2 ;
        String resultado = promedioTotal >= 12.7 ? "Aprobado" : "Desaprobado";


        System.out.println("-------------------------------------");
        System.out.println("promedio total => " + promedioTotal);
        System.out.println("-------------------------------------");
        System.out.println("Nota final de " + estudiante +" => " + resultado + " este ciclo" );


    }
}
