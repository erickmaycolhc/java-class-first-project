import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args){

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número");
            main(args);
            System.exit(0);

        }
        System.out.println("numeroDecimal =>" + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario = 0b11110;
        System.out.println("numerobINARIO = "+ numeroBinario);


        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroBinario);
        System.out.println(resultadoOctal);
        int numerOctal = 0764;
        System.out.println("numeroOctal = " + numerOctal);

        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = "+ numeroHex);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
