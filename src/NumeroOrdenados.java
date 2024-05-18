import java.util.ArrayList;
import java.util.Scanner;

public class NumeroOrdenados {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);


        System.out.println("Ingresar el primer numero: ");

        int num1 = s.nextInt();

        System.out.println("Ingresar el segundo numero: ");

        int num2 = s.nextInt();


        int max = num1 > num2? num1 : num2;
        int min = num2 > num2 ? num2: num1;
        System.out.println("Numeros ordenados de mayor a menor: " + max + ", " + min);
    }
}
