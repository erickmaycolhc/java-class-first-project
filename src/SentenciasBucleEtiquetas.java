public class SentenciasBucleEtiquetas {
    public static void main(String[] args){
        bucle:
        for(int dia = 0;  dia <= 7; dia++){ // dias de la semana
            int horas = 1;
            while(horas <= 8){  //horas de trabajo
                if(dia == 6 || dia == 7){ // si es sabado o domingo
                    System.out.println("Día => " + dia + ": descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Día => " + dia + " trabajando a las " + horas + " hrs. ");
                horas++;
            }
        }


        System.out.println("\n-----------------------------------------------------------");

        bucle1:
        for(int i = 0; i < 5; i++){
            System.out.println();
            int j = 0;
            while( j < 5){
                if( i == 2){
                    continue bucle1;
                }
                System.out.print("[i => " + i + ", j => " + j + "],");
                j++;
            }
        }
        System.out.println("\n----------------------------------------------------------");
        etiqueta:
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                if( i == 2){
                    break etiqueta;
                }
                System.out.print("[i => " + i + ", j => " + j + "],");
            }
        }
    }
}


