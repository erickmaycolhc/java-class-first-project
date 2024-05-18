import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class calcularEdad {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa fecha de tu nacimiento 'yyyy-MM-dd' : ");

        //modificar el tipo de fecha que queremos recibir
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try{

            //transformamos la fecha que es string a tipo date
            Date fechaDeNacimiento = format.parse(s.nextLine());

            // Obtener la fecha actual
            Calendar calendarioActual = Calendar.getInstance();
            Date fechaActual = calendarioActual.getTime();

            // Calcular la diferencia en años
            Calendar calNacimiento = Calendar.getInstance();
            calNacimiento.setTime(fechaDeNacimiento);
            int años = calendarioActual.get(Calendar.YEAR) - calNacimiento.get(Calendar.YEAR);

            // Verificar si el cumpleaños ya ha ocurrido este año
            if (calendarioActual.get(Calendar.DAY_OF_YEAR) < calNacimiento.get(Calendar.DAY_OF_YEAR)) {
                años--;
            }

            System.out.println("Fecha de nacimiento: " + format.format(fechaDeNacimiento));
            System.out.println("Fecha actual: " + format.format(fechaActual));
            System.out.println("Edad actual: " + años + " años");
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
