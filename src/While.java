public class While {
    public static void main(String[] args){

        int  i = 0;
        /*while(i <= 5){
            System.out.println("i => " + i);
            i++;
        }*/

        i = 0;                                        //while  sólo se pasa a ejecutar su contenido si se comprueba una condición lo que puede ocurrir 0, 1 o más veces.
        boolean prueba = true;

        while(prueba){
            if(i == 7){
                prueba = false;
            }
            System.out.println("i => " + i );
            i++;
        }



       prueba = true;                                 // do while  nos aseguramos de que el contenido sea ejecutado al menos una vez, es decir que aunque
        i = 0;                                        // su condición no se cumpla, su contenido se ejecuta.

        do{
            if(i == 10){
                prueba = false;
            }
            System.out.println("i => " + i);
            i++;
        }while(prueba);
    }
}
