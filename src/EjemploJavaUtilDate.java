import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args){

        Date fecha = new Date();

        System.out.println("Fechas => " + fecha);

        SimpleDateFormat updateFormat = new SimpleDateFormat("EEEE dd 'de' YYYY");
        String fechaStr = updateFormat.format(fecha);

        System.out.println("strData => " + fechaStr);


    }
}
