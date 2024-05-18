import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class compararFechas {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingresa una fecha1 con este formato 'yyyy-MM-dd' : ");

        try{
            Date fecha1 = format.parse(s.nextLine());
            System.out.println("fecha => " + fecha1);
            System.out.println("fecha => " + format.format(fecha1));

            System.out.println("Ingresa una fecha2 con este formato 'yyyy-MM-dd' : ");
            Date fecha2 = format.parse(s.nextLine());

            if(fecha1.after(fecha2)){
                System.out.println("Fecha1 es despues que fecha2 ");
            }
            else if (fecha1.before(fecha2)) {
                System.out.println("Fecha1 es antes que fecha2");
            }
            else if (fecha1.equals(fecha2)) {
                System.out.println("Fecha1 es igual que fecha2");
            }

            if(fecha1.compareTo(fecha2) > 0){
                System.out.println("Fecha1 es despues que fecha2 ");
            }
            else if (fecha1.compareTo(fecha2) < 0) {
                System.out.println("Fecha1 es antes que fecha2");
            }
            else if (fecha1.compareTo(fecha2) == 0) {
                System.out.println("Fecha1 es igual que fecha2");
            }

        }catch(ParseException e){
            e.printStackTrace();
        }

    }

}
