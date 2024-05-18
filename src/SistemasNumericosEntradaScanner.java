import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //System.in entrada del terminal
        System.out.println("Ingrese un numero entero:");
        String numeroStr = scanner.nextLine(); //dejar esperando a la consola hasta que el usuario ingrese una información
        int numeroDecimal = 0;
        try{
             numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        }catch (Exception e){
            System.out.println("Error debe ingresar un número entero!");
            main(args);
            System.exit(0);

        }
        System.out.println("numeroDecimal =>" + numeroDecimal); //System.out salida del terminal

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);



        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        System.out.println(mensaje);

    }
}
