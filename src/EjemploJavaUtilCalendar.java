import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args){

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2023, 12,24);

        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, 11); //0 = Enero , Febrero = 1
        calendario.set(Calendar.DAY_OF_MONTH, 24);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);


        Date fecha = calendario.getTime();
        System.out.println("calendario => " + fecha);

        SimpleDateFormat OtroFormato = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss:SSS a");
        String fechaTipo2 = OtroFormato.format(fecha);
        System.out.println("OtroFormato => " + fechaTipo2);
    }
}
