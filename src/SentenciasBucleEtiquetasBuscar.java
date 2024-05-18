public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args){

        //añadir otro for para contar la cantidad de palabras según la palabra que ingreses

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigal";

        int fraseMax = frase.length();
        int palabraMax = palabra.length();

        int cantidad = 0;
        char letra   = 't';

        buscar:
        for(int i = 0; i < fraseMax; i++){
                int k = i;

                for(int j = 0; j < palabraMax; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){  //si es diferente de la letra continua pero si es igual aumenta el contador
                       continue buscar;
                }
            }
            cantidad++; //aumentar las veces que encuentra la letra
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra "+ palabra + " en la frase");
    }
}
