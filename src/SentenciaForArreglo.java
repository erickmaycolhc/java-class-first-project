import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args){

        String[] nombres = {"Maycol", "Josue", "Antony", "Ariana", "Carmen"};

        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("Maycol") || nombres[i].equalsIgnoreCase("Carmen")){
                continue;
            };

            /*if(nombres[i].toLowerCase().contains("maycol") || nombres[i].toLowerCase().contains("carmen")){
                continue;
            };*/
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, \"Josue\" o \"Ariana\" : ");

        boolean  encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){ //si buscar coincide con el nombre ingresado entonces encontrado es true
                encontrado = true;
                break;
            }
            System.out.println("nombres => " + nombres[i]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar +" fue encontrado");
        }
        else{
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }

    }
}
