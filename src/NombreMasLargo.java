import javax.swing.*;

public class NombreMasLargo {
    public static void main(String [] args ){
            String familiar1 = JOptionPane.showInputDialog(null, "Ingrese primer nombre y primer apellido del primer familiar: ");
            String familiar2 = JOptionPane.showInputDialog(null, "Ingrese primer nombre y primer apellido del segundo familiar");
            String familiar3 = JOptionPane.showInputDialog(null, "Ingrese primer nombre y primer apellido del tercer familiar");
            String nombreMasLargo = "";

            nombreMasLargo = (familiar1.length() > familiar2.length()) ? familiar1 : familiar2;
            nombreMasLargo = (nombreMasLargo.length() > familiar3.length()) ? nombreMasLargo : familiar3;


            //String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
            //max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

            System.out.println( nombreMasLargo+ " tiene el nombre mas largo.");
    }
}
