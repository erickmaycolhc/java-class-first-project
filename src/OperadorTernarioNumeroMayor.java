import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args){

        //inicializamos el contador max en 0
        int max = 0;

        Scanner s = new Scanner(System.in);

        //Ingresar número
        System.out.println("Ingrese un número: ");
        int num1 = s.nextInt();

        System.out.println("Ingrese segundo número: ");
        int num2 = s.nextInt();

        System.out.println("Ingrese tercer número: ");
        int num3 = s.nextInt();


        //Verificamos el número mayor
        max = (num1 > num2) ? num1 : num2 ;
        max = (max > num3) ? max: num3;

        System.out.println("-------------------");
        System.out.println("num1 => " + num1);
        System.out.println("num2 => " + num2);
        System.out.println("num3 => " + num3);
        System.out.println("El número mayor es => " + max);
        System.out.println("-------------------");


    }
}
