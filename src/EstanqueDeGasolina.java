import java.util.Scanner;

public class EstanqueDeGasolina {
    public static void main(String[] args){
        String estanqueActual = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la capacidad actual del estanque (máx 70 litros): ");
        int medidaActual = s.nextInt();


        if(medidaActual == 70) estanqueActual = "Estanque lleno";
        else if (medidaActual >= 60 && medidaActual < 70) estanqueActual = "Estanque casi lleno";
        else if (medidaActual >= 40 && medidaActual < 60) estanqueActual = "Estanque 3/4";
        else if (medidaActual >= 35 && medidaActual < 40) estanqueActual = "Medio estanque";
        else if (medidaActual >= 20 && medidaActual < 35) estanqueActual = "Suficiente";
        else if (medidaActual >= 1  && medidaActual < 20) estanqueActual = "Insuficiente";


        System.out.println("-------------------------------------------------");
        System.out.println("Estanque Actual => " + medidaActual+ " Litros - " + estanqueActual);
        System.out.println("-------------------------------------------------");


    }
}





   /*if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque  3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        }*/