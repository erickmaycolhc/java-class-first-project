public class ConversionDeTipos {
    public static void main(String[] args){

            // Integer parseInt es para transformar de string a numero
            String numeroStr = "50";
            int numeroInt = Integer.parseInt(numeroStr);
            System.out.println("numeroInt => " + numeroInt);


            String realStr = "789043.99e-4";
            double realDoble = Double.parseDouble(realStr);
            System.out.println("realStr => " + realDoble);


            String logicoStr = "true";
            boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
            System.out.println("logicoBoolean => "+ logicoBoolean);


            // Integer toString es para transformar de numero a string
            int otroNumeroInt = 100;
            System.out.println("otroNumeroInt => " + otroNumeroInt);
            String otroNumeroStr = Integer.toString(otroNumeroInt);
            System.out.println("otroNumeroStr => " + otroNumeroStr);


            otroNumeroStr = String.valueOf(otroNumeroInt +10);
            System.out.println("otroNumeroStr => " + otroNumeroStr);



            double otroRealInt = 1.23456e2;
            String otroRealStr = Double.toString(otroRealInt);
            System.out.println("otroRealStr => " + otroRealStr);

            otroRealStr = String.valueOf(1.23456e2f);
            System.out.println("otroRealStr => " + otroRealStr);
                //tipos de decimales float y double
                //tipos primitos byte, short, int, long
            int i = 32768;
            short s =  (short) i;
            long l = i;

            System.out.println(" short => " + s);
            System.out.println(" long => " + l);

            char b = (char)i;
            System.out.println("b = " + b);

            float f = (float) i;
            System.out.println("f = " + f);








    }
}